package com.devxschool;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;

public class ClockDemoTest {

    @Test
    public void mainTest() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        ClockDemo.main(new String[0]);

        assertEquals("Output of main method in ClockDemo class",
                ("(12:00:01)\n" + // 00:00:00 firstClock
                        "(12:00:02)\n" +
                        "(12:00:03)\n" +
                        "(12:00:04)\n" +
                        "(12:00:05)\n" +
                        "(12:00:06)\n" +
                        "(12:00:07)\n" +
                        "(12:00:08)\n" +
                        "(12:00:09)\n" +
                        "(12:00:10)\n" +

                        "(11:59:58)\n" + // 12:00:00 second clock
                        "(11:59:57)\n" +
                        "(11:59:56)\n" +
                        "(11:59:55)\n" +
                        "(11:59:54)\n" +
                        "(11:59:53)\n" +
                        "(11:59:52)\n" +
                        "(11:59:51)\n" +
                        "(11:59:50)\n" +
                        "(11:59:49)\n" +

                        "(12:00:00)\n" + // firstClock after addClock method

                        "(23:59:50)\n" + // secondClock

                        "(12:00:00)\n").trim(), // thirdClock after result of subtractClock method
                out.toString().trim());
    }
}
