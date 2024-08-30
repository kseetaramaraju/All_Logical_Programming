package day1.problem1;

import java.util.Scanner;

public class Reverse_String_Without_Using_Reverse_Method {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println(" enter input ");
		String s = sc.next();

		reverse(s);

	}

	private static void reverse(String s) {

		String res="";

		for(int i=s.length()-1;i>=0;i--)
		{
			res=res+s.charAt(i);
		}

		System.out.println(" Reversed STring Is : "+res);
	}
}
