@file:Suppress("unused")

package com.chrynan.androidviews.layout

import android.content.Context
import android.view.ViewGroup
import com.chrynan.androidviews.builder.LayoutBuilder

interface AndroidRenderLayout<T> : AndroidLayout {

    fun <V : ViewGroup, P : ViewGroup.LayoutParams> onRenderLayout(context: Context, item: T): LayoutBuilder<V, P>
}