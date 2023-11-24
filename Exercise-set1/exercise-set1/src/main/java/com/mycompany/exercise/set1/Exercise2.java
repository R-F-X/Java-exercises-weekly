package com.mycompany.exercise.set1;

// arraylist
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise2 {

    Scanner userIn = new Scanner(System.in);

    private ArrayList<Double> values;

    // METHODS
    Exercise2() {
        this.values = new ArrayList<>();
        values.add(2.0);
        values.add(2.3);
        values.add(1.2);
        values.add(40.2);
        values.add(42.6);
    }
    // ================================
    
    // main
    public void mainArrayList(){
        // title
        System.out.println("\nArrayLists\n");
        addToList();
        
        // display results
        System.out.println("\n==============================");
        System.out.println("Sum: \t\t" + calcSum());
        System.out.println("Average: \t" + calcAverage());
        System.out.println("==============================");
    }
    // ================================


    // user entering 3 more values
    public void addToList() {
        System.out.println("Enter 3 values");

        int counter = 3;
        do {
            System.out.print("\nEnter a decimal number: ");
            String numStr = userIn.next();

            try {
                // double numDub = Double.valueOf(numStr);
                double numDub = Double.parseDouble(numStr);
                values.add(numDub);
                counter -= 1;
            } 
            
            catch (Exception e) {
                System.out.println("*invalid input*");
            }
        } 
        
        while (counter > 0);
    }
    // ================================

    // calculations
    public double calcSum() {
        double sum = 0;

//        for (int a = 0; a < values.size(); a++) {
//            sum += values.get(a);
//        }

        // for each loops
        // values.forEach();

        for (double value : values){
            sum += value;
        }
        
        return sum;
    }

    public double calcAverage() {
        double average = calcSum() / values.size();
        return average;
    }
}
