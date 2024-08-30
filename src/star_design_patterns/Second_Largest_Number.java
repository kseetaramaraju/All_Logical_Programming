package star_design_patterns;

public class Second_Largest_Number {
	public static void main(String[] args) {

		int arr[]= {3,1,4,5,2,6,7,8,9,10};

		second_largest(arr);

	}

	private static void second_largest(int[] arr)
	{
		int fl=Integer.MIN_VALUE;
		int sl=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>fl)
			{
				sl=fl;
				fl=arr[i];
			}
			else if(arr[i]>sl)
			{
				sl=arr[i];
			}
		}
		System.out.println(fl+"-----------"+sl);
	}
}
