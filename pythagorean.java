package practice_questions;

import java.util.*;

public class pythagorean_triplet {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of testcases");
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int c=0;
			System.out.println("Enter array size");
			int n=sc.nextInt();
			int a[]=new int[n];
			System.out.println("Enter elements");
			for(int j=0;j<n;j++)
			{
				a[j]=sc.nextInt();
			}

			Arrays.sort(a);
			for(int j=0;j<n-2;j++)
			{
				for(int k=j+1;k<n-1;k++)
				{
					for(int l=k+1;l<n;l++)
					{
						if( (a[j]*a[j]) + (a[k]*a[k]) == (a[l]*a[l]) )
						{
							c=1;
							break;

						}
					}
				}
			}
			if(c==1)
			{
				System.out.println("Yes");
			}
			else
			System.out.println("No");
		}
	}

}
