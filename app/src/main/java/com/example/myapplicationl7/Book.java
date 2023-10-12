package com.example.myapplicationl7;

public class Book {

    private String title;
    private String author;
    private String category;
    private double price;
    private boolean avalibality;

    public Book(String title, String author, String category, double price, boolean avalibality) {
        this.title = title;
        this.author = author;
        this.category = category;
        this.price = price;
        this.avalibality = avalibality;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvalibality() {
        return avalibality;
    }

    public void setAvalibality(boolean avalibality) {
        this.avalibality = avalibality;
    }
}
