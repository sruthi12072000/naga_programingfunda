package com.gradedproject.q2;

import java.util.Scanner;

public class BasePower {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter The Base Number X : ");
		int x=sc.nextInt();
		System.out.print("Enter The Power N : ");
		int n=sc.nextInt();
		 int result = power(x, n);
		    System.out.println(+x+ " power " +n+ " is : " + result);
		  }


	public static int power(int x ,int n) {
		if (n==0) {
			return 1;
		}
		else {
		      return x * power(x, n - 1);

}

}

}

