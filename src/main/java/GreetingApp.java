/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Filipe Pestana Frances
 */
import java.util.Scanner;
public class GreetingApp {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.println("What is your name?");
        String first = name.nextLine();
        System.out.println("Hello, "+first+", nice to meet you!");
    }
}