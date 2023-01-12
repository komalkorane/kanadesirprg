package com.prowings.array;
import java.util.*;
public class PrimeNumberDemo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number :");
		int num=sc.nextInt();
		int count=0;
		
		for(int i=2;i<=num;i++) {
			if(num % i==0) {
				count++;
			}
			break;
		}
		if(count ==0)
			System.out.println("This is Prime number");
		else
			System.out.println("This is not Prime number");
	}

}
