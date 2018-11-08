package com.company;

public class Book implements IBook{
    float height;
    float width;
    String title;
    int pagesQuantity;

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPagesQuantity() {
        return pagesQuantity;
    }

    public void setPagesQuantity(int pagesQuantity) {
        this.pagesQuantity = pagesQuantity;
    }

    @Override
    public void setAuthor(String authors)
    {

    }

    public Book(float height, float width, String title, int pagesQuantity) {
        this.height = height;
        this.width = width;
        this.title = title;
        this.pagesQuantity = pagesQuantity;
    }

    public Book() {
    }

    @Override
    public String toString() {
        return "Book{" +
                "height=" + height +
                ", width=" + width +
                ", title='" + title + '\'' +
                ", pagesQuantity=" + pagesQuantity +
                '}';
    }
}
