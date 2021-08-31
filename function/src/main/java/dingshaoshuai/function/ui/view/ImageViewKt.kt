package dingshaoshuai.function.ui.view

import android.graphics.Bitmap
import android.graphics.drawable.Drawable
import android.net.Uri
import android.widget.ImageView
import dingshaoshuai.base.feature.image.ImageLoaderProxy

/**
 * @author: Xiao Bo
 * @date: 30/6/2021
 */
fun ImageView.load(url: String, defaultResourceId: Int) {
    ImageLoaderProxy.instance.load(this, url, defaultResourceId)
}

fun ImageView.load(resourceId: Int) {
    ImageLoaderProxy.instance.load(this, resourceId)
}

fun ImageView.load(bitmap: Bitmap, defaultDrawable: Drawable) {
    ImageLoaderProxy.instance.load(this, bitmap, defaultDrawable)
}

fun ImageView.load(uri: Uri, defaultDrawable: Drawable) {
    ImageLoaderProxy.instance.load(this, uri, defaultDrawable)
}