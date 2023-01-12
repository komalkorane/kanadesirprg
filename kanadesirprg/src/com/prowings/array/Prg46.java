package com.prowings.array;
import java.util.Scanner;
public class Prg46 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter number :");
		 int num=sc.nextInt();
		 int rem=0;
		 while(num>0)
		 {
			 rem=num%10;
			 System.out.println(rem);
			 num=num/10;
		 }
	}
}