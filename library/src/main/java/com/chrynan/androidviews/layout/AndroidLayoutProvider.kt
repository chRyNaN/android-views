@file:Suppress("unused")

package com.chrynan.androidviews.layout

import android.app.Activity
import android.view.ViewGroup

object AndroidLayoutProvider {

    fun <V : ViewGroup, P : ViewGroup.LayoutParams> layout(activity: Activity, layout: AndroidLayout) {
        activity.setContentView(layout.onCreateLayout<V, P>(activity).viewGroup)
    }

    fun <V : ViewGroup, P : ViewGroup.LayoutParams> layout(parentView: ViewGroup, layout: AndroidLayout) {
        parentView.removeAllViews()
        parentView.addView(layout.onCreateLayout<V, P>(parentView.context).viewGroup)
    }
}