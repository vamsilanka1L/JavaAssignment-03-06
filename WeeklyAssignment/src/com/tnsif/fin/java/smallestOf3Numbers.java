package com.tnsif.fin.java;
import java.util.Scanner;

public class smallestOf3Numbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First value");
		int x=sc.nextInt();
		System.out.println("Enter the second value");
		int y=sc.nextInt();
		System.out.println("Enter the third value");
		int z=sc.nextInt();
		if(x<y && x<z)
			System.out.println(x+" is smallest");
		else if(y<z && y<x)
			System.out.println(y+" is smallest");
		else
			System.out.println(z+" is smallest");
		
	}

}
