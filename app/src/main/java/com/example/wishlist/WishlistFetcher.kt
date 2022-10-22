package com.example.wishlist

class WishlistFetcher {
    companion object {
        val names = listOf<String>()
        val prices = listOf<String>()
        fun getItems(): MutableList<WishlistEntry> {
            var items : MutableList<WishlistEntry> = ArrayList()
            for (i in names.indices) {
                val item = WishlistEntry(names[i], prices[i])
                items.add(item)
            }
            return items
        }

        fun getNext5Emails(): MutableList<WishlistEntry> {
            var newItems : MutableList<WishlistEntry> = ArrayList()
            for (i in 0..4) {
                val item = WishlistEntry(names[i], prices[i])
                newItems.add(item)
            }
            return newItems
        }
    }
}

