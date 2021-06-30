package dingshaoshuai.function.ui

import androidx.annotation.*
import dingshaoshuai.function.Function.context

/**
 * @author: Xiao Bo
 * @date: 30/6/2021
 */
fun resourceString(@StringRes resId: Int) = context.resources.getString(resId)
fun resourceStringArray(@ArrayRes resId: Int): Array<String> = context.resources.getStringArray(resId)
fun resourceInteger(@IntegerRes resId: Int) = context.resources.getInteger(resId)
fun resourceIntArray(@ArrayRes resId: Int) = context.resources.getIntArray(resId)
fun resourceBoolean(@BoolRes resId: Int) = context.resources.getBoolean(resId)
fun resourceColor(@ColorRes resId: Int) = context.getColor(resId)
fun resourceDrawable(@DrawableRes resId: Int) = context.getDrawable(resId)
