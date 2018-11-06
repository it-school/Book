package com.company;

public class Library implements ILibrary{
    Measurements.state state;
    String type;
    String storagePlace;

    public Measurements.state getState() {
        return state;
    }

    public void setState(Measurements.state state) {
        this.state = state;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String getStoragePlace() {
        return storagePlace;
    }

    public void setStoragePlace(String storagePlace) {
        this.storagePlace = storagePlace;
    }

    public Library(Measurements.state state, String type, String storagePlace) {
        this.state = state;
        this.type = type;
        this.storagePlace = storagePlace;
    }

    public Library() {
    }

    @Override
    public String toString() {
        return "Library{" +
                "state=" + state +
                ", type='" + type + '\'' +
                ", storagePlace='" + storagePlace + '\'' +
                '}';
    }
}
