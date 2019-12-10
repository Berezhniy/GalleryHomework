package ru.startandroid.galleryhomework.presentation.activities.detail

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import ru.startandroid.galleryhomework.R
import ru.startandroid.galleryhomework.presentation.adapter.GalleryArrayAdapter
import ru.startandroid.galleryhomework.repository.data_source.entity.model.DataClass.imageArray
import ru.startandroid.galleryhomework.repository.data_source.entity.model.Gallery

class DetailActivity : AppCompatActivity() {

    var pictures = imageArray

    var galleryList = ArrayList<Gallery>()

    val galleryArrayAdapter = GalleryArrayAdapter()

    lateinit var recyclerView: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)


        setUI()
    }

    private fun initGallery() {
        for (i in 0..11) {
            val uri = Uri.parse(pictures[i])
            galleryList.add(Gallery(uri))
        }
    }

    private fun setUI() {
        recyclerView = findViewById(R.id.recycler)
        val columnCount = 3
        val gridLayoutManager = GridLayoutManager(this, columnCount)
        recyclerView.layoutManager = gridLayoutManager
        recyclerView.itemAnimator = DefaultItemAnimator()
        recyclerView.adapter = galleryArrayAdapter

        initGallery()
        galleryArrayAdapter.addItems(galleryList)
    }
}

