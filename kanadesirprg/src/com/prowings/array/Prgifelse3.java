package com.prowings.array;
import java.util.Scanner;
public class Prgifelse3 {

	public static void main(String[] args)
	{
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter marks :");
	   int marks=sc.nextInt();
	   
	   if(marks>55)
	   {
		   System.out.println("Candidate Pass :");
	   }
	   else
	   {
		   System.out.println("Canidtae failed :");
	   }
	}

}
