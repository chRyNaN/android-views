@file:Suppress("unused")

package com.chrynan.androidviews.layout

import android.content.Context
import com.chrynan.androidviews.builder.LayoutBuilder

interface AndroidLayout {

    fun onCreateLayout(context: Context): LayoutBuilder<*, *>
}