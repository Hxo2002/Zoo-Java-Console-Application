package com.ing.zoo;

import java.util.Random;

public class Cat {
    public String name;
    public String helloText;
    public String eatText;

    public Cat()
    {
    }

    public void sayHello()
    {
        helloText = "Miauuwww";
        System.out.println(helloText);
    }

    public void eatLeaves()
    {
        eatText = "yumm";
        System.out.println(eatText);
    }
}
