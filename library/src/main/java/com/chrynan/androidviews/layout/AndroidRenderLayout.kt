@file:Suppress("unused")

package com.chrynan.androidviews.layout

import android.content.Context
import com.chrynan.androidviews.builder.LayoutBuilder

interface AndroidRenderLayout<T> : AndroidLayout {

    fun onRenderLayout(context: Context, item: T): LayoutBuilder<*, *>
}