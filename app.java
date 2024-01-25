package com.bldea.shoppingcart.package2;
import java.util.Scanner;
public class app {

	    public static void main(String[] args) {
	        // Declare and initialize the arrays for the items, companies and prices
	        String[] items = {"Laptop", "Smartphone", "Tablet", "TV"};
	        String[] companies = {"Apple", "Samsung", "Lenovo", "Sony"};
	        double[][] prices = {{1500.0, 1200.0, 800.0, 1000.0, 900.0}, // Prices for Apple
	                             {1000.0, 800.0, 600.0, 700.0, 500.0}, // Prices for Samsung
	                             {800.0, 600.0, 400.0, 500.0, 300.0}, // Prices for Lenovo
	                             {1200.0, 1000.0, 700.0, 800.0, 600.0}, // Prices for Sony
	                             }; // Prices for Canon
	        // Create a scanner object to get user input
	        Scanner sc = new Scanner(System.in);
	        // Display the list of items
	        System.out.println("Select an item from the following list:");
	        for (int i = 0; i < items.length; i++) {
	            System.out.println((i + 1) + ". " + items[i]);
	        }
	        // Get the user's choice of item
	        System.out.print("Enter your choice (1-5): ");
	        int itemChoice = sc.nextInt();
	        // Validate the user's choice of item
	        if (itemChoice < 1 || itemChoice > 5) {
	            System.out.println("Invalid choice");
	            return;
	        }
	        // Display the list of companies for the selected item
	        System.out.println("Select a company from the following list:");
	        for (int i = 0; i < companies.length; i++) {
	            System.out.println((i + 1) + ". " + companies[i]);
	        }
	        // Get the user's choice of company
	        System.out.print("Enter your choice (1-5): ");
	        int companyChoice = sc.nextInt();
	        // Validate the user's choice of company
	        if (companyChoice < 1 || companyChoice > 5) {
	            System.out.println("Invalid choice");
	            return;
	        }
	        // Display the name and price of the item from the selected company
	        System.out.println("You have selected " + items[itemChoice - 1] + " from " + companies[companyChoice - 1]);
	        System.out.println("The price is $" + prices[companyChoice - 1][itemChoice - 1]);
	    }
	
}
