@file:Suppress("unused")

package com.chrynan.androidviews.layout

import android.app.Activity
import android.view.ViewGroup

object AndroidLayoutProvider {

    fun layout(activity: Activity, layout: AndroidLayout): ViewGroup {
        layout.onBeforeCreateLayout()
        val viewGroup = layout.onCreateLayout(activity).viewGroup
        activity.setContentView(viewGroup)
        layout.onLayoutCreated()
        return viewGroup
    }

    fun layout(parentView: ViewGroup, layout: AndroidLayout): ViewGroup {
        parentView.removeAllViews()
        layout.onBeforeCreateLayout()
        val viewGroup = layout.onCreateLayout(parentView.context).viewGroup
        parentView.addView(viewGroup)
        layout.onLayoutCreated()
        return viewGroup
    }

    fun <T> render(activity: Activity, layout: AndroidRenderLayout<T>, item: T): ViewGroup {
        layout.onBeforeCreateLayout()
        layout.onBeforeRender()
        val viewGroup = layout.onRenderLayout(activity, item).viewGroup
        activity.setContentView(viewGroup)
        layout.onLayoutCreated()
        layout.onLayoutRendered()
        return viewGroup
    }

    fun <T> render(parentView: ViewGroup, layout: AndroidRenderLayout<T>, item: T): ViewGroup {
        parentView.removeAllViews()
        layout.onBeforeCreateLayout()
        layout.onBeforeRender()
        val viewGroup = layout.onRenderLayout(parentView.context, item).viewGroup
        parentView.addView(viewGroup)
        layout.onLayoutCreated()
        layout.onLayoutRendered()
        return viewGroup
    }
}