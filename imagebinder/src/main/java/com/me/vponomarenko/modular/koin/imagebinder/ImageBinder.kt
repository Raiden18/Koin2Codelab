package com.me.vponomarenko.modular.koin.imagebinder

import android.widget.ImageView
import androidx.annotation.DrawableRes

interface ImageBinder {
    fun setUrl(url: String)
    fun centerCrop()
    fun setPlaceholder(@DrawableRes drawableId: Int)
    fun bindIn(imageView: ImageView)
}