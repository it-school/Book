package com.company;

import java.util.Date;

public class Author {
    String name;
    String surname;
    String country;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = (name == "" ? "Гёте" : name);
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = (surname == "" ? "Вольфганг" : surname);
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = (country == "" ? "Римская империя" : country);
    }

    public Author(String name, String surname, String country, Date birthday) {
        this.name = name;
        this.surname = surname;
        this.country = country;
    }

    public Author() {

    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
