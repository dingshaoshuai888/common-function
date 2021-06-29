package dingshaoshuai.function

import android.widget.Toast

/**
 * @author: Xiao Bo
 * @date: 29/6/2021
 */
private var toast: Toast? = null

fun toast(msg: String, duration: Int = Toast.LENGTH_SHORT) {
    toast?.cancel()
    toast = Toast.makeText(Function.context, msg, duration)
    toast?.show()
}

fun toast(strResId: Int, duration: Int = Toast.LENGTH_SHORT) {
    toast(Function.context.getString(strResId), duration)
}
