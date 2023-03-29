package com.devxschool;

public class Test {
    public  int number;

    public  Test(){
        this.number = 10;
    }

    public  void  setNumber(int number){
        this.number = number;
        new Test().number = number;
    }

}
