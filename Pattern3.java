package techrel;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter number ");
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i;
		for(i=n;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				
				System.out.print(" * ");
				
			}
			System.out.println();
		}
	}

}
