@file:Suppress("unused")

package com.chrynan.androidviews.builder

import android.content.Context
import android.view.View
import android.view.ViewGroup
import com.chrynan.inlinepixel.ContextScreenDimensionUnitConverter
import com.chrynan.inlinepixel.ScreenDimensionUnitConverter

typealias ViewInitializer<V> = V.() -> Unit

open class ViewBuilder<V : View>(val view: V) : (ViewInitializer<V>) -> V,
        ScreenDimensionUnitConverter by ContextScreenDimensionUnitConverter(context = view.context) {

    override fun invoke(viewInitializer: ViewInitializer<V>): V {
        viewInitializer(view)
        return view
    }
}

fun <V : View, VG : ViewGroup, P : ViewGroup.LayoutParams> LayoutBuilder<VG, P>.addViewBuilderFor(newView: V, block: (ViewInitializer<V>)? = null): V {
    val viewBuilder = ViewBuilder(newView)
    block?.let { viewBuilder(it) }
    viewGroup.addView(viewBuilder.view)
    return viewBuilder.view
}

fun <V : View> viewBuilderFor(newView: V, block: (ViewInitializer<V>)? = null): V {
    val viewBuilder = ViewBuilder(newView)
    return block?.let { viewBuilder(it) } ?: viewBuilder.view
}

fun view(context: Context, block: (ViewInitializer<View>)? = null) =
        viewBuilderFor(View(context), block)

fun <V : ViewGroup, P : ViewGroup.LayoutParams> LayoutBuilder<V, P>.view(block: (ViewInitializer<View>)? = null) =
        addViewBuilderFor(View(viewGroup.context), block)