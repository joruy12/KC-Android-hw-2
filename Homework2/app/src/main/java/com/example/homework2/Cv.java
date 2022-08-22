package com.example.homework2;

public class Cv {
    private String name;
    private int Age;
    private String email;
    private int phoneNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Cv(String name, int age, String email, int phoneNumber) {
        this.name = name;
        Age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
}
