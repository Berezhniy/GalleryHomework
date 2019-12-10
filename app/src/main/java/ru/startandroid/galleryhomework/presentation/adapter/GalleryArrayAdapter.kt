package ru.startandroid.galleryhomework.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ru.startandroid.galleryhomework.R
import ru.startandroid.galleryhomework.repository.data_source.entity.model.Gallery


class GalleryArrayAdapter : RecyclerView.Adapter<GalleryViewHolder>() {

    private val galleryList: ArrayList<Gallery>?

    init {
        this.galleryList = ArrayList()
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GalleryViewHolder {
   val view = LayoutInflater.from(parent.context).inflate(R.layout.gallery_item, parent, false)
        val holder = GalleryViewHolder(view)
        holder.ivPicture.tag = holder
        return holder
            }

    override fun getItemCount() = galleryList?.size ?: 0

    override fun onBindViewHolder(holder: GalleryViewHolder, position: Int) {
        val gallery = galleryList!![position]
        holder.bindPicture(gallery)
    }

    fun addItems (gallery: List<Gallery>?) {
        if (gallery == null)
            return
        else if (gallery.isEmpty())
            return
        else {
            galleryList!!.addAll(gallery)
            notifyDataSetChanged()
        }
    }
}