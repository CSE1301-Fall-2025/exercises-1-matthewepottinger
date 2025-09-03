package module1._3expressions;

import java.util.Scanner;

public class E11PizzaCalculatorInput {
	
	//Exercise 11: Add code to complete the program according to the flow chart given here:
	
	//https://131text.com/ns/books/published/csjava/Module1-Types-and-Names/topic-1-4-assignment.html#storing-user-input-in-variables
    public static void main(String[] args) {
        int pizzaSlices, numPeople, slicesPerPerson, leftoverSlices;
        Scanner scan = new Scanner(System.in);
        //add code to initialize pizzaSlices and numPeople from user input 
        System.out.println("How many slices?");
        pizzaSlices = scan.nextInt();
        System.out.println("How many people?");
		numPeople = scan.nextInt();
		slicesPerPerson = pizzaSlices / numPeople;
		leftoverSlices = pizzaSlices % numPeople;
		System.out.print("You will have " + slicesPerPerson + " slices per person, and ");
		System.out.println(leftoverSlices + " slice(s) leftover!");
        
        //add code to compute and print slicesPerPerson and leftoverSlices
       

    }

}
