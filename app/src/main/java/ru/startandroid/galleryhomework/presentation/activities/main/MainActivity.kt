package ru.startandroid.galleryhomework.presentation.activities.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.bumptech.glide.Glide
import ru.startandroid.galleryhomework.R
import ru.startandroid.galleryhomework.presentation.activities.detail.DetailActivity

class MainActivity : AppCompatActivity() {

    lateinit var btnGallery: Button
    lateinit var ivPic: ImageView
    lateinit var ivPicAdress: String
    lateinit var intentGallery: Intent


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        intentGallery = Intent(this, DetailActivity::class.java)
        ivPic = findViewById(R.id.ivPic)
        btnGallery = findViewById(R.id.btnGallery)
        ivPicAdress =
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTE9qypwuA-Xz-ogzhtgFbJv-3l6RKzliOyycWIo0KtuEXioXJM&s"
        loadPicture()
        btnGallery.setOnClickListener { startActivity(intentGallery) }
    }

    private fun loadPicture() {
        Glide.with(this).load(ivPicAdress).into(ivPic)
    }
}

