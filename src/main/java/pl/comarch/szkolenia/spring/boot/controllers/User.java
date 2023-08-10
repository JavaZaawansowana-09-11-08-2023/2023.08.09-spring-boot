package pl.comarch.szkolenia.spring.boot.controllers;

public class User {
    private String name;
    private String surname;
    private int age;
    private String city;
    private String street;
    private String no;

    public User(String name, String surname, int age, String city, String street, String no) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.city = city;
        this.street = street;
        this.no = no;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }
}
