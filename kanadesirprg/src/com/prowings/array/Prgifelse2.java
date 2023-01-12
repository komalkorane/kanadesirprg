package com.prowings.array;
import java.util.Scanner;
public class Prgifelse2 {

	public static void main(String[] args) 
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter two values");
	  int num1=sc.nextInt();
	  int num2=sc.nextInt();
	 
	  if(num1>num2) {
		  System.err.println(num1+" is larger number & "+num2+" is smaller number");
	  }
	  else
		  System.err.println(num2+" is larger number & "+num1+" is smaller number");
	  
	}

}
