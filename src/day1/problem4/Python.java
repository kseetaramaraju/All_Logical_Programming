package day1.problem4;

public class Python {
	public static void main(String[] args) {

		int n=6;
		String s="PYTHON";
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(s.charAt(j-1)+" ");
			}
			System.out.println();
		}

	}
}
