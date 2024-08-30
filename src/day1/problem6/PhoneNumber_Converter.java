package day1.problem6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneNumber_Converter {
	static Map<Character,Integer> map=new HashMap<Character,Integer>();
	static {

		map.put('A',2);map.put('B',2);map.put('C',2);
		map.put('D',3);map.put('E',3);map.put('F',3);
		map.put('G',4);map.put('H',4);map.put('I',4);
		map.put('J',5);map.put('K',5);map.put('L',5);
		map.put('M',6);map.put('N',6);map.put('O',6);
		map.put('P',7);map.put('Q',7);map.put('R',7);
		map.put('S',7);map.put('T',8);map.put('U',8);
		map.put('V',8);map.put('W',9);map.put('X',9);
		map.put('Y',9);map.put('Z',9);

	}


	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println(" enter input ");
		String s = sc.next();

		convertString_To_PhoneNumber(s);

	}


	private static void convertString_To_PhoneNumber(String s) 
	{

		if (s == null || s.length() != 10) {
			throw new IllegalArgumentException("Invalid phone number length.");
		}
		
		s = s.toUpperCase();
		System.out.println(s);
		StringBuffer sb=new StringBuffer();
		sb.append('(');
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(i==3)
			{
				sb.append(')');
			}
			else if(i==6)
			{
				sb.append('-');
			}
			if(Character.isDigit(ch))
			{
				sb.append(ch);
			}
			else if(Character.isAlphabetic(ch))
			{
				if(!map.containsKey(ch))
				{
					throw new RuntimeException(" Invalid Character ");
				}
				sb.append(map.get(ch));
			}
			else
			{
				throw new RuntimeException(" Invalid Character ");
			}
		}

		System.out.println(sb);

	}
}
