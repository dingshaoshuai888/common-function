package dingshaoshuai.function.ui

import android.os.Build
import android.util.DisplayMetrics
import androidx.annotation.RequiresApi
import dingshaoshuai.function.Function.context

/**
 * @author: Xiao Bo
 * @date: 30/6/2021
 */

// xx2px
fun Int.dp2px() = (this * context.resources.displayMetrics.density).toInt()
fun Float.dp2px() = (this * context.resources.displayMetrics.density).toInt()
fun Int.sp2px() = (this * context.resources.displayMetrics.scaledDensity).toInt()
fun Float.sp2px() = (this * context.resources.displayMetrics.scaledDensity).toInt()

// px2xx
fun Int.px2dp() = (this.toFloat() / context.resources.displayMetrics.density).toInt()
fun Int.px2sp() = (this.toFloat() / context.resources.displayMetrics.scaledDensity).toInt()

// 0: width
// 1: height
@RequiresApi(Build.VERSION_CODES.R)
fun getScreenPixels(): IntArray {
    val outMetrics = DisplayMetrics()
    context.display?.getRealMetrics(outMetrics)
    return intArrayOf(outMetrics.widthPixels, outMetrics.heightPixels)
}