package com.app.demoapp

import java.text.SimpleDateFormat
import java.util.*

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 *
 * TODO: Replace all uses of this class before publishing your app.
 */
object ListItemContent {
    val itemList: MutableList<ListItem> = ArrayList()
    private val size = 7

    init {
        // Add some sample items.
        for (i in 1..size) {
            addItem(
                createItem(
                    i
                )
            )
        }
    }

    private fun addItem(item: ListItem) {
        itemList.add(item)
    }

    private fun createItem(position: Int): ListItem {
        return ListItem(
            position.toString(),
            "Item " + position,
            makeDetails(position)
        )
    }

    private fun makeDetails(position: Int): String {
        val builder = StringBuilder()
        val calendar:Calendar = Calendar.getInstance(Locale.TAIWAN)
        calendar.add(Calendar.DATE, (position-1)*-1)
        var dateFormat:SimpleDateFormat = SimpleDateFormat("yyyy/MM/dd", Locale.TAIWAN)
        var date:String = dateFormat.format(calendar.time)
        var day:String = calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG_FORMAT, Locale.ENGLISH)
        builder.append("$date ($day)")
        return builder.toString()

    }

    data class ListItem(val id: String, val content: String, val details: String) {
    }
}