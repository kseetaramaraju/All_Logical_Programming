package day1.problem9;

import java.util.Scanner;

public class Reverse_Only_Letters_In_A_String {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println(" enter string");
		String s = sc.next();

		System.out.println(" os :"+s);
		reverse_Letters(s);

	}

	private static void reverse_Letters(String s) 
	{
		StringBuilder letters=new StringBuilder();

		// extracting letters 
		for(char c:s.toCharArray())
		{
			if(Character.isLetter(c))
			{
				letters.append(c);
			}
		}
		letters.reverse();

		// re-construct the string
		StringBuffer res=new StringBuffer();
		int ind=0;
		for(char c:s.toCharArray())
		{
			if(Character.isLetter(c))
			{
				res.append(letters.charAt(ind++));
			}
			else
			{
				res.append(c);
			}
		}

		System.out.println(" res :"+res);

	}
}
