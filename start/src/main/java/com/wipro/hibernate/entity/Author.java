package com.wipro.hibernate.entity;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Author {

    @Id
    private int authorId;
    private String authorName;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "book_id")   // FK column in Author table
    private Book book;

    public Author() {
        super();
    }

    public Author(int authorId, String authorName) {
        super();
        this.authorId = authorId;
        this.authorName = authorName;
    }

    public Author(int authorId, String authorName, Book book) {
        super();
        this.authorId = authorId;
        this.authorName = authorName;
        this.book = book;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
