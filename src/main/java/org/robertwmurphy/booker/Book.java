package org.robertwmurphy.booker;

public class Book {

    private int id;
    private String title;
    private String subTitle;
    private String isbn10;
    private String isbn13;
    private int author;
    private int authorTwo;
    private int authorThree;
    private int authorFour;
    private int publisher;

    //Constructor
    Book() {

    }

    //Getters
    public int getID() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public String getISBN10() {
        return isbn10;
    }

    public String getISBN13() {
        return isbn13;
    }

    public int getAuthor() {
        return author;
    }

    public int getAuthorTwo() {
        return authorTwo;
    }

    public int getAuthorThree() {
        return authorThree;
    }

    public int getAuthorFour() {
        return authorFour;
    }

    public int getPublisher() {
        return publisher;
    }

    //Setters
    public void setID(int ID) {
        this.id = ID;
    }

    public void setTitle(String ttl) {
        this.title = ttl;
    }

    public void setSubTitle(String subTTL) {
        this.subTitle = subTTL;
    }

    public void setISBN10(String isbnTen) {
        this.isbn10 = isbnTen;
    }

    public void setISBN13(String isbnThirteen) {
        this.isbn13 = isbnThirteen;
    }

    public void setAuthor(int authOne) {
        this.author = authOne;
    }

    public void setAuthorTwo(int authTwo) {
        this.authorTwo = authTwo;
    }

    public void setAuthorThree(int authThree) {
        this.authorThree = authThree;
    }

    public void setAuthorFour(int authFour) {
        this.authorFour = authFour;
    }

    public void setPublisher(int publish) {
        this.publisher = publish;
    }
}
