package practice_questions;

import java.util.Arrays;
import java.util.Scanner;

public class anagram {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		int z1=c1.length;
		int z2=c2.length;
		Arrays.sort(c1);
		Arrays.sort(c2);
		int c=1;
		for(int i=0;i<z1;i++)
		{
			if(c1[i]!=c2[i])
			{
				c=0;
			}
		}
		if(c==0)
		{
			System.out.println("Not Anagrams");
		}
		else if(c==1)
		{
			System.out.println("Anagrams");
		}
	}

}
