package com.hackbulgaria.programming51.week2;

public class Person {
  private String name;
  private int age;
  
  public static void haha() {
    System.out.println("Haha!");
  }
  
  public String getName() {
    return this.name;
  }
  
  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }
}

