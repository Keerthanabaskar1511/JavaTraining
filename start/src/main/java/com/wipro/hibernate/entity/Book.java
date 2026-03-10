package com.wipro.hibernate.entity;



import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Book {

    @Id
    private int bookId;
    private String bookName;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "author_id")
    private Author author;

    public Book() {}

    public Book(int bookId, String bookName, Author author) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
    }

    // getters & setters
}
