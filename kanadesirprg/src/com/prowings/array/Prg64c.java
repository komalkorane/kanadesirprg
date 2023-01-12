//c. Store 5 values into an array & Move values to R.H.S. & 
// Remove last value

package com.prowings.array;

import java.util.Scanner;

public class Prg64c {
	
public static void main(String[] args) {
	int y=1;
	int a[]=new int [10];
	int b[]=new int [10];
	Scanner sc=new Scanner (System.in);
	for(int w=1;w<10;w++) {
		System.out.println("enter any value");
		a[w]=sc.nextInt();
			b[0]=0;
			b[y]=a[w];
			y++;
	
		}
	for(int i=0;i<10;i++) {
		System.out.println(b[y]);
	}
	}
}

