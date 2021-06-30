package dingshaoshuai.function.ui.view

import android.graphics.Bitmap
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

fun ImageView.load(bitmap: Bitmap) {
    ImageLoaderProxy.instance.load(this, bitmap)
}

fun ImageView.load(uri: Uri) {
    ImageLoaderProxy.instance.load(this, uri)
}