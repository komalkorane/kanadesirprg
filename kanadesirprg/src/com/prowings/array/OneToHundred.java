package com.prowings.array;
import java.util.HashMap;

public class OneToHundred {
//*
	public static void main(String[] args) {
		int j = 1;
		for (int i = 1; i <= 100; i++) {
			j=i;
			if((i%3==0 || i%15==0) && (j%5==0 || j%15==0)) {
			   System.out.println("3 ="+i);
			   System.out.println("5 ="+j);
			}
//			if() {
//				   System.out.println("5 ="+i);
//				}
//			System.out.println("3 & 5 "+(i%15==0));
		}
	}
}
