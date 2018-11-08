package com.company;

import java.util.Arrays;
import java.util.Date;

public class Author {
    String name;
    String surname;
    String lastname;
    String country;

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

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

    public Author(String name)
    {
        String[] names = name.split(" ") ;
        this.surname = !names[0].equals("")?names[0]:"Unknown author";
        this.name = (names.length > 1 ? names[1] : "");
        if(names.length > 2)
        {
            this.lastname = Arrays.toString(Arrays.copyOfRange(names,2, names.length));
        }
        else
        {
            this.lastname = "";
        }

    }

    public Author() {

    }

    @Override
    public String toString() {
        return "Author{" +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
