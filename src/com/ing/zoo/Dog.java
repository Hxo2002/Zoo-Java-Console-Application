package com.ing.zoo;

import java.util.Random;

public class Dog {

    public String name;
    public String helloText;
    public String eatText;
    public String trick;

    public Dog()
    {
    }

    public void sayHello()
    {
        helloText = "woeff woeff";
        System.out.println(helloText);
    }

    public void eatLeaves()
    {
        eatText = "hmmm";
        System.out.println(eatText);
    }

    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "jumps in the sky";
        }
        else
        {
            trick = "sits down";
        }
        System.out.println(trick);
    }

}
