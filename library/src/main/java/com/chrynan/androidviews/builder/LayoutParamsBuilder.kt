@file:Suppress("unused")

package com.chrynan.androidviews.builder

import android.view.View
import android.view.ViewGroup

typealias LayoutParamsInitializer<P> = P.() -> Unit

open class LayoutParamsBuilder<V : View, P : ViewGroup.LayoutParams>(
        val view: V,
        private val layoutParams: P
) : (LayoutParamsInitializer<P>) -> Unit {

    override fun invoke(layoutInitializer: LayoutParamsInitializer<P>) {
        layoutInitializer(layoutParams)
        view.layoutParams = layoutParams
    }
}

fun <V : View, P : ViewGroup.LayoutParams> layoutParamsBuilderFor(view: V, layoutParams: P) =
        LayoutParamsBuilder(view, layoutParams)