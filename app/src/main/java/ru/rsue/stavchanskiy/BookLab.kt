package ru.rsue.stavchanskiy

import android.content.Context
import java.util.UUID

class BookLab private constructor(context: Context) {
    val books = mutableListOf<Book>()
    init {
        for (i in 0..99) {
            val book = Book()
            book.title = "Book #$i"
            book.isReaded = i % 2 == 0
            books.add(book)
        }
    }

    companion object {
        private var INSTANCE: BookLab? = null
        fun get(context: Context): BookLab {
            if (INSTANCE == null)
                INSTANCE = BookLab(context)
            return INSTANCE!!
        }
    }

    fun getBook(id: UUID): Book? {
        for (book in books) {
            if (book.id == id) {
                return book
            }
        }
        return null
    }

}