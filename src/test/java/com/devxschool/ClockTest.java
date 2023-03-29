package com.devxschool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClockTest {

    @Test
    public void noArgsConstructorTest(){
        Clock clock = new Clock();
        assertEquals("Default constructor's hour is set to 12", 12, clock.hours);
        assertEquals("Default constructor's minute is set to 0", 0, clock.minutes);
        assertEquals("Default constructor's second is set to 0", 0, clock.seconds);
    }

    @Test
    public void allArgsConstructorTest(){
        Clock clock = new Clock(23,59,59);
        assertEquals("All arguments constructor's hour is set to 23", 23, clock.hours);
        assertEquals("All arguments constructor's minute is set to 59", 59, clock.minutes);
        assertEquals("All arguments constructor's second is set to 59", 59, clock.seconds);
    }

    @Test
    public void oneParameterConstructorForSecondsTest(){
        Clock clock = new Clock(3661);
        assertEquals("One arguments constructor's seconds 3661", 1, clock.hours);
        assertEquals("One arguments constructor's seconds 3661", 1, clock.minutes);
        assertEquals("One arguments constructor's seconds 3661", 1, clock.seconds);
    }

    @Test
    public void oneParameterConstructorForSecondsTest2(){
        Clock clock = new Clock(90);
        assertEquals("One arguments constructor's seconds 90", 0, clock.hours);
        assertEquals("One arguments constructor's seconds 90", 1, clock.minutes);
        assertEquals("One arguments constructor's seconds 90", 30, clock.seconds);
    }

    @Test
    public void setClockTest(){
        Clock clock = new Clock();
        clock.setClock(62);
        assertEquals("Set clock method is set to 62", 0, clock.hours);
        assertEquals("Set clock method is set to 62", 1, clock.minutes);
        assertEquals("Set clock method is set to 62", 2, clock.seconds);
    }

    @Test
    public void setClockTest2(){
        Clock clock = new Clock();
        clock.setClock(3723);
        assertEquals("Set clock method is set to 3723", 1, clock.hours);
        assertEquals("Set clock method is set to 3723", 2, clock.minutes);
        assertEquals("Set clock method is set to 3723", 3, clock.seconds);
    }

    @Test
    public void getterSetterHoursTest(){
        Clock clock = new Clock();
        clock.setHours(23);
        assertEquals("Hours set in clock is 23", 23, clock.getHours());
    }

    @Test
    public void getterSetterMinutesTest(){
        Clock clock = new Clock();
        clock.setMinutes(59);
        assertEquals("Minutes set in clock is 59", 59, clock.getMinutes());
    }

    @Test
    public void getterSetterSecondsTest(){
        Clock clock = new Clock();
        clock.setSeconds(59);
        assertEquals("Seconds set in clock is 59", 59, clock.getSeconds());
    }

    @Test
    public void tickTest(){
        Clock clock = new Clock();
        clock.tick(); //1
        clock.tick(); //2
        clock.tick(); //3
        clock.tick(); //4
        clock.tick(); //5
        assertEquals("Ticked 5 times default constructor and verifying seconds:", 5, clock.getSeconds());
    }

    @Test
    public void tickTest2(){
        Clock clock = new Clock(0,59,59);
        clock.tick(); //0
        clock.tick(); //1
        clock.tick(); //2
        clock.tick(); //3
        clock.tick(); //4
        assertEquals("Ticked 5 times default constructor and verifying seconds:", 4, clock.getSeconds());
        assertEquals("Ticked 5 times default constructor and verifying minutes:", 0, clock.getMinutes());
        assertEquals("Ticked 5 times default constructor and verifying hours:", 1, clock.getHours());
    }

    @Test
    public void tickDownTest(){
        Clock clock = new Clock();
        clock.tickDown(); //59
        clock.tickDown(); //58
        clock.tickDown(); //57
        clock.tickDown(); //56
        clock.tickDown(); //55
        assertEquals("Ticked Down 5 times default constructor and verifying seconds:", 55, clock.getSeconds());
    }

    @Test
    public void tickDownTest2(){
        Clock clock = new Clock(1,0,2);
        clock.tickDown(); //1
        clock.tickDown(); //0
        clock.tickDown(); //59
        clock.tickDown(); //58
        clock.tickDown(); //57
        assertEquals("Ticked Down 5 times (01:00:02) and verifying seconds:", 57, clock.getSeconds());
        assertEquals("Ticked Down 5 times (01:00:02) and verifying seconds:", 59, clock.getMinutes());
        assertEquals("Ticked Down 5 times (01:00:02) and verifying seconds:", 0, clock.getHours());
    }

    @Test
    public void addClockTest(){
        Clock clock1 = new Clock(3,2,1); //3hr,2min,1sec + 1hr,57min,59sec = 5hr,0min,0sec
        Clock clock2 = new Clock(1,57,59);
        clock1.addClock(clock2);

        assertEquals("Sum of two clocks will be 5 hours", 5, clock1.getHours());
        assertEquals("Sum of two clocks will be 0 minutes", 0, clock1.getMinutes());
        assertEquals("Sum of two clocks will be 0 seconds", 0, clock1.getSeconds());
    }

    @Test
    public void subtractClockTest(){
        Clock clock1 = new Clock(3,2,1); //3hr,2min,1sec - 1hr,57min,59sec = 1hr,4min,2sec
        Clock clock2 = new Clock(1,57,59);
        Clock result = clock1.subtractClock(clock2);

        assertEquals("Difference of two clocks should be 1 hours 4 minutes 2 seconds", 1, result.getHours());
        assertEquals("Difference of two clocks should be 1 hours 4 minutes 2 seconds", 4, result.getMinutes());
        assertEquals("Difference of two clocks should be 1 hours 4 minutes 2 seconds", 2, result.getSeconds());
    }

    @Test
    public void toStringTest(){
        //03:02:34
        Clock clock = new Clock(3,2,34);
        assertEquals("toString should return (hh:mm:ss) format", "(03:02:34)", clock.toString());
    }
}
