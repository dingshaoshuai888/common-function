package dingshaoshuai.function.ui.view

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView

/**
 * @author: Xiao Bo
 * @date: 10/11/2020
 */
class LinearItemDecoration(
    private val right: Int = 0,
    private val left: Int = 0,
    private val space: Int = 0,
    private val firstTop: Int = 0,
    private val lastBottom: Int = 0
) : RecyclerView.ItemDecoration() {

    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        outRect.left = left
        outRect.right = right
        outRect.top = space

        if (parent.getChildAdapterPosition(view) == 0) outRect.top = firstTop
        if (parent.getChildAdapterPosition(view) == state.itemCount - 1) outRect.bottom = lastBottom
    }
}