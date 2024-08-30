package star_design_patterns;

import java.util.Scanner;

public class All_Star_Patterns {

	public static void main(String[] args) {

		//		Scanner sc=new Scanner(System.in);
		//		System.out.println(" enter no of rows n");
		//		int n = sc.nextInt();

		int n=5;

		// 1
		square(n);
		System.out.println("-------------");

		// 2
		inverted_Pyramid(n);
		System.out.println("-----------");

		// 3
		Pyramid(n);
		System.out.println("-----------");

		// 4
		Diamond(n);
		System.out.println("-----------");

		// 5
		Hellow_Square(n);
		System.out.println("-----------");

		// 6
		Butterfly_pattern(n);
		System.out.println("-----------");

		// 7
		Downward_Triangle(n);
		System.out.println("-----------");

		// 8
		Hellow_Diamond(n);
		System.out.println("-----------");

		//9
		cross_star(n);
		System.out.println("------------");

		//10
		Hollow_Pyramid_Star_Pattern(n);
		System.out.println("------------");



	}

	private static void Hollow_Pyramid_Star_Pattern(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				if(j==i || i==n || j==1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

	private static void cross_star(int n)
	{

		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j==n/2+1 || i==n/2+1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

	private static void Hellow_Diamond(int n)
	{

		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print("*");
			}
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int j=i;j<=n;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

		for(int i=2;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			for(int j=i;j<n;j++)
			{
				System.out.print(" ");
			}
			for(int j=i;j<n;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}


	}

	private static void Downward_Triangle(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	private static void Butterfly_pattern(int n) 
	{
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			for(int j=i;j<n;j++)
			{
				System.out.print("  ");
			}
			for(int j=i;j<n;j++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print("* ");
			}
			for(int j=1;j<i;j++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<i;j++)
			{
				System.out.print("  ");
			}
			for(int j=i;j<=n;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

	private static void Hellow_Square(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1 || i==n || j==1 || j==n)
				{
					System.out.print("* ");	
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}		
	}

	private static void Diamond(int n)
	{
		for(int i=1;i<n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int j=i;j<=n;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

	private static void Pyramid(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

	private static void inverted_Pyramid(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int j=i;j<=n;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	private static void square(int n) 
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
