package com.junhyun.designpattern.createinstancepattern.prototype;

import com.junhyun.designpattern.createinstancepattern.prototype.pattern.Book;
import com.junhyun.designpattern.createinstancepattern.prototype.pattern.BookShelf;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        BookShelf bookShelf = new BookShelf();

        bookShelf.add(new Book("이용범", "열한번째 사과나무"));
        bookShelf.add(new Book("J. K. 롤링", "해리포터 마법사의 돌"));
        bookShelf.add(new Book("J. K. 롤링", "해리포터 비밀의 방"));
        bookShelf.add(new Book("J. K. 롤링", "해리포터 아즈카반의 죄수"));

        System.out.println(bookShelf);
        BookShelf bookShelf2 = bookShelf.getCloneBookShelf();
        System.out.println("------------------------------------------------");
        System.out.println(bookShelf2);

        bookShelf.getBook(1).setTitle("해리포터 죽음의 성물 1");
        System.out.println("------------------------------------------------");

        System.out.println("bookShelf" + bookShelf);
        System.out.println("------------------------------------------------");
        System.out.println("bookShelf2" + bookShelf2);


    }
}
