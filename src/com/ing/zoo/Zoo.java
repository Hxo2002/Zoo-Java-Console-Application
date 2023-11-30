package com.ing.zoo;



import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        String[] commands = new String[4];
        commands[0] = "hello";
        commands[1] = "give leaves";
        commands[2] = "give meat";
        commands[3] = "perform trick";

        Lion henk = new Lion();
        henk.name = "henk";
        Hippo elsa = new Hippo();
        elsa.name = "elsa";
        Pig dora = new Pig();
        dora.name = "dora";
        Tiger wally = new Tiger();
        wally.name = "wally";
        Zebra marty = new Zebra();
        marty.name = "marty";
        Dog binky = new Dog();
        binky.name = "binky";
        Cat anna = new Cat();
        anna.name = "anna";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");

        String input = scanner.nextLine();

        if (input.equals(commands[0])) {
            henk.sayHello();
            elsa.sayHello();
            dora.sayHello();
            wally.sayHello();
            marty.sayHello();
            binky.sayHello();
            anna.sayHello();
        } else if (input.startsWith(commands[0])) {
            String name = input.substring(commands[0].length() + 1);
            switch (name) {
                case "henk":
                    henk.sayHello();
                    break;
                case "elsa":
                    elsa.sayHello();
                    break;
                case "dora":
                    dora.sayHello();
                    break;
                case "wally":
                    wally.sayHello();
                    break;
                case "marty":
                    marty.sayHello();
                    break;
                case "binky":
                    binky.sayHello();
                    break;
                case "anna":
                    anna.sayHello();
                    break;
                default:
                    System.out.println("Unknown name: " + name);
            }
        } else if (input.equals(commands[1])) {
            elsa.eatLeaves();
            dora.eatLeaves();
            marty.eatLeaves();
            binky.eatLeaves();
            anna.eatLeaves();
        } else if (input.equals(commands[2])) {
            henk.eatMeat();
            wally.eatMeat();
            dora.eatMeat();
        } else if (input.equals(commands[3])) {
            wally.performTrick();
            dora.performTrick();
            binky.performTrick();
        } else {
            System.out.println("Unknown command: " + input);
        }
    }
}
