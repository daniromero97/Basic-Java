import java.util.Scanner;

/*
    Author: Daniel Romero
    Exercise: conversion of variables
*/


// Class TypeConversion
public class TypeConversion
{
    // Constants
    final Scanner in = new Scanner(System.in);

    // Methods
    void conversion()
    {
        byte a;
        short b;
        int c;
        long d;
        float e;
        char f;

        double entrada;

        System.out.print("Write the value (double) of the variable to convert: ");
        while(!in.hasNextDouble())
        {
            in.nextLine();
            System.out.println("Wrong value");
            System.out.print("Write the value of the variable to convert: ");
        }
        entrada = in.nextDouble();
        in.nextLine();

        a = (byte) entrada;
        b = (short) entrada;
        c = (int) entrada;
        d = (long) entrada;
        e = (float) entrada;
        f = (char) entrada;

        System.out.println("\n***** DATA *****");
        System.out.println("byte -> " + a);
        System.out.println("short -> " + b);
        System.out.println("int -> " + c);
        System.out.println("long -> " + d);
        System.out.println("float -> " + e);
        System.out.println("char -> " + f);

    }

    // Main method
    public static void main (String args[])
    {
        new TypeConversion().conversion();
    }
}
