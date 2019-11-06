package com.company;

public class Person
{
    private String name;
    private String surname;
    private String place;

    public Person(String name, String surname, String place)
    {
        this.name = name;
        this.surname = surname;
        this.place = place;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPlace() {
        return place;
    }
}
