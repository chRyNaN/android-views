@file:Suppress("unused")

package com.chrynan.androidviews.builder

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.ViewGroup

// RecyclerView

fun recyclerView(context: Context, block: (RecyclerView.() -> Unit)? = null) =
        viewBuilderFor(RecyclerView(context), block)

fun <V : ViewGroup, P : ViewGroup.LayoutParams> LayoutBuilder<V, P>.recyclerView(block: (RecyclerView.() -> Unit)? = null) =
        addViewBuilderFor(RecyclerView(viewGroup.context), block)