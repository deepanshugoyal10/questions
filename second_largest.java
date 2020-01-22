package practice_questions;

import java.util.Scanner;

public class Largest_number {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		int l=-999,sl=-999;
		for(int i=0;i<n;i++)
		{
			if(ar[i]>l)
			{
				l=ar[i];
			}
		}

		for(int i=0;i<n;i++)
		{
			if(ar[i]>sl && ar[i]<l)
			{
				sl=ar[i];
			}
		}
		System.out.println("Largest = "+l);
		System.out.println("SecondLargest = "+ sl);
	}

}
