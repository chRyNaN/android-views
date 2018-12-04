@file:Suppress("unused")

package com.chrynan.androidviews.builder

import android.view.View

fun <V : View> style(block: V.() -> Unit) = lazyOf(block)

fun <V : View> V.applyStyle(block: V.() -> Unit) = block(this)