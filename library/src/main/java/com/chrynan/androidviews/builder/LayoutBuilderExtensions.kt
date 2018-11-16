@file:Suppress("unused")

package com.chrynan.androidviews.builder

import android.content.Context
import android.view.ViewGroup
import android.widget.*
import android.widget.GridLayout.spec

// Vertical LinearLayout

fun verticalLayout(context: Context, block: (LayoutBuilder<LinearLayout, LinearLayout.LayoutParams>.() -> Unit)? = null) =
        layoutBuilderFor(
                viewGroup = LinearLayout(context).apply { orientation = LinearLayout.VERTICAL },
                layoutParamsCreator = { LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT) },
                block = block
        )

fun <V : ViewGroup, P : ViewGroup.LayoutParams> LayoutBuilder<V, P>.verticalLayout(block: (LayoutBuilder<LinearLayout, LinearLayout.LayoutParams>.() -> Unit)? = null) =
        addLayoutBuilderFor(
                viewGroup = LinearLayout(viewGroup.context).apply { orientation = LinearLayout.VERTICAL },
                layoutParamsCreator = { LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT) },
                block = block
        )

// Horizontal LinearLayout

fun horizontalLayout(context: Context, block: (LayoutBuilder<LinearLayout, LinearLayout.LayoutParams>.() -> Unit)? = null) =
        layoutBuilderFor(
                viewGroup = LinearLayout(context).apply { orientation = LinearLayout.HORIZONTAL },
                layoutParamsCreator = { LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT) },
                block = block
        )

fun <V : ViewGroup, P : ViewGroup.LayoutParams> LayoutBuilder<V, P>.horizontalLayout(block: (LayoutBuilder<LinearLayout, LinearLayout.LayoutParams>.() -> Unit)? = null) =
        addLayoutBuilderFor(
                viewGroup = LinearLayout(viewGroup.context).apply { orientation = LinearLayout.HORIZONTAL },
                layoutParamsCreator = { LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT) },
                block = block
        )

// FrameLayout

fun frameLayout(context: Context, block: (LayoutBuilder<FrameLayout, FrameLayout.LayoutParams>.() -> Unit)? = null) =
        layoutBuilderFor(
                viewGroup = FrameLayout(context),
                layoutParamsCreator = { FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT) },
                block = block
        )

fun <V : ViewGroup, P : ViewGroup.LayoutParams> LayoutBuilder<V, P>.frameLayout(block: (LayoutBuilder<FrameLayout, FrameLayout.LayoutParams>.() -> Unit)? = null) =
        addLayoutBuilderFor(
                viewGroup = FrameLayout(viewGroup.context),
                layoutParamsCreator = { FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT) },
                block = block
        )

// GridLayout

fun gridLayout(context: Context, block: (LayoutBuilder<GridLayout, GridLayout.LayoutParams>.() -> Unit)? = null) =
        layoutBuilderFor(
                viewGroup = GridLayout(context),
                layoutParamsCreator = { GridLayout.LayoutParams(spec(GridLayout.UNDEFINED), spec(GridLayout.UNDEFINED)) },
                block = block
        )

fun <V : ViewGroup, P : ViewGroup.LayoutParams> LayoutBuilder<V, P>.gridLayout(block: (LayoutBuilder<GridLayout, GridLayout.LayoutParams>.() -> Unit)? = null) =
        addLayoutBuilderFor(
                viewGroup = GridLayout(viewGroup.context),
                layoutParamsCreator = { GridLayout.LayoutParams(spec(GridLayout.UNDEFINED), spec(GridLayout.UNDEFINED)) },
                block = block
        )

// RelativeLayout

fun relativeLayout(context: Context, block: (LayoutBuilder<RelativeLayout, RelativeLayout.LayoutParams>.() -> Unit)? = null) =
        layoutBuilderFor(
                viewGroup = RelativeLayout(context),
                layoutParamsCreator = { RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT) },
                block = block
        )

fun <V : ViewGroup, P : ViewGroup.LayoutParams> LayoutBuilder<V, P>.relativeLayout(block: (LayoutBuilder<RelativeLayout, RelativeLayout.LayoutParams>.() -> Unit)? = null) =
        addLayoutBuilderFor(
                viewGroup = RelativeLayout(viewGroup.context),
                layoutParamsCreator = { RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT) },
                block = block
        )

// Toolbar

fun toolbar(context: Context, block: (LayoutBuilder<Toolbar, Toolbar.LayoutParams>.() -> Unit)? = null) =
        layoutBuilderFor(
                viewGroup = Toolbar(context),
                layoutParamsCreator = { Toolbar.LayoutParams(Toolbar.LayoutParams.WRAP_CONTENT, Toolbar.LayoutParams.WRAP_CONTENT) },
                block = block
        )

fun <V : ViewGroup, P : ViewGroup.LayoutParams> LayoutBuilder<V, P>.toolbar(block: (LayoutBuilder<Toolbar, Toolbar.LayoutParams>.() -> Unit)? = null) =
        addLayoutBuilderFor(
                viewGroup = Toolbar(viewGroup.context),
                layoutParamsCreator = { Toolbar.LayoutParams(Toolbar.LayoutParams.WRAP_CONTENT, Toolbar.LayoutParams.WRAP_CONTENT) },
                block = block
        )

// ListView

fun listLayout(context: Context, block: (LayoutBuilder<ListView, AbsListView.LayoutParams>.() -> Unit)? = null) =
        layoutBuilderFor(
                viewGroup = ListView(context),
                layoutParamsCreator = { AbsListView.LayoutParams(AbsListView.LayoutParams.WRAP_CONTENT, AbsListView.LayoutParams.WRAP_CONTENT) },
                block = block
        )

fun <V : ViewGroup, P : ViewGroup.LayoutParams> LayoutBuilder<V, P>.listLayout(block: (LayoutBuilder<ListView, AbsListView.LayoutParams>.() -> Unit)? = null) =
        addLayoutBuilderFor(
                viewGroup = ListView(viewGroup.context),
                layoutParamsCreator = { AbsListView.LayoutParams(AbsListView.LayoutParams.WRAP_CONTENT, AbsListView.LayoutParams.WRAP_CONTENT) },
                block = block
        )

// RadioGroup

fun radioGroup(context: Context, block: (LayoutBuilder<RadioGroup, RadioGroup.LayoutParams>.() -> Unit)? = null) =
        layoutBuilderFor(
                viewGroup = RadioGroup(context),
                layoutParamsCreator = { RadioGroup.LayoutParams(RadioGroup.LayoutParams.WRAP_CONTENT, RadioGroup.LayoutParams.WRAP_CONTENT) },
                block = block
        )

fun <V : ViewGroup, P : ViewGroup.LayoutParams> LayoutBuilder<V, P>.radioGroup(block: (LayoutBuilder<RadioGroup, RadioGroup.LayoutParams>.() -> Unit)? = null) =
        addLayoutBuilderFor(
                viewGroup = RadioGroup(viewGroup.context),
                layoutParamsCreator = { RadioGroup.LayoutParams(RadioGroup.LayoutParams.WRAP_CONTENT, RadioGroup.LayoutParams.WRAP_CONTENT) },
                block = block
        )

// ScrollView

fun scrollLayout(context: Context, block: (LayoutBuilder<ScrollView, FrameLayout.LayoutParams>.() -> Unit)? = null) =
        layoutBuilderFor(
                viewGroup = ScrollView(context),
                layoutParamsCreator = { FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT) },
                block = block
        )

fun <V : ViewGroup, P : ViewGroup.LayoutParams> LayoutBuilder<V, P>.scrollLayout(block: (LayoutBuilder<ScrollView, FrameLayout.LayoutParams>.() -> Unit)? = null) =
        addLayoutBuilderFor(
                viewGroup = ScrollView(viewGroup.context),
                layoutParamsCreator = { FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT) },
                block = block
        )

// TableLayout

fun tableLayout(context: Context, block: (LayoutBuilder<TableLayout, TableLayout.LayoutParams>.() -> Unit)? = null) =
        layoutBuilderFor(
                viewGroup = TableLayout(context),
                layoutParamsCreator = { TableLayout.LayoutParams(TableLayout.LayoutParams.WRAP_CONTENT, TableLayout.LayoutParams.WRAP_CONTENT) },
                block = block
        )

fun <V : ViewGroup, P : ViewGroup.LayoutParams> LayoutBuilder<V, P>.tableLayout(block: (LayoutBuilder<TableLayout, TableLayout.LayoutParams>.() -> Unit)? = null) =
        addLayoutBuilderFor(
                viewGroup = TableLayout(viewGroup.context),
                layoutParamsCreator = { TableLayout.LayoutParams(TableLayout.LayoutParams.WRAP_CONTENT, TableLayout.LayoutParams.WRAP_CONTENT) },
                block = block
        )

// TableRow

fun tableRow(context: Context, block: (LayoutBuilder<TableRow, TableRow.LayoutParams>.() -> Unit)? = null) =
        layoutBuilderFor(
                viewGroup = TableRow(context),
                layoutParamsCreator = { TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT) },
                block = block
        )

fun <V : ViewGroup, P : ViewGroup.LayoutParams> LayoutBuilder<V, P>.tableRow(block: (LayoutBuilder<TableRow, TableRow.LayoutParams>.() -> Unit)? = null) =
        addLayoutBuilderFor(
                viewGroup = TableRow(viewGroup.context),
                layoutParamsCreator = { TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT) },
                block = block
        )