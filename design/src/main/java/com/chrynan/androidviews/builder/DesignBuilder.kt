@file:Suppress("unused")

package com.chrynan.androidviews.builder

import android.content.Context
import android.support.design.widget.TextInputEditText
import android.support.design.widget.TextInputLayout
import android.view.ViewGroup
import android.widget.LinearLayout

// TextInputLayout

fun textInputLayout(context: Context, block: (LayoutBuilder<TextInputLayout, LinearLayout.LayoutParams>.() -> Unit)? = null) =
        layoutBuilderFor(
                viewGroup = TextInputLayout(context),
                layoutParamsCreator = { LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT) },
                block = block
        )

fun <V : ViewGroup, P : ViewGroup.LayoutParams> LayoutBuilder<V, P>.textInputLayout(block: (LayoutBuilder<TextInputLayout, LinearLayout.LayoutParams>.() -> Unit)? = null) =
        addLayoutBuilderFor(
                viewGroup = TextInputLayout(viewGroup.context),
                layoutParamsCreator = { LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT) },
                block = block
        )

// TextInputEditText

fun textInputEditText(context: Context, block: (TextInputEditText.() -> Unit)? = null) =
        viewBuilderFor(TextInputEditText(context), block)

fun <V : ViewGroup, P : ViewGroup.LayoutParams> LayoutBuilder<V, P>.textInputEditText(block: (TextInputEditText.() -> Unit)? = null) =
        addViewBuilderFor(TextInputEditText(viewGroup.context), block)
