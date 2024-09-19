package com.example.project;

import java.text.DecimalFormat;

public class TipCalculator {
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
        //DO NOT DELETE ANY OF THE CODE BELOW      
        StringBuilder result = new StringBuilder();
        //your code here

        DecimalFormat df1 = new DecimalFormat( "#.## "); //i learned this from https://stackoverflow.com/questions/16583604/formatting-numbers-using-decimalformat

        double totalBill = (percent/100.0 * cost) + cost;
        double tipAmount = (totalBill - cost);
        double perPersonCost = (cost / people);
        double perPersonTipAmount = (tipAmount / people);
        double perPersonTotalCost = (totalBill / people);
        
                       
        result.append("-------------------------------\n");
        result.append("Total bill before tip: " + df1.format(cost) + "\n"); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("Total percentage: " + df1.format(percent) + "%\n");
        result.append("Total tip: " + df1.format(tipAmount) + "\n");
        result.append("Total Bill with tip: " + df1.format(totalBill) + "\n");
        result.append("Per person cost before tip: " + df1.format(perPersonCost) + "\n");
        result.append("Tip per person: " + df1.format(perPersonTipAmount) + "\n");
        result.append("Total cost per person: " + df1.format(perPersonTotalCost) + "\n");
        result.append("-------------------------------\n");


        return result.toString();
    }
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
        //try different values for people, percent, and cost to test your program before running test cases
        int people = 6; 
        int percent = 25;
        double cost = 50.9;              
        System.out.println(calculateTip(people,percent,cost));
    }
}
        
