@file:Suppress("unused")

package com.chrynan.androidviews.builder

import android.content.Context
import android.gesture.GestureOverlayView
import android.inputmethodservice.ExtractEditText
import android.view.SurfaceView
import android.view.TextureView
import android.view.ViewGroup
import android.webkit.WebView
import android.widget.*

// ImageView

fun imageView(context: Context, block: (ImageView.() -> Unit)? = null) =
        viewBuilderFor(ImageView(context), block)

fun <V : ViewGroup, P : ViewGroup.LayoutParams> LayoutBuilder<V, P>.imageView(block: (ImageView.() -> Unit)? = null) =
        addViewBuilderFor(ImageView(viewGroup.context), block)

// TextView

fun textView(context: Context, block: (TextView.() -> Unit)? = null) =
        viewBuilderFor(TextView(context), block)

fun <V : ViewGroup, P : ViewGroup.LayoutParams> LayoutBuilder<V, P>.textView(block: (TextView.() -> Unit)? = null) =
        addViewBuilderFor(TextView(viewGroup.context), block)

// EditText

fun editText(context: Context, block: (EditText.() -> Unit)? = null) =
        viewBuilderFor(EditText(context), block)

fun <V : ViewGroup, P : ViewGroup.LayoutParams> LayoutBuilder<V, P>.editText(block: (EditText.() -> Unit)? = null) =
        addViewBuilderFor(EditText(viewGroup.context), block)

// AutoCompleteTextView

fun autoCompleteTextView(context: Context, block: (AutoCompleteTextView.() -> Unit)? = null) =
        viewBuilderFor(AutoCompleteTextView(context), block)

fun <V : ViewGroup, P : ViewGroup.LayoutParams> LayoutBuilder<V, P>.autoCompleteTextView(block: (AutoCompleteTextView.() -> Unit)? = null) =
        addViewBuilderFor(AutoCompleteTextView(viewGroup.context), block)

// ExtractEditText

fun extractEditText(context: Context, block: (ExtractEditText.() -> Unit)? = null) =
        viewBuilderFor(ExtractEditText(context), block)

fun <V : ViewGroup, P : ViewGroup.LayoutParams> LayoutBuilder<V, P>.extractEditText(block: (ExtractEditText.() -> Unit)? = null) =
        addViewBuilderFor(ExtractEditText(viewGroup.context), block)

// MultiAutoCompleteTextView

fun multiAutoCompleteTextView(context: Context, block: (MultiAutoCompleteTextView.() -> Unit)? = null) =
        viewBuilderFor(MultiAutoCompleteTextView(context), block)

fun <V : ViewGroup, P : ViewGroup.LayoutParams> LayoutBuilder<V, P>.multiAutoCompleteTextView(block: (MultiAutoCompleteTextView.() -> Unit)? = null) =
        addViewBuilderFor(MultiAutoCompleteTextView(viewGroup.context), block)

// Button

fun button(context: Context, block: (Button.() -> Unit)? = null) =
        viewBuilderFor(Button(context), block)

fun <V : ViewGroup, P : ViewGroup.LayoutParams> LayoutBuilder<V, P>.button(block: (Button.() -> Unit)? = null) =
        addViewBuilderFor(Button(viewGroup.context), block)

// ImageButton

fun imageButton(context: Context, block: (ImageButton.() -> Unit)? = null) =
        viewBuilderFor(ImageButton(context), block)

fun <V : ViewGroup, P : ViewGroup.LayoutParams> LayoutBuilder<V, P>.imageButton(block: (ImageButton.() -> Unit)? = null) =
        addViewBuilderFor(ImageButton(viewGroup.context), block)

// RadioButton

fun radioButton(context: Context, block: (RadioButton.() -> Unit)? = null) =
        viewBuilderFor(RadioButton(context), block)

fun <V : ViewGroup, P : ViewGroup.LayoutParams> LayoutBuilder<V, P>.radioButton(block: (RadioButton.() -> Unit)? = null) =
        addViewBuilderFor(RadioButton(viewGroup.context), block)

// Space

fun space(context: Context, block: (Space.() -> Unit)? = null) =
        viewBuilderFor(Space(context), block)

fun <V : ViewGroup, P : ViewGroup.LayoutParams> LayoutBuilder<V, P>.space(block: (Space.() -> Unit)? = null) =
        addViewBuilderFor(Space(viewGroup.context), block)

// ProgressBar

fun horizontalProgressBar(context: Context, block: (ProgressBar.() -> Unit)? = null) =
        viewBuilderFor(ProgressBar(context, null, android.R.attr.progressBarStyleHorizontal))

fun <V : ViewGroup, P : ViewGroup.LayoutParams> LayoutBuilder<V, P>.horizonalProgressBar(block: (ProgressBar.() -> Unit)? = null) =
        addViewBuilderFor(ProgressBar(viewGroup.context), block)

fun progressBar(context: Context, block: (ProgressBar.() -> Unit)? = null) =
        viewBuilderFor(ProgressBar(context), block)

fun <V : ViewGroup, P : ViewGroup.LayoutParams> LayoutBuilder<V, P>.progressBar(block: (ProgressBar.() -> Unit)? = null) =
        addViewBuilderFor(ProgressBar(viewGroup.context), block)

// SurfaceView

fun surfaceView(context: Context, block: (SurfaceView.() -> Unit)? = null) =
        viewBuilderFor(SurfaceView(context), block)

fun <V : ViewGroup, P : ViewGroup.LayoutParams> LayoutBuilder<V, P>.surfaceView(block: (SurfaceView.() -> Unit)? = null) =
        addViewBuilderFor(SurfaceView(viewGroup.context), block)

// TextureView

fun textureView(context: Context, block: (TextureView.() -> Unit)? = null) =
        viewBuilderFor(TextureView(context), block)

fun <V : ViewGroup, P : ViewGroup.LayoutParams> LayoutBuilder<V, P>.textureView(block: (TextureView.() -> Unit)? = null) =
        addViewBuilderFor(TextureView(viewGroup.context), block)

// CalendarView

fun calendarView(context: Context, block: (CalendarView.() -> Unit)? = null) =
        viewBuilderFor(CalendarView(context), block)

fun <V : ViewGroup, P : ViewGroup.LayoutParams> LayoutBuilder<V, P>.calendarView(block: (CalendarView.() -> Unit)? = null) =
        addViewBuilderFor(CalendarView(viewGroup.context), block)

// DatePicker

fun datePicker(context: Context, block: (DatePicker.() -> Unit)? = null) =
        viewBuilderFor(DatePicker(context), block)

fun <V : ViewGroup, P : ViewGroup.LayoutParams> LayoutBuilder<V, P>.datePicker(block: (DatePicker.() -> Unit)? = null) =
        addViewBuilderFor(DatePicker(viewGroup.context), block)

// NumberPicker

fun numberPicker(context: Context, block: (NumberPicker.() -> Unit)? = null) =
        viewBuilderFor(NumberPicker(context), block)

fun <V : ViewGroup, P : ViewGroup.LayoutParams> LayoutBuilder<V, P>.numberPicker(block: (NumberPicker.() -> Unit)? = null) =
        addViewBuilderFor(NumberPicker(viewGroup.context), block)

// CheckBox

fun checkBox(context: Context, block: (CheckBox.() -> Unit)? = null) =
        viewBuilderFor(CheckBox(context), block)

fun <V : ViewGroup, P : ViewGroup.LayoutParams> LayoutBuilder<V, P>.checkBox(block: (CheckBox.() -> Unit)? = null) =
        addViewBuilderFor(CheckBox(viewGroup.context), block)

// CheckedTextView

fun checkedTextView(context: Context, block: (CheckedTextView.() -> Unit)? = null) =
        viewBuilderFor(CheckedTextView(context), block)

fun <V : ViewGroup, P : ViewGroup.LayoutParams> LayoutBuilder<V, P>.checkedTextView(block: (CheckedTextView.() -> Unit)? = null) =
        addViewBuilderFor(CheckedTextView(viewGroup.context), block)

// GestureOverlayView

fun gestureOverlayView(context: Context, block: (GestureOverlayView.() -> Unit)? = null) =
        viewBuilderFor(GestureOverlayView(context), block)

fun <V : ViewGroup, P : ViewGroup.LayoutParams> LayoutBuilder<V, P>.gestureOverlayView(block: (GestureOverlayView.() -> Unit)? = null) =
        addViewBuilderFor(GestureOverlayView(viewGroup.context), block)

// QuickContactBadge

fun quickContactBadge(context: Context, block: (QuickContactBadge.() -> Unit)? = null) =
        viewBuilderFor(QuickContactBadge(context), block)

fun <V : ViewGroup, P : ViewGroup.LayoutParams> LayoutBuilder<V, P>.quickContactBadge(block: (QuickContactBadge.() -> Unit)? = null) =
        addViewBuilderFor(QuickContactBadge(viewGroup.context), block)

// RatingBar

fun ratingBar(context: Context, block: (RatingBar.() -> Unit)? = null) =
        viewBuilderFor(RatingBar(context), block)

fun <V : ViewGroup, P : ViewGroup.LayoutParams> LayoutBuilder<V, P>.ratingBar(block: (RatingBar.() -> Unit)? = null) =
        addViewBuilderFor(RatingBar(viewGroup.context), block)

// SearchView

fun searchView(context: Context, block: (SearchView.() -> Unit)? = null) =
        viewBuilderFor(SearchView(context), block)

fun <V : ViewGroup, P : ViewGroup.LayoutParams> LayoutBuilder<V, P>.searchView(block: (SearchView.() -> Unit)? = null) =
        addViewBuilderFor(SearchView(viewGroup.context), block)

// SeekBar

fun seekBar(context: Context, block: (SeekBar.() -> Unit)? = null) =
        viewBuilderFor(SeekBar(context), block)

fun <V : ViewGroup, P : ViewGroup.LayoutParams> LayoutBuilder<V, P>.seekBar(block: (SeekBar.() -> Unit)? = null) =
        addViewBuilderFor(SeekBar(viewGroup.context), block)

// Switch

fun switch(context: Context, block: (Switch.() -> Unit)? = null) =
        viewBuilderFor(Switch(context), block)

fun <V : ViewGroup, P : ViewGroup.LayoutParams> LayoutBuilder<V, P>.switch(block: (Switch.() -> Unit)? = null) =
        addViewBuilderFor(Switch(viewGroup.context), block)

// TextClock

fun textClock(context: Context, block: (TextClock.() -> Unit)? = null) =
        viewBuilderFor(TextClock(context), block)

fun <V : ViewGroup, P : ViewGroup.LayoutParams> LayoutBuilder<V, P>.textClock(block: (TextClock.() -> Unit)? = null) =
        addViewBuilderFor(TextClock(viewGroup.context), block)

// TimePicker

fun timePicker(context: Context, block: (TimePicker.() -> Unit)? = null) =
        viewBuilderFor(TimePicker(context), block)

fun <V : ViewGroup, P : ViewGroup.LayoutParams> LayoutBuilder<V, P>.timePicker(block: (TimePicker.() -> Unit)? = null) =
        addViewBuilderFor(TimePicker(viewGroup.context), block)

// ToggleButton

fun toggleButton(context: Context, block: (ToggleButton.() -> Unit)? = null) =
        viewBuilderFor(ToggleButton(context), block)

fun <V : ViewGroup, P : ViewGroup.LayoutParams> LayoutBuilder<V, P>.toggleButton(block: (ToggleButton.() -> Unit)? = null) =
        addViewBuilderFor(ToggleButton(viewGroup.context), block)

// VideoView

fun videoView(context: Context, block: (VideoView.() -> Unit)? = null) =
        viewBuilderFor(VideoView(context), block)

fun <V : ViewGroup, P : ViewGroup.LayoutParams> LayoutBuilder<V, P>.videoView(block: (VideoView.() -> Unit)? = null) =
        addViewBuilderFor(VideoView(viewGroup.context), block)

// WebView

fun webView(context: Context, block: (WebView.() -> Unit)? = null) =
        viewBuilderFor(WebView(context), block)

fun <V : ViewGroup, P : ViewGroup.LayoutParams> LayoutBuilder<V, P>.webView(block: (WebView.() -> Unit)? = null) =
        addViewBuilderFor(WebView(viewGroup.context), block)