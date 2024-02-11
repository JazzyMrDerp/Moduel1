//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Declaring variables
        int age = 25;
        double salary = 50000.0;
        String name = "John";

//        For loops
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteration: " + i);
        }
//        While loop:
        int count = 0;
        while (count < 3) {
            System.out.println("Count: " + count);
            count++;
        }

//        Do-While loop:
        int num = 1;
        do {
            System.out.println("Number: " + num);
            num++;
        } while (num <= 3);

//        If statement:
        int x = 10;
        if (x > 5) {
            System.out.println("x is greater than 5");
        }

//        If-Else Statement:
        int num_ = 7;
        if (num_ % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

//        Nested If-Else:
        int age_ = 18;
        if (age_ >= 18) {
            if (age_ < 21) {
                System.out.println("You're eligible but not for alcohol");
            } else {
                System.out.println("You're eligible for everything");
            }
        } else {
            System.out.println("You're not eligible");
        }

//        Switch Case:
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
// ...
            default:
                System.out.println("Invalid day");
        }
    }
}