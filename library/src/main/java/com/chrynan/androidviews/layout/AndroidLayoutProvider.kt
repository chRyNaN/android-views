@file:Suppress("unused")

package com.chrynan.androidviews.layout

import android.app.Activity
import android.view.ViewGroup

object AndroidLayoutProvider {

    fun layout(activity: Activity, layout: AndroidLayout) {
        layout.onBeforeCreateLayout()
        activity.setContentView(layout.onCreateLayout(activity).viewGroup)
        layout.onLayoutCreated()
    }

    fun layout(parentView: ViewGroup, layout: AndroidLayout) {
        parentView.removeAllViews()
        layout.onBeforeCreateLayout()
        parentView.addView(layout.onCreateLayout(parentView.context).viewGroup)
        layout.onLayoutCreated()
    }

    fun <T> render(activity: Activity, layout: AndroidRenderLayout<T>, item: T) {
        layout.onBeforeCreateLayout()
        activity.setContentView(layout.onRenderLayout(activity, item).viewGroup)
        layout.onLayoutCreated()
    }

    fun <T> render(parentView: ViewGroup, layout: AndroidRenderLayout<T>, item: T) {
        parentView.removeAllViews()
        layout.onBeforeCreateLayout()
        parentView.addView(layout.onRenderLayout(parentView.context, item).viewGroup)
        layout.onLayoutCreated()
    }
}