package practice_questions;

import java.util.Scanner;

public class leader {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}

			for(int i=0;i<n;i++)
			{
				int c=0;
				int z=a[i];
				for(int j=i;j<n;j++)
				{
					if(z<a[j])
					{
						c=1;
						break;
					}
				}
					if(c==0)
						System.out.print(z+" ");
			}


	}

}
