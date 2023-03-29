package com.devxschool;

public class Clock {
    public int hours;
    public int minutes;
    public int seconds;

    public Clock() {
        this.hours = 12;
        this.minutes = 0;
        this.seconds = 0;
    }

    public Clock(int seconds) {
        this.hours = seconds / 3600;
        this.minutes = (seconds % 3600) / 60;
        this.seconds = (seconds % 3600) % 60;
    }

    public Clock(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void setClock(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHours() {
        return this.hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return this.minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return this.seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public void tick() {
        this.seconds++;
        if (this.seconds >= 60) {
            this.seconds = 0;
            this.minutes++;
            if (this.minutes >= 60) {
                this.minutes = 0;
                this.hours++;
                if (this.hours >= 24) {
                    this.hours = 0;
                }
            }
        }
    }

    public void tickDown() {
        this.seconds--;
        if (this.seconds < 0) {
            this.seconds = 59;
            this.minutes--;
            if (this.minutes < 0) {
                this.minutes = 59;
                this.hours--;
                if (this.hours < 0) {
                    this.hours = 23;
                }
            }
        }
    }

    public Clock addClock(Clock clock) {
        int newSeconds = this.seconds + clock.getSeconds();
        int newMinutes = this.minutes + clock.getMinutes();
        int newHours = this.hours + clock.getHours();

        if (newSeconds >= 60) {
            newSeconds -= 60;
            newMinutes++;
        }
        if (newMinutes >= 60) {
            newMinutes -= 60;
            newHours++;
        }
        if (newHours >= 24) {
            newHours -= 24;
        }

        return new Clock(newHours, newMinutes, newSeconds);
    }

    public Clock subtractClock(Clock clock) {
        int newSeconds = this.seconds - clock.getSeconds();
        int newMinutes = this.minutes - clock.getMinutes();
        int newHours = this.hours - clock.getHours();

        if (newSeconds < 0) {
            newSeconds += 60;
            newMinutes--;
        }
        if (newMinutes < 0) {
            newMinutes += 60;
            newHours--;
        }
        if (newHours < 0) {
            newHours += 24;
        }

        return new Clock(newHours, newMinutes, newSeconds);
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}