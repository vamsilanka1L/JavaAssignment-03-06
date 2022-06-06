package com.tnsif.fin.java;
import java.io.*;

public class PositiveOrNegative {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Number");
		int a=Integer.parseInt(br.readLine());
		if(a>0)
			System.out.println(a+" is positive");
		else
			System.out.println(a+" is negative");
		// TODO Auto-generated method stub

	}

}
