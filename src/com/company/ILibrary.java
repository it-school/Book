package com.company;

public interface ILibrary {
    public void setState(Measurements.state state);
    public Measurements.state getState();
    public void setType(String type);
    public String getType();
    public void setStoragePlace(String storagePlace);
    public String getStoragePlace();
    public String toString();

}