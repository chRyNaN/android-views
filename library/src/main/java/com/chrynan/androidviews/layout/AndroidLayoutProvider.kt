@file:Suppress("unused")

package com.chrynan.androidviews.layout

import android.app.Activity
import android.view.ViewGroup

object AndroidLayoutProvider {

    fun layout(activity: Activity, layout: AndroidLayout) {
        activity.setContentView(layout.onCreateLayout(activity).viewGroup)
    }

    fun layout(parentView: ViewGroup, layout: AndroidLayout) {
        parentView.removeAllViews()
        parentView.addView(layout.onCreateLayout(parentView.context).viewGroup)
    }

    fun <T> render(activity: Activity, layout: AndroidRenderLayout<T>, item: T) {
        activity.setContentView(layout.onRenderLayout(activity, item).viewGroup)
    }

    fun <T> render(parentView: ViewGroup, layout: AndroidRenderLayout<T>, item: T) {
        parentView.removeAllViews()
        parentView.addView(layout.onRenderLayout(parentView.context, item).viewGroup)
    }
}