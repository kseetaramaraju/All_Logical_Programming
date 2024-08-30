package day1.problem5;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MainClass {
	public static void main(String[] args) {


		// for odd or even
		//		Predicate1<Integer> p=new Predicate1<Integer>() {
		//			@Override
		//			public boolean test(Integer num) {
		//				if(num%2!=0)
		//				{
		//					return true;
		//				}
		//				return false;
		//			}
		//		};

		//		boolean test = p.test(9);
		//		System.out.println(test);


		//		Predicate1 p1 = (a)-> (a%2!=0)?true:false;
		//		System.out.println(p1.test(9));
		//
		//		Predicate1 p2 = (a)-> (Prime(a))?true:false;
		//		System.out.println(p2.test(11));
		//
		//		Predicate1 p3 = (a)-> (Palandrome(a))?true:false;
		//		System.out.println(p3.test(121));


		// reverse a string using streams 

		String s="java";

		String string = Stream.of(s)
				.map(str -> new StringBuffer(str).reverse())
				.collect(Collectors.joining(s));
		System.out.println(string);
		
	}

	private static boolean Palandrome(int a) {
		String s = String.valueOf(a);
		return IntStream.range(0,s.length()/2).noneMatch( i -> s.charAt(i)!=s.charAt(s.length()-i-1)  );
	}

	public static boolean Prime(int num)
	{
		return IntStream.range(2,num/2).noneMatch(i->num%i==0);
	}



}
