  
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Michael Hickey
 */

package oop.example;
import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many people? ");
        int people = scanner.nextInt();

        System.out.println("How many pizzas do you have? ");
        int pizzas = scanner.nextInt();

        System.out.println("How many slices per pizza? ");
        int slicesPerPizza = scanner.nextInt();

        int totalSlices = pizzas * slicesPerPizza;
        System.out.println(people + " people with " + pizzas + " pizzas (" + totalSlices + " slices)");

        int slicesPerPerson = totalSlices / people;
        System.out.println("Each person gets " + slicesPerPerson + " pieces of pizza.");

        int leftOver = totalSlices % people;
        System.out.println("There are " + leftOver + " leftover pieces.");

    }
}