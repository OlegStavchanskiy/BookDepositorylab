package ru.rsue.stavchanskiy

import java.util.Date
import java.util.UUID

class Book {
    var id: UUID
    private set
    var title = ""

    var date: Date
    var isReaded = false
    init {
        id = UUID.randomUUID()
        date = Date()
    }

}