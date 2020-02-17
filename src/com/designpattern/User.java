package com.designpattern;

public class User {
    public String Name;
    public User(String name, int age) {
        this.Name = name;
    }
    //Fields

    //Methods

    public void sayHello() {
        System.out.println("- Hi, my name is "+ Name);
    }
}
