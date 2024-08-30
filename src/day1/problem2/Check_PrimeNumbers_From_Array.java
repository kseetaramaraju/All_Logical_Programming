package day1.problem2;

import java.util.Scanner;

public class Check_PrimeNumbers_From_Array {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println(" enter array size ");
		int size = sc.nextInt();
		int arr[]=new int[size];
		System.out.println(" enter array elements ");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}

		String check = check(arr);
		System.out.println(check);

	}

	public static String check(int[] arr)
	{
		String res="";
		for(int i=0;i<arr.length;i++)
		{
			if(Prime(arr[i]))
			{
				res=res+arr[i]+" ";
			}
		}
		return res;
	}
	public static boolean Prime(int n)
	{
		for(int i=2;i<n/2;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
}
