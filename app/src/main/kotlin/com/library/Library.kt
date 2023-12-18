package com.library

class Library {
    private var books: Array<Book> = emptyArray()

    fun addBook(book: Book) {
        books += book
    }

    fun removeBook(book: Book) {
        books = books.filterNot { it == book }.toTypedArray()
    }

    fun getBookCount(): Int {
        return books.size
    }

    fun findBook(title: String): Book? {
        return books.find { it.title == title }
    }

    fun printBooks() {
        books.forEach { println(it.title) }
    }
}