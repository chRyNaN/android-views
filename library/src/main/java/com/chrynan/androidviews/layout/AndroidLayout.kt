@file:Suppress("unused")

package com.chrynan.androidviews.layout

import android.content.Context
import android.view.ViewGroup
import com.chrynan.androidviews.builder.LayoutBuilder

interface AndroidLayout {

    fun <V : ViewGroup, P : ViewGroup.LayoutParams> onCreateLayout(context: Context): LayoutBuilder<V, P>
}