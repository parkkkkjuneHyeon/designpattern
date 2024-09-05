package com.junhyun.designpattern.createinstancepattern.prototype.pattern;

import java.util.ArrayList;

public class BookShelf implements Cloneable{
    private ArrayList<Book> books;

    public BookShelf() {
        books = new ArrayList<>();
    }
    public void add(Book book) {
        books.add(book);
    }
    public Book getBook(int index) {
        return books.get(index);
    }
    public BookShelf getCloneBookShelf() throws CloneNotSupportedException {
        return (BookShelf) clone();
    }

    @Override
    public String toString() {
        return "BookShelf{" +
                "books=" + books +
                '}';
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        BookShelf bookShelf = new BookShelf();

        //얕은 복사를 하지않기 위해 새롭게 생성자를 생성해서 같은 데이터를 넣어줌.
        //즉 다른 메모리 주소에 Book객체를 생성해서 같은 데이터를 주입
        for (Book book : books)
            bookShelf.add(new Book(book.getAuthor(), book.getTitle()));

        return bookShelf;
    }
}
