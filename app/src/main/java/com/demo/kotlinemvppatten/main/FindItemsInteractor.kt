package antonioleiva.com.appkotlin.main

import android.support.v4.os.HandlerCompat.postDelayed


class FindItemsInteractor {

    fun findItems(callback: (List<String>) -> Unit) {
        callback(createArrayList())
    }

    private fun createArrayList(): List<String> = (1..10).map { "Item $it" }
}