package com.company;

public class BookInLibrary {

    float width;
    float height;
    float price;
    int PagesQuantity;
    String author;
    String title;

    public BookInLibrary() {
    }

    public BookInLibrary(float width, float height, float price, int pagesQuantity, String author, String title) {
        this.width = width;
        this.height = height;
        this.price = price;
        PagesQuantity = pagesQuantity;
        this.author = author;
        this.title = title;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getPagesQuantity() {
        return PagesQuantity;
    }

    public void setPagesQuantity(int pagesQuantity) {
        PagesQuantity = pagesQuantity;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "BookInLibrary{" +
                "width=" + width +
                ", height=" + height +
                ", PagesQuantity=" + PagesQuantity +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
