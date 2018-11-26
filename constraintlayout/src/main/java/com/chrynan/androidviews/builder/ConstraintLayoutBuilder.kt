@file:Suppress("unused")

package com.chrynan.androidviews.builder

import android.content.Context
import android.support.constraint.ConstraintLayout
import android.view.ViewGroup

// ConstraintLayout

fun constraintLayout(context: Context, block: (LayoutBuilder<ConstraintLayout, ConstraintLayout.LayoutParams>.() -> Unit)? = null) =
        layoutBuilderFor(
                viewGroup = ConstraintLayout(context),
                layoutParamsCreator = { ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT, ConstraintLayout.LayoutParams.WRAP_CONTENT) },
                block = block
        )

fun <V : ViewGroup, P : ViewGroup.LayoutParams> LayoutBuilder<V, P>.constraintLayout(block: (LayoutBuilder<ConstraintLayout, ConstraintLayout.LayoutParams>.() -> Unit)? = null) =
        addLayoutBuilderFor(
                viewGroup = ConstraintLayout(viewGroup.context),
                layoutParamsCreator = { ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT, ConstraintLayout.LayoutParams.WRAP_CONTENT) },
                block = block
        )