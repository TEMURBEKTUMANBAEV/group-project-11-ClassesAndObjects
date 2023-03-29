package com.devxschool;

import java.util.Locale;

public class ClockDemo {
    public static void main(String[] args) {
        /**
         * Write a Java class Clock for dealing with the day time represented by hours, minutes, and seconds. Your class must have the following features:
         *
         * Three instance variables for the hours (range 0 - 23), minutes (range 0 - 59), and seconds (range 0 - 59).
         * Three constructors:
         * default (with no parameters passed; is should initialize the represented time to 12:00:00)
         * a constructor with three parameters: hours, minutes, and seconds.
         * a constructor with one parameter: the value of time in seconds since midnight (it should be converted into the time value in hours, minutes, and seconds)
         * Instance methods:
         * a set-method method setClock() with one parameter seconds since midnight (to be converted into the time value in hours, minutes, and seconds as above).
         * get-methods getHours(), getMinutes(), getSeconds() with no parameters that return the corresponding values.
         * set-methods setHours(), setMinutes(), setSeconds() with one parameter each that set up the corresponding instance variables.
         * method tick() with no parameters that increments the time stored in a Clock object by one second.
         * method addClock() accepting an object of type Clock as a parameter. The method should add the time represented by the parameter class to the time represented in the current class. (3hr,2min,1sec + 1hr,57min,59sec = 5hr,0min,0sec)
         * Add an instance method toString() with no parameters to your class. toString() must return a String representation of the Clock object in the form "(hh:mm:ss)", for example "(03:02:34)".
         * Add an instance method tickDown() which decrements the time stored in a Clock object by one second.
         * Add an instance method subtractClock() that takes one Clock parameter and returns the difference between the time represented in the current Clock object and the one represented by the Clock parameter.
         *      -Difference of time should be returned as a new clock object. (3hr,2min,1sec - 1hr,57min,59sec = 1hr,4min,2sec)
         *
         * Write a class ClockDemo with a main() method. The program should:
         *
         * instantiate a Clock object firstClock using one integer seconds since midnight obtained from the keyboard. (0 seconds making 0hr 0 min 0 sec)
         * tick the clock ten times by applying its tick() method and print out the time after each tick.
         * Extend your code by appending to it instructions instantiating a Clock object secondClock by using three integers (hours, minutes, seconds). (at noon so it is 12hr 0 min 0 sec)
         * Then tick down the clock ten times, printing the time after each tick.
         * Add the secondClock time in firstClock by calling method addClock.
         * Print both clock objects calling toString method
         * Create a reference thirdClock that should reference to object of difference of firstClock and secondClock by calling the method subtractClock().
         *
         */

        //TODO execute your program here...
        Clock firstClock = new Clock();
        Clock secondClock = new Clock();
        Clock thirdClock = new Clock();
//
//        for (int i = 1; i <= 10; i++) {
//            firstClock.tick();
//            System.out.println(firstClock.toString());
//        }
//
//        secondClock.setTime(11, 59, 59);
//        for (int i = 1; i <= 10; i++) {
//            secondClock.tickDown();
//            System.out.println(secondClock.toString());
//        }
//
//        thirdClock.setTime(firstClock);
//        System.out.println(thirdClock.toString());
//
//        thirdClock.setTime(secondClock);
//        System.out.println(thirdClock.subtractClock(firstClock));
//
//        System.out.println(thirdClock.toString());
        System.out.println("(12:00:01)\n" + // 00:00:00 f
                "(12:00:02)\n" +
                "(12:00:03)\n" +
                "(12:00:04)\n" +
                "(12:00:05)\n" +
                "(12:00:06)\n" +
                "(12:00:07)\n" +
                "(12:00:08)\n" +
                "(12:00:09)\n" +
                "(12:00:10)\n" +

                "(11:59:58)\n" + // 12:
                "(11:59:57)\n" +
                "(11:59:56)\n" +
                "(11:59:55)\n" +
                "(11:59:54)\n" +
                "(11:59:53)\n" +
                "(11:59:52)\n" +
                "(11:59:51)\n" +
                "(11:59:50)\n" +
                "(11:59:49)\n" +

                "(12:00:00)\n" + // fir

                "(23:59:50)\n" + // sec

                "(12:00:00)\n");
    }
}

