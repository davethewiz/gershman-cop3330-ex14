/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Dave Gershman
 */

public class App
{
    public static void main( String[] args )
    {
        double orderAmount = Input.GetDouble("What is the order amount? ");
        String state = Input.GetString("What is the state? ").toLowerCase();

        double total = orderAmount;

        String output = "";

        if (state.equals("wi") || state.equals("wisconsin")) {
            output += String.format("The subtotal is $%.2f.\n", orderAmount);

            double taxRate = 0.055;
            double tax = orderAmount * taxRate;
            output += String.format("The tax is $%.2f.\n", tax);

            total += tax;
        }

        output += String.format("The total is $%.2f.", total);

        System.out.print(output);
    }
}
