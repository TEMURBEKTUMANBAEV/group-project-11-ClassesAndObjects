package com.devxschool;

public class Main {
    public static void main(String[] args) {
        Test test1 = new Test();

        Test test2 = new Test();

        Test test3 = new Test();

        Test test4 = new Test();


        test1.setNumber(20);
        test2.setNumber(30);
        test3.setNumber(40);
        test4.setNumber(50);

        System.out.println(test1.number); // Output: 20
        System.out.println(test2.number); // Output: 30
        System.out.println(test3.number); // Output: 40
        System.out.println(test4.number); // Output: 50

    }
}
