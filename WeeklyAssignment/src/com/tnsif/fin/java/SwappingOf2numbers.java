package com.tnsif.fin.java;
import java.util.Scanner;

public class SwappingOf2numbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first value");
		int x=sc.nextInt();
		System.out.println("Enter the second value");
		int y=sc.nextInt();
		System.out.println("Before swapping values are "+x+" and "+y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("After swapping values are "+x+" and "+y);
		
		
		// TODO Auto-generated method stub
		

	}

}
