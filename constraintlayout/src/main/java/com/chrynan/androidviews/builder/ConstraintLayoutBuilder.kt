@file:Suppress("unused", "MemberVisibilityCanBePrivate")

package com.chrynan.androidviews.builder

import android.content.Context
import android.support.constraint.ConstraintLayout
import android.support.constraint.ConstraintSet
import android.view.View
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

@ConstraintFunctionScope
fun View.constraints(constraintLayout: ConstraintLayout, block: ConstraintBuilder.() -> Unit) {
    val builder = ConstraintBuilder(this, constraintLayout)
    block(builder)
    builder.build()
    requestLayout()
    invalidate()
}

@ConstraintFunctionScope
fun <V : ConstraintLayout, P : ConstraintLayout.LayoutParams> View.constraints(layoutBuilder: LayoutBuilder<V, P>, block: ConstraintBuilder.() -> Unit) {
    val builder = ConstraintBuilder(this, layoutBuilder.viewGroup)
    block(builder)
    builder.build()
    requestLayout()
    invalidate()
}

@DslMarker
@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.FUNCTION)
annotation class ConstraintFunctionScope

enum class ConstraintSide(val constraintSetValue: Int) {

    LEFT(ConstraintSet.LEFT),
    RIGHT(ConstraintSet.RIGHT),
    TOP(ConstraintSet.TOP),
    BOTTOM(ConstraintSet.BOTTOM),
    START(ConstraintSet.START),
    END(ConstraintSet.END);

    companion object {

        fun fromConstraintSetValue(constraintSetValue: Int) =
                ConstraintSide.values().firstOrNull { it.constraintSetValue == constraintSetValue }
                        ?: LEFT
    }
}

enum class ChainStyle(val constraintSetValue: Int) {

    PACKED(ConstraintSet.CHAIN_PACKED),
    SPREAD(ConstraintSet.CHAIN_SPREAD),
    SPREAD_INSIDE(ConstraintSet.CHAIN_SPREAD_INSIDE);

    companion object {

        fun fromConstraintSetValue(constraintSetValue: Int) =
                ChainStyle.values().firstOrNull { it.constraintSetValue == constraintSetValue }
                        ?: PACKED
    }
}

class ConstraintBuilder(
        private val view: View,
        private val parent: ConstraintLayout
) {

    var height: Int = ConstraintSet.WRAP_CONTENT
        set(value) {
            field = value
            constraintSet.constrainHeight(view.id, value)
        }

    var width: Int = ConstraintSet.WRAP_CONTENT
        set(value) {
            field = value
            constraintSet.constrainWidth(view.id, value)
        }

    var defaultHeight: Int = ConstraintSet.WRAP_CONTENT
        set(value) {
            field = value
            constraintSet.constrainDefaultHeight(view.id, value)
        }

    var defaultWidth: Int = ConstraintSet.WRAP_CONTENT
        set(value) {
            field = value
            constraintSet.constrainDefaultWidth(view.id, value)
        }

    var minHeight: Int = ConstraintSet.WRAP_CONTENT
        set(value) {
            field = value
            constraintSet.constrainMinHeight(view.id, value)
        }

    var minWidth: Int = ConstraintSet.WRAP_CONTENT
        set(value) {
            field = value
            constraintSet.constrainMinWidth(view.id, value)
        }

    var maxHeight: Int = ConstraintSet.WRAP_CONTENT
        set(value) {
            field = value
            constraintSet.constrainMaxHeight(view.id, value)
        }

    var maxWidth: Int = ConstraintSet.WRAP_CONTENT
        set(value) {
            field = value
            constraintSet.constrainMaxWidth(view.id, value)
        }

    var percentHeight: Float = 0f
        set(value) {
            field = value
            constraintSet.constrainPercentHeight(view.id, value)
        }

    var percentWidth: Float = 0f
        set(value) {
            field = value
            constraintSet.constrainPercentWidth(view.id, value)
        }

    var horizontalChainStyle: ChainStyle = ChainStyle.PACKED
        set(value) {
            field = value
            constraintSet.setHorizontalChainStyle(view.id, value.constraintSetValue)
        }

    var verticalChainStyle: ChainStyle = ChainStyle.PACKED
        set(value) {
            field = value
            constraintSet.setVerticalChainStyle(view.id, value.constraintSetValue)
        }

    var alpha: Float = 1f
        set(value) {
            field = value
            constraintSet.setAlpha(view.id, value)
        }

    var applyElevation: Boolean = true
        set(value) {
            field = value
            constraintSet.setApplyElevation(view.id, value)
        }

    var elevation: Float = 0f
        set(value) {
            field = value
            constraintSet.setElevation(view.id, value)
        }

    var dimensionRatio: String = ""
        set(value) {
            field = value
            constraintSet.setDimensionRatio(view.id, value)
        }

    var rotation: Float = 0f
        set(value) {
            field = value
            constraintSet.setRotation(view.id, value)
        }

    var rotationX: Float = 0f
        set(value) {
            field = value
            constraintSet.setRotationX(view.id, value)
        }

    var rotationY: Float = 0f
        set(value) {
            field = value
            constraintSet.setRotationY(view.id, value)
        }

    var scaleX: Float = 1f
        set(value) {
            field = value
            constraintSet.setScaleX(view.id, value)
        }

    var scaleY: Float = 1f
        set(value) {
            field = value
            constraintSet.setScaleY(view.id, value)
        }

    var translationX: Float = 0f
        set(value) {
            field = value
            constraintSet.setTranslationX(view.id, value)
        }

    var translationY: Float = 0f
        set(value) {
            field = value
            constraintSet.setTranslationY(view.id, value)
        }

    var translationZ: Float = 0f
        set(value) {
            field = value
            constraintSet.setTranslationZ(view.id, value)
        }

    var transformPivotX: Float = 0f
        set(value) {
            field = value
            constraintSet.setTransformPivotX(view.id, value)
        }

    var transformPivotY: Float = 0f
        set(value) {
            field = value
            constraintSet.setTransformPivotY(view.id, value)
        }

    var visibility: Int = View.VISIBLE
        set(value) {
            field = value
            constraintSet.setVisibility(view.id, value)
        }

    var verticalWeight: Float = 0f
        set(value) {
            field = value
            constraintSet.setVerticalWeight(view.id, value)
        }

    var horizontalWeight: Float = 0f
        set(value) {
            field = value
            constraintSet.setHorizontalWeight(view.id, value)
        }

    var verticalBias: Float = 0f
        set(value) {
            field = value
            constraintSet.setVerticalBias(view.id, value)
        }

    var horizontalBias: Float = 0f
        set(value) {
            field = value
            constraintSet.setHorizontalBias(view.id, value)
        }

    private val constraintSet = ConstraintSet()

    init {
        if (view.id == View.NO_ID) view.id = View.generateViewId()
        constraintSet.clone(parent)
    }

    fun leftToLeftOf(otherView: View) = runWithValidId(otherView) { leftToLeftOf(otherViewId = id) }

    fun leftToLeftOfParent() = leftToLeftOf(otherViewId = ConstraintSet.PARENT_ID)

    fun leftToLeftOf(otherViewId: Int) {
        constraintSet.connect(view.id, ConstraintSet.LEFT, otherViewId, ConstraintSet.LEFT)
    }

    fun leftToRightOf(otherView: View) = runWithValidId(otherView) { leftToRightOf(otherViewId = id) }

    fun leftToRightOfParent() = leftToRightOf(otherViewId = ConstraintSet.PARENT_ID)

    fun leftToRightOf(otherViewId: Int) {
        constraintSet.connect(view.id, ConstraintSet.LEFT, otherViewId, ConstraintSet.RIGHT)
    }

    fun rightToLeftOf(otherView: View) = runWithValidId(otherView) { rightToLeftOf(otherViewId = id) }

    fun rightToLeftOfParent() = rightToLeftOf(otherViewId = ConstraintSet.PARENT_ID)

    fun rightToLeftOf(otherViewId: Int) {
        constraintSet.connect(view.id, ConstraintSet.RIGHT, otherViewId, ConstraintSet.LEFT)
    }

    fun rightToRightOf(otherView: View) = runWithValidId(otherView) { rightToRightOf(otherViewId = id) }

    fun rightToRightOfParent() = rightToRightOf(otherViewId = ConstraintSet.PARENT_ID)

    fun rightToRightOf(otherViewId: Int) {
        constraintSet.connect(view.id, ConstraintSet.RIGHT, otherViewId, ConstraintSet.RIGHT)
    }

    fun startToStartOf(otherView: View) = runWithValidId(otherView) { startToStartOf(otherViewId = id) }

    fun startToStartOfParent() = startToStartOf(otherViewId = ConstraintSet.PARENT_ID)

    fun startToStartOf(otherViewId: Int) {
        constraintSet.connect(view.id, ConstraintSet.START, otherViewId, ConstraintSet.START)
    }

    fun startToEndOf(otherView: View) = runWithValidId(otherView) { startToEndOf(otherViewId = id) }

    fun startToEndOfParent() = startToEndOf(otherViewId = ConstraintSet.PARENT_ID)

    fun startToEndOf(otherViewId: Int) {
        constraintSet.connect(view.id, ConstraintSet.START, otherViewId, ConstraintSet.END)
    }

    fun endToStartOf(otherView: View) = runWithValidId(otherView) { endToStartOf(otherViewId = id) }

    fun endToStartOfParent() = endToStartOf(otherViewId = ConstraintSet.PARENT_ID)

    fun endToStartOf(otherViewId: Int) {
        constraintSet.connect(view.id, ConstraintSet.END, otherViewId, ConstraintSet.START)
    }

    fun endToEndOf(otherView: View) = runWithValidId(otherView) { endToEndOf(otherViewId = id) }

    fun endToEndOfParent() = endToEndOf(otherViewId = ConstraintSet.PARENT_ID)

    fun endToEndOf(otherViewId: Int) {
        constraintSet.connect(view.id, ConstraintSet.END, otherViewId, ConstraintSet.END)
    }

    fun topToTopOf(otherView: View) = runWithValidId(otherView) { topToTopOf(otherViewId = id) }

    fun topToTopOfParent() = topToTopOf(otherViewId = ConstraintSet.PARENT_ID)

    fun topToTopOf(otherViewId: Int) {
        constraintSet.connect(view.id, ConstraintSet.TOP, otherViewId, ConstraintSet.TOP)
    }

    fun topToBottomOf(otherView: View) = runWithValidId(otherView) { topToBottomOf(otherViewId = id) }

    fun topToBottomOfParent() = topToBottomOf(otherViewId = ConstraintSet.PARENT_ID)

    fun topToBottomOf(otherViewId: Int) {
        constraintSet.connect(view.id, ConstraintSet.TOP, otherViewId, ConstraintSet.BOTTOM)
    }

    fun bottomToTopOf(otherView: View) = runWithValidId(otherView) { bottomToTopOf(otherViewId = id) }

    fun bottomToTopOfParent() = bottomToTopOf(otherViewId = ConstraintSet.PARENT_ID)

    fun bottomToTopOf(otherViewId: Int) {
        constraintSet.connect(view.id, ConstraintSet.BOTTOM, otherViewId, ConstraintSet.TOP)
    }

    fun bottomToBottomOf(otherView: View) = runWithValidId(otherView) { bottomToBottomOf(otherViewId = id) }

    fun bottomToBottomOfParent() = bottomToBottomOf(otherViewId = ConstraintSet.PARENT_ID)

    fun bottomToBottomOf(otherViewId: Int) {
        constraintSet.connect(view.id, ConstraintSet.BOTTOM, otherViewId, ConstraintSet.BOTTOM)
    }

    fun chainHorizontally(startView: View, endView: View) {
        if (startView.id == View.NO_ID) startView.id = View.generateViewId()
        if (endView.id == View.NO_ID) endView.id = View.generateViewId()
        chainHorizontally(startView.id, endView.id)
    }

    fun chainHorizontally(startViewId: Int, endViewId: Int) {
        constraintSet.addToHorizontalChain(view.id, startViewId, endViewId)
    }

    fun chainHorizontallyRtl(startView: View, endView: View) {
        if (startView.id == View.NO_ID) startView.id = View.generateViewId()
        if (endView.id == View.NO_ID) endView.id = View.generateViewId()
        chainHorizontallyRtl(startView.id, endView.id)
    }

    fun chainHorizontallyRtl(startViewId: Int, endViewId: Int) {
        constraintSet.addToHorizontalChainRTL(view.id, startViewId, endViewId)
    }

    fun chainVertically(startView: View, endView: View) {
        if (startView.id == View.NO_ID) startView.id = View.generateViewId()
        if (endView.id == View.NO_ID) endView.id = View.generateViewId()
        chainVertically(startView.id, endView.id)
    }

    fun chainVertically(topViewId: Int, bottomViewId: Int) {
        constraintSet.addToVerticalChain(view.id, topViewId, bottomViewId)
    }

    fun removeFromHorizontalChain() {
        constraintSet.removeFromHorizontalChain(view.id)
    }

    fun removeFromVerticalChain() {
        constraintSet.removeFromVerticalChain(view.id)
    }

    fun clear() {
        constraintSet.clear(view.id)
    }

    fun translation(x: Float, y: Float) {
        constraintSet.setTranslation(view.id, x, y)
    }

    fun transformPivot(x: Float, y: Float) {
        constraintSet.setTransformPivot(view.id, x, y)
    }

    fun margin(side: ConstraintSide, margin: Int) {
        constraintSet.setMargin(view.id, side.constraintSetValue, margin)
    }

    fun goneMargin(side: ConstraintSide, margin: Int) {
        constraintSet.setGoneMargin(view.id, side.constraintSetValue, margin)
    }

    fun center(firstViewId: Int, firstViewSide: ConstraintSide, firstViewMargin: Int = 0, secondViewId: Int,
               secondViewSide: ConstraintSide, secondViewMargin: Int = 0, bias: Float = 0f) {
        constraintSet.center(view.id, firstViewId, firstViewSide.constraintSetValue, firstViewMargin, secondViewId,
                secondViewSide.constraintSetValue, secondViewMargin, bias)
    }

    fun centerHorizontally(firstViewId: Int, firstViewSide: ConstraintSide, firstViewMargin: Int = 0, secondViewId: Int,
                           secondViewSide: ConstraintSide, secondViewMargin: Int = 0, bias: Float = 0f) {
        constraintSet.centerHorizontally(view.id, firstViewId, firstViewSide.constraintSetValue, firstViewMargin, secondViewId,
                secondViewSide.constraintSetValue, secondViewMargin, bias)
    }

    fun centerHorizontally(otherViewId: Int) {
        constraintSet.centerHorizontally(view.id, otherViewId)
    }

    fun centerHorizontallyRtl(firstViewId: Int, firstViewSide: ConstraintSide, firstViewMargin: Int = 0, secondViewId: Int,
                              secondViewSide: ConstraintSide, secondViewMargin: Int = 0, bias: Float = 0f) {
        constraintSet.centerHorizontallyRtl(view.id, firstViewId, firstViewSide.constraintSetValue, firstViewMargin, secondViewId,
                secondViewSide.constraintSetValue, secondViewMargin, bias)
    }

    fun centerHorizontallyRtl(otherViewId: Int) {
        constraintSet.centerHorizontallyRtl(view.id, otherViewId)
    }

    fun centerVertically(firstViewId: Int, firstViewSide: ConstraintSide, firstViewMargin: Int = 0, secondViewId: Int,
                         secondViewSide: ConstraintSide, secondViewMargin: Int = 0, bias: Float = 0f) {
        constraintSet.centerVertically(view.id, firstViewId, firstViewSide.constraintSetValue, firstViewMargin, secondViewId,
                secondViewSide.constraintSetValue, secondViewMargin, bias)
    }

    fun centerVertically(otherViewId: Int) {
        constraintSet.centerVertically(view.id, otherViewId)
    }

    fun circle(otherViewId: Int, radius: Int, bias: Float) {
        constraintSet.constrainCircle(view.id, otherViewId, radius, bias)
    }

    fun guideline(guidelineId: Int, orientation: Int, beginMargin: Int = 0, endMargin: Int = 0, percentRatio: Float = 1f) {
        constraintSet.create(guidelineId, orientation)
        constraintSet.setGuidelineBegin(guidelineId, beginMargin)
        constraintSet.setGuidelineEnd(guidelineId, endMargin)
        constraintSet.setGuidelinePercent(guidelineId, percentRatio)
    }

    fun barrier(barrierId: Int, direction: Int, type: Int, vararg referenced: Int) {
        constraintSet.createBarrier(barrierId, direction, *referenced)
        constraintSet.setBarrierType(barrierId, type)
    }

    fun build() = constraintSet.applyTo(parent)

    private fun runWithValidId(view: View, block: View.() -> Unit) {
        if (view.id == View.NO_ID) view.id = View.generateViewId()
        block(view)
    }
}