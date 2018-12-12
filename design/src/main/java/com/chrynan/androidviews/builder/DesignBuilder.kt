@file:Suppress("unused")

package com.chrynan.androidviews.builder

import android.content.Context
import android.support.design.widget.*
import android.support.v4.widget.NestedScrollView
import android.view.ViewGroup
import android.widget.FrameLayout
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

// AppBarLayout

fun appBarLayout(context: Context, block: (LayoutBuilder<AppBarLayout, AppBarLayout.LayoutParams>.() -> Unit)? = null) =
        layoutBuilderFor(
                viewGroup = AppBarLayout(context),
                layoutParamsCreator = { AppBarLayout.LayoutParams(AppBarLayout.LayoutParams.WRAP_CONTENT, AppBarLayout.LayoutParams.WRAP_CONTENT) },
                block = block
        )

fun <V : ViewGroup, P : ViewGroup.LayoutParams> LayoutBuilder<V, P>.appBarLayout(block: (LayoutBuilder<AppBarLayout, AppBarLayout.LayoutParams>.() -> Unit)? = null) =
        addLayoutBuilderFor(
                viewGroup = AppBarLayout(viewGroup.context),
                layoutParamsCreator = { AppBarLayout.LayoutParams(AppBarLayout.LayoutParams.WRAP_CONTENT, AppBarLayout.LayoutParams.WRAP_CONTENT) },
                block = block
        )

// CollapsingToolbarLayout

fun collapsingToolbarLayout(context: Context, block: (LayoutBuilder<CollapsingToolbarLayout, CollapsingToolbarLayout.LayoutParams>.() -> Unit)? = null) =
        layoutBuilderFor(
                viewGroup = CollapsingToolbarLayout(context),
                layoutParamsCreator = { CollapsingToolbarLayout.LayoutParams(CollapsingToolbarLayout.LayoutParams.WRAP_CONTENT, CollapsingToolbarLayout.LayoutParams.WRAP_CONTENT) },
                block = block
        )

fun <V : ViewGroup, P : ViewGroup.LayoutParams> LayoutBuilder<V, P>.collapsingToolbarLayout(block: (LayoutBuilder<CollapsingToolbarLayout, CollapsingToolbarLayout.LayoutParams>.() -> Unit)? = null) =
        addLayoutBuilderFor(
                viewGroup = CollapsingToolbarLayout(viewGroup.context),
                layoutParamsCreator = { CollapsingToolbarLayout.LayoutParams(CollapsingToolbarLayout.LayoutParams.WRAP_CONTENT, CollapsingToolbarLayout.LayoutParams.WRAP_CONTENT) },
                block = block
        )

// NestedScrollView

fun nestedScrollLayout(context: Context, block: (LayoutBuilder<NestedScrollView, FrameLayout.LayoutParams>.() -> Unit)? = null) =
        layoutBuilderFor(
                viewGroup = NestedScrollView(context),
                layoutParamsCreator = { FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT) },
                block = block
        )

fun <V : ViewGroup, P : ViewGroup.LayoutParams> LayoutBuilder<V, P>.nestedScrollLayout(block: (LayoutBuilder<NestedScrollView, FrameLayout.LayoutParams>.() -> Unit)? = null) =
        addLayoutBuilderFor(
                viewGroup = NestedScrollView(viewGroup.context),
                layoutParamsCreator = { FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT) },
                block = block
        )

// CoordinatorLayout

fun coordinatorLayout(context: Context, block: (LayoutBuilder<CoordinatorLayout, CoordinatorLayout.LayoutParams>.() -> Unit)? = null) =
        layoutBuilderFor(
                viewGroup = CoordinatorLayout(context),
                layoutParamsCreator = { CoordinatorLayout.LayoutParams(CoordinatorLayout.LayoutParams.WRAP_CONTENT, CoordinatorLayout.LayoutParams.WRAP_CONTENT) },
                block = block
        )

fun <V : ViewGroup, P : ViewGroup.LayoutParams> LayoutBuilder<V, P>.coordinatorLayout(block: (LayoutBuilder<CoordinatorLayout, CoordinatorLayout.LayoutParams>.() -> Unit)? = null) =
        addLayoutBuilderFor(
                viewGroup = CoordinatorLayout(viewGroup.context),
                layoutParamsCreator = { CoordinatorLayout.LayoutParams(CoordinatorLayout.LayoutParams.WRAP_CONTENT, CoordinatorLayout.LayoutParams.WRAP_CONTENT) },
                block = block
        )