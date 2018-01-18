package com.example.denis.jeopardy.utils

import android.widget.ImageView
import com.squareup.picasso.Picasso


class ImageLoader {
    fun loadImage(url: String, imageView: ImageView) {
        Picasso.with(imageView.context)
                .load(url)
                .into(imageView)
    }
}