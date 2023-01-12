// 45. Accept number and find maximum and minimum digit.

package com.prowings.array;

import java.util.Scanner;

public class Prg45 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number :");
		int num=sc.nextInt();
		int rem=0;
		int max=num%10;
		int min=num%10;
		
		while(num>0)
		{
			rem=num%10;
			if(rem<min)
				min=rem;
			
			else if(rem>max)
				max=rem;
			num=num/10;
		}
		System.out.println("Maximum number is "+max);
		System.out.println("Minimum number is "+min);
	}

}
