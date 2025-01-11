package com.mru.oops1;
import java.util.ArrayList;
public class Java8features {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> List1 = new ArrayList<>();
		List1.add(10);
		List1.add(20);
		List1.add(30);
		List1.add(45);
		List1.add(55);
		
		//List1.forEach(num -> System.out.println(num));
		
		//print even numbers
		
		List1.stream().filter(num ->num%2==0).forEach(System.out::println);
		
		//print odd numbers
		List1.stream().filter(num ->num%2!=0).forEach(System.out::println);
		
		
		ArrayList<Integer> List2 = new ArrayList<>();
		List2.add(1);
		List2.add(2);
		List2.add(3);
		List2.add(4);
		List2.add(5);
		
		List2.stream().map(num ->num*10).forEach(System.out::println);
		ArrayList<String> List3 = new ArrayList<>();
		List3.add("Hello");
		List3.add("welcome");
		List3.add("dsa"); 
		
		List3.stream().map((name)->{
			return new StringBuilder(name).reverse().toString();
			}).forEach(System.out::println);
		}
		
		


	}

