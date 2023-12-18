package com.library
import java.util.LinkedList

class Stack {
    private val books = LinkedList<Book>()

    fun isEmpty(): Boolean {
        return books.isEmpty()
    }

    fun push(book: Book) {
        books.addFirst(book)
    }

    fun pop(): Book? {
        if (!books.isEmpty()) {
            return books.removeFirst()
        }
        return null
    }
}