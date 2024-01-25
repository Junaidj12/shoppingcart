package com.bldea.shoppingcart.package2;
import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
public class applo {
	// A java program to select an electronic item list and select the several companies for each electronic item and show the various products of selected electronic item and the company and at last after show the prices of the selected product from selected electronic item and company





	    // A nested HashMap to store the electronic items, companies, products and prices
	    private static HashMap<String, HashMap<String, HashMap<String, Integer>>> items;

	    // A method to initialize the items HashMap with some sample data
	    private static void initializeItems() {
	        items = new HashMap<>();

	        // Adding some electronic items
	        items.put("Laptop", new HashMap<>());
	        items.put("Smartphone", new HashMap<>());
	        items.put("Tablet", new HashMap<>());

	        // Adding some companies for each electronic item
	        items.get("Laptop").put("Dell", new HashMap<>());
	        items.get("Laptop").put("HP", new HashMap<>());
	        items.get("Laptop").put("Lenovo", new HashMap<>());
	        items.get("Smartphone").put("Samsung", new HashMap<>());
	        items.get("Smartphone").put("Apple", new HashMap<>());
	        items.get("Smartphone").put("OnePlus", new HashMap<>());
	        items.get("Tablet").put("Samsung", new HashMap<>());
	        items.get("Tablet").put("Apple", new HashMap<>());
	        items.get("Tablet").put("Amazon", new HashMap<>());

	        // Adding some products and prices for each company and electronic item
	        items.get("Laptop").get("Dell").put("Inspiron 15", 50000);
	        items.get("Laptop").get("Dell").put("XPS 13", 100000);
	        items.get("Laptop").get("Dell").put("Alienware M15", 150000);
	        items.get("Laptop").get("HP").put("Pavilion 14", 45000);
	        items.get("Laptop").get("HP").put("Envy 13", 80000);
	        items.get("Laptop").get("HP").put("Omen 15", 120000);
	        items.get("Laptop").get("Lenovo").put("IdeaPad Flex 5", 40000);
	        items.get("Laptop").get("Lenovo").put("ThinkPad X1 Carbon", 90000);
	        items.get("Laptop").get("Lenovo").put("Legion Y540", 100000);
	        items.get("Smartphone").get("Samsung").put("Galaxy S21", 70000);
	        items.get("Smartphone").get("Samsung").put("Galaxy Note 20", 80000);
	        items.get("Smartphone").get("Samsung").put("Galaxy Z Fold 3", 150000);
	        items.get("Smartphone").get("Apple").put("iPhone 12", 80000);
	        items.get("Smartphone").get("Apple").put("iPhone 12 Pro", 120000);
	        items.get
