package com.xworkz.libapp.book;

import java.util.Objects;

public class Book {
    private int bookId;
    private String bookName;
    private double price;
    private String author;
    private String publisher;

    @Override
    public boolean equals(Object obj) {
        // 🏎️ STEP 1: Memory Address Check (Speed Shortcut)
        // If they point to the exact same physical space in memory, they are identical.
        if (this == obj) {
            return true;
        }

        // 🛡️ STEP 2: Safety Guards (Crash Prevention)
        // If the other object is null, OR if it was built using a different Class blueprint,
        // they cannot be equal. Return false before any crash can happen.
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }

        // 🔍 STEP 3: Content Check (Your original logic, now 100% safe!)
        // Now that we verified 'obj' is safe and is definitely a Book,
        // we convert (cast) it to a Book object so we can read its variables.
        Book book = (Book) obj;

        // Compare all fields to see if the contents are identical
        if (this.bookId == book.bookId &&
                this.bookName.equals(book.bookName) &&
                this.author.equals(book.author) &&
                this.price == book.price &&
                this.publisher.equals(book.publisher)) {
            return true;
        } else {
            return false;
        }


    }

    @Override
    public int hashCode() {
        return Objects.hash(bookId, bookName, price, author, publisher);
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }
    public String getBookName(){
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}