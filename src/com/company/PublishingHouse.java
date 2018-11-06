package com.company;

public class PublishingHouse {
    String name;
    int numberOfEdition;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = (name == "" ? "Гёте" : name);
    }

    public int getNumberOfEdition() {
        return numberOfEdition;
    }

    public void setNumberOfEdition(int numberOfEdition) {
        this.numberOfEdition = (numberOfEdition < 1 ? 1 : numberOfEdition);
    }

    public PublishingHouse(String name, int numberOfEdition) {
        this.name = name;
        this.numberOfEdition = numberOfEdition;
    }

    public PublishingHouse() {
    }

    @Override
    public String toString() {
        return "PublishingHouse{" +
                "name='" + name + '\'' +
                ", numberOfEdition=" + numberOfEdition +
                '}';
    }
}
