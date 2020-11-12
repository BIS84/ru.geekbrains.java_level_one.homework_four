package ru.geekbrains.java_one.homework_four;

import ru.geekbrains.java_one.homework_four.job.members;

import java.lang.reflect.Member;

public class Main {

    // Task 6
    private static void salaryPlus(members Members[]) {
        for (int i = 0; i < 5; i++) {
            members member = Members[i];
            if (member.getAge() > 45) {
                float newSalary = member.getSalary() + 5000;
                member.setSalary(newSalary);
            }
        }
    }

    public  static void main(String[] args) {
        // Task 4
        members member0 = new members("Ivanov Ivan Ivanovich", "director", 11111111111l, 2000000, 55);
        System.out.println(member0.getFullName() + " - " + member0.getPosition());
        System.out.println();

        // Task 5
        members member1 = new members("name1", "position1", 22222222222l, 50000, 25);
        members member2 = new members("name2", "position2", 33333333333l, 32000, 41);
        members member3 = new members("name3", "position3", 44444444444l, 44000, 55);
        members member4 = new members("name4", "position4", 55555555555l, 25000, 47);
        members member5 = new members("name5", "position5", 66666666666l, 40000, 30);
        members[] Members = {member1, member2, member3, member4, member5};
        for (int i = 0; i < 5; i++) {
            members member = Members[i];
            if (member.getAge() > 40) {
                System.out.println(member.getFullName());
                System.out.println(member.getPosition());
                System.out.println(member.getPhone());
                System.out.println(member.getSalary());
                System.out.println(member.getAge());
                System.out.println();
            }
        }

        // Task 6
        salaryPlus(Members);
        for (int i = 0; i < 5; i++) {
            members member = Members[i];
            System.out.println(member.getFullName());
            System.out.println(member.getSalary());
            System.out.println();
        }

        // Task 7
        float sumSalary = 0;
        float sumAge = 0;
        for (int i = 0; i < 5; i++) {
            members member = Members[i];
            sumSalary += member.getSalary();
            sumAge += member.getAge();
        }
        float averageSalary = sumSalary / 5;
        System.out.println("average salary = " + averageSalary);
        float averageAge = sumAge / 5;
        System.out.println("average age = " + averageAge);
        System.out.println();
    }
}
