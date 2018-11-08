package com.company;

import java.util.Arrays;

public class BookInLibrary implements IBookInLibrary{

    float width;
    float height;
    float price;
    int PagesQuantity;
    Author[] authors;
    String title;

    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(String author) {
        String authors[] = author.split(",");
        this.authors = new Author[authors.length > 0 ? authors.length : 1];

        for (int i = 0; i < this.authors.length; i++)
                this.authors[i] = new Author(authors[i].trim());
    }

    public BookInLibrary() {
    }

    public BookInLibrary(float width, float height, float price, int pagesQuantity, String author, String title) {
        this.width = width;
        this.height = height;
        this.price = price;
        PagesQuantity = pagesQuantity;
        this.setAuthors(author);
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

    @Override
    public void setAuthor(String authors) {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BookInLibrary(String name) {
        String[] names = name.split(",");
    }

    @Override
    public void setState(Measurements.state state) {

    }

    @Override
    public Measurements.state getState() {
        return null;
    }

    @Override
    public void setType(String type) {

    }

    @Override
    public String getType() {
        return null;
    }

    @Override
    public void setStoragePlace(String storagePlace) {

    }

    @Override
    public String getStoragePlace() {
        return null;
    }

    @Override
    public String toString() {
        return "BookInLibrary{" +
                "width=" + width +
                ", height=" + height +
                ", PagesQuantity=" + PagesQuantity +
                ", author='" + Arrays.toString(authors) + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
