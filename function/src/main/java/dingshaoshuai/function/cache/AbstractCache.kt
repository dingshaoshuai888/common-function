package dingshaoshuai.function.cache

/**
 * @author: Xiao Bo
 * @date: 15/6/2021
 */
abstract class AbstractCache<T : Any> {

    protected abstract val key: String
    protected var mValue: T? = null

    abstract fun setValue(value: T)

    abstract fun getValue(): T?

    abstract fun clear()
}