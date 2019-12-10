package ru.startandroid.galleryhomework.presentation.adapter

import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import ru.startandroid.galleryhomework.R
import ru.startandroid.galleryhomework.repository.data_source.entity.model.Gallery


class GalleryViewHolder (itemView: View): RecyclerView.ViewHolder(itemView) {
    var ivPicture: ImageView

    init {
        ivPicture = itemView.findViewById(R.id.ivPicture)
    }

    fun bindPicture(gallery: Gallery) {
        Glide.with(itemView.context)
            .load(gallery.picture).placeholder(R.mipmap.background_item_gallery).dontAnimate().into(ivPicture)
    }
}
