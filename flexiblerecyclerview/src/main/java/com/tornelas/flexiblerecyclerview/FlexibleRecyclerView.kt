package com.tornelas.flexiblerecyclerview

import android.content.Context
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.AttributeSet

class FlexibleRecyclerView(context: Context, attrs: AttributeSet?) : RecyclerView(context, attrs) {

    //number of columns on the RV
    var columns = 0
        set(newColumns) {
            field = newColumns
            redraw()
        }

    //number of rows on the RV
    var rows = 0
        set(newRows) {
            field = newRows
            redraw()
        }

    //the RV orientation
    var orientation = RecyclerView.VERTICAL
        set(newOrientation) {
            field = newOrientation
            redraw()
        }

    init {
        context.theme.obtainStyledAttributes(attrs, R.styleable.FlexibleRecyclerView,0,0).apply {
            try { //get xml attributes
                columns = getInt(R.styleable.FlexibleRecyclerView_columns, 1)
                rows = getInt(R.styleable.FlexibleRecyclerView_rows, 1)
                orientation = getInt(R.styleable.FlexibleRecyclerView_orientation, RecyclerView.VERTICAL)
            }finally {
                recycle()
            }
        }

        redraw()
    }

    // ---------------------------- Private methods

    /**
     * This method applies the number of columns/rows and orientation to the RV
     */
    private fun redraw(){
        layoutManager = GridLayoutManager(context, if(orientation == RecyclerView.VERTICAL) columns else rows, orientation, false)
    }
}