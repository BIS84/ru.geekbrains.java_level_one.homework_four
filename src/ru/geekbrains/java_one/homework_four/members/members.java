package ru.geekbrains.java_one.homework_four.members;

public class members {

    private static final int CURRENT_YEAR = 2020;
    String fullName;
    String position;
    int phone;
    float salary;
    int age;

    public members(String fullName, String position, int phone, float salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public String getFullName() {return fullName;}

    public String getPosition() {return position;}

    public int getPhone() {return phone;}

    public float getSalary() {return salary;}

    public int getAge() {return age;}
}
