package day1.problem7;

import java.util.HashSet;
import java.util.Set;

public class Determine_Consecutive_Numbers {

	public static void main(String[] args) {

		System.out.println(check_Consecutive(1,2,3,4,5));
		System.out.println(check_Consecutive(1,2,4,5));
		System.out.println(check_Consecutive(1,2,3,3,4,5));

	}

	private static boolean check_Consecutive(int ...nums) 
	{
		if(nums==null || nums.length==0)
		{
			return false;
		}
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;


		Set<Integer> set=new HashSet<>();
		for(int n:nums)
		{
			if(!set.add(n))
			{
				return false;
			}
			if(n>max)
			{
				max=n;
			}
			if(n<min)
			{
				min=n;
			}
		}
		return (max-min)+1 == nums.length;
	}

}
