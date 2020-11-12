package ru.geekbrains.java_one.homework_four;

import ru.geekbrains.java_one.homework_four.job.members;

public class Main {

    public  static void main(String[] args) {
        // Не понятно чьи ФИО и должность вывести, ведь у нас еще нет ни одного сотрудника.
        members member1 = new members("Ivanov Ivan Ivanovich", "director", 11111111111l, 2000000, 55);
        System.out.println(member1.getFullName() + " - " + member1.getPosition());
    }
}
