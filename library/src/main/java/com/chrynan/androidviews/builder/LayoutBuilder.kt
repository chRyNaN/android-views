@file:Suppress("unused")

package com.chrynan.androidviews.builder

import android.view.View
import android.view.ViewGroup

open class LayoutBuilder<V : ViewGroup, P : ViewGroup.LayoutParams>(
        val viewGroup: V,
        val newBaseLayoutParams: () -> P
) {

    @LayoutFunctionScope
    fun init(block: V.() -> Unit) = viewGroup.apply(block)

    @LayoutFunctionScope
    fun <V : View> V.layoutParams(block: LayoutParamsInitializer<P>) {
        val builder = layoutParamsBuilderFor(this, newBaseLayoutParams())
        builder(block)
    }
}

fun <V : ViewGroup, P : ViewGroup.LayoutParams> layoutBuilderFor(viewGroup: V, layoutParamsCreator: () -> P, block: (LayoutBuilder<V, P>.() -> Unit)? = null): LayoutBuilder<V, P> {
    val layoutBuilder = LayoutBuilder(viewGroup = viewGroup, newBaseLayoutParams = layoutParamsCreator)
    block?.invoke(layoutBuilder)
    return layoutBuilder
}

fun <V : ViewGroup, P : ViewGroup.LayoutParams, NV : ViewGroup, NP : ViewGroup.LayoutParams> LayoutBuilder<V, P>.addLayoutBuilderFor(
        viewGroup: NV, layoutParamsCreator: () -> NP, block: (LayoutBuilder<NV, NP>.() -> Unit)? = null): NV {
    val layoutBuilder = layoutBuilderFor(viewGroup, layoutParamsCreator, block)
    this.viewGroup.addView(layoutBuilder.viewGroup)
    return layoutBuilder.viewGroup
}

@DslMarker
@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.FUNCTION)
annotation class LayoutFunctionScope