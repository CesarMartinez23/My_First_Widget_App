package com.example.myfirstwidgetapp

import android.annotation.SuppressLint
import android.app.PendingIntent
import android.appwidget.AppWidgetManager
import android.appwidget.AppWidgetProvider
import android.content.Context
import android.content.Intent
import android.widget.RemoteViews

/**
 * Implementation of App Widget functionality.
 */
class Buttons : AppWidgetProvider() {
    override fun onUpdate(
        context: Context,
        appWidgetManager: AppWidgetManager,
        appWidgetIds: IntArray,
    ) {
        // There may be multiple widgets active, so update all of them
        for (appWidgetId in appWidgetIds) {
            updateAppWidget(context, appWidgetManager, appWidgetId)
        }
    }

    override fun onEnabled(context: Context) {
        // Enter relevant functionality for when the first widget is created
    }

    override fun onDisabled(context: Context) {
        // Enter relevant functionality for when the last widget is disabled
    }
}

@SuppressLint("UnspecifiedImmutableFlag")
internal fun updateAppWidget(
    context: Context,
    appWidgetManager: AppWidgetManager,
    appWidgetId: Int,
) {
    val openCanvas : PendingIntent = Intent(context, MainActivityCanvas::class.java).let { intent ->
        PendingIntent.getActivity(context, 0, intent, 0)
    }

    val openNotas : PendingIntent = Intent(context, MainActivityNotas::class.java).let { intent ->
        PendingIntent.getActivity(context, 0, intent, 0)
    }

    val views = RemoteViews(context.packageName, R.layout.buttons)
        .apply {
            setOnClickPendingIntent(R.id.btnCanvas, openCanvas)
        }
        .apply {
            setOnClickPendingIntent(R.id.btnNotas, openNotas)
        }

    // Instruct the widget manager to update the widget
    appWidgetManager.updateAppWidget(appWidgetId, views)
}