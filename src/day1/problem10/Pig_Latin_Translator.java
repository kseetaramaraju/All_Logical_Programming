package day1.problem10;

import java.util.Scanner;

public class Pig_Latin_Translator {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println(" enter string");
		String s = sc.next();

		System.out.println(" normal string "+s);

		convert_To_PigLatin(s);

	}

	private static void convert_To_PigLatin(String s) 
	{
		s=s.toUpperCase();
		int vowelIndex=0;
		for(int i=0;i<s.length();i++)
		{
			if("AEIOU".indexOf(s.charAt(i))>-1)
			{
				vowelIndex=i;
				break;
			}
		}
		System.out.println(vowelIndex);

		String con = s.substring(0,vowelIndex);
		String vol = s.substring(vowelIndex);

		String res=vol+con+"AY";
		System.out.println(res);
	}
}
