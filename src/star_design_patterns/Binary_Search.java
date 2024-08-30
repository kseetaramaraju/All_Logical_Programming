package star_design_patterns;

import java.util.Arrays;

public class Binary_Search {
	public static void main(String[] args) {

		int arr[]= {3,1,4,5,2,6};

		int ind = binary_Search(arr,6);

		System.out.println(" ele index is :"+ind);

	}

	private static int binary_Search(int[] arr,int ele)
	{
		int[] a = sort(arr);
		System.out.println(" Sorted Array :"+Arrays.toString(a));

		int low=0;
		int high=a.length-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(a[mid]==ele)
			{
				return mid;
			}
			else if(ele>a[mid])
			{
				low=mid+1;
			}
			else
			{
				high=mid-1;
			}
		}
		return -1;
	}

	private static int[] sort(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
	}
}
