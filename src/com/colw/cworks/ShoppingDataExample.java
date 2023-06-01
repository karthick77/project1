package com.colw.cworks;

import java.util.ArrayList;
import java.util.Collections;

//https://www.geeksforgeeks.org/comparator-interface-java/
public class ShoppingDataExample {

	public static void main(String[] args) {

		Laptops lap1 = new Laptops("Samsung", 80000, 1.5f, true, 32, 999);
		Laptops lap2 = new Laptops("Lenovo", 60000, 2.0f, false, 8, 500);
		Laptops lap3 = new Laptops("HP", 70000, 2.5f, false, 16, 999);
		Laptops lap4 = new Laptops("Dell", 75000, 1.5f, true, 16, 999);
		Laptops lap5 = new Laptops("Mac", 99500, 1.0f, true, 64, 999);
		
		ArrayList<Laptops> laps = new ArrayList<Laptops>();
		laps.add(lap1);
		laps.add(lap2);
		laps.add(lap3);
		laps.add(lap4);
		laps.add(lap5);
		
		
		 ComparatorDemo cp = new ComparatorDemo(); 
		 Collections.sort(laps, new ComparatorDemo());
		 
		 System.out.println(" ");
		 System.out.println("****************************");
		 System.out.println("Sort By Brand");
			
			for(Laptops lp: laps) {
				System.out.println(lp);
			}
		
		 ComapratorPrice pri = new ComapratorPrice(); 
		 Collections.sort(laps, new ComapratorPrice());
		 
		 System.out.println(" ");
		 System.out.println("****************************");
		 System.out.println("Sort By Price");
		
		for(Laptops lp: laps) {
			System.out.println(lp);
		}
	}

}
