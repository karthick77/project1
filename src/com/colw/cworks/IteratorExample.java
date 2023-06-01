package com.colw.cworks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorExample {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add("Vishal");
		al.add("suriyan");
		al.add("nithya");
		al.add("suresh");
		al.add("Vignesh");
		
		
		System.out.println(al);
		
		//But loop will traverse only in forward direction
		//System.out.println("Loop via for each loop:");
		/*
		 * for(Object lp : al) { System.out.println(lp); }
		 */		
		System.out.println("Loop via Iterator");
		ListIterator<String> li = al.listIterator();
		
		while(li.hasNext()) 
		{
			if(li.next().equals("Vignesh")) {
				li.remove();
			}
				
		}
		System.out.println(al);		
				
		for(Object str : al) {
			System.out.println(str);
		}
		
		
		while(li.hasPrevious()) {
			if(li.previous().equals("suresh")) {
				li.remove();
			}
		}System.out.println(al);
		
		for(Object str : al) {
			System.out.println(str);
		}
		
		li.add("Ram Charan");
		System.out.println("Set values");
		
		while(li.hasNext()) {
			
			if(li.next().equals("nithya")) {
				li.set("Shree");
			}
		}System.out.println(al);
		
		for(Object str : al) {
			System.out.println(str);
		}
	}
	
}
