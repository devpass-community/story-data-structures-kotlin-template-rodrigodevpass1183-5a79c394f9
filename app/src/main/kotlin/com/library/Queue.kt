package com.library
import java.util.LinkedList

class Queue {
    private val books = LinkedList<Book>()

    fun isEmpty(): Boolean {
        return books.isEmpty()
    }

    fun enqueue(book: Book) {
        books.addLast(book)
    }

    fun dequeue(): Book? {
        if (!books.isEmpty()) {
            return books.removeFirst()
        }
        return null
    }
}