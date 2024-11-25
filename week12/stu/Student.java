package com.zjnu.stu;

public class Student {
    // Encapsulation example
    // Private fields
    private String name;
    private int age;

    // Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }
  public void setAge(int age) {
      if (age > 0) {
          this.age = age;
      } else {
          System.out.println("Invalid age!");
      }
  }
}


