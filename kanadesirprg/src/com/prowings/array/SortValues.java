package com.prowings.array;
import java.util.Scanner;
public class SortValues
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int s;
		int a[] = new int[10];

		for (int i = 0; i<a.length; i++) {
			System.out.println("\t Enter any value");
			a[i] = sc.nextInt();
		}
//		System.out.println("\t Value of an array are");
//		for (i = 0; i < a.length; i++) {
//			System.out.println(" " + a[i]);
//		}
		for (int j = 1; j<a.length; j++)
		{
			for (int i = 1; i<a.length; i++)
			{
				if (a[i]<a[i - 1])
				{
				    s = a[i];
					a[i] = a[i - 1];
					a[i - 1] = s;
				}
			}
		}
		System.out.println("Aftr sorting new values of an arrays are :");
		for (int i = 0; i<=9; i++) {
			System.out.print(" " + a[i]);
		}
	}
}