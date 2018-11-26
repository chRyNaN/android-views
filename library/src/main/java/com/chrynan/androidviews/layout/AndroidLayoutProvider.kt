@file:Suppress("unused")

package com.chrynan.androidviews.layout

import android.app.Activity
import android.view.ViewGroup

object AndroidLayoutProvider {

    fun <V : ViewGroup, P : ViewGroup.LayoutParams> layout(activity: Activity, layout: AndroidLayout) {
        activity.setContentView(layout.onCreateLayout(activity).viewGroup)
    }

    fun <V : ViewGroup, P : ViewGroup.LayoutParams> layout(parentView: ViewGroup, layout: AndroidLayout) {
        parentView.removeAllViews()
        parentView.addView(layout.onCreateLayout(parentView.context).viewGroup)
    }

    fun <T, V : ViewGroup, P : ViewGroup.LayoutParams> render(activity: Activity, layout: AndroidRenderLayout<T>, item: T) {
        activity.setContentView(layout.onRenderLayout(activity, item).viewGroup)
    }

    fun <T, V : ViewGroup, P : ViewGroup.LayoutParams> render(parentView: ViewGroup, layout: AndroidRenderLayout<T>, item: T) {
        parentView.removeAllViews()
        parentView.addView(layout.onRenderLayout(parentView.context, item).viewGroup)
    }
}