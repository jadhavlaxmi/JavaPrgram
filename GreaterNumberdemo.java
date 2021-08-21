package techrel;

import java.util.Scanner;

public class GreaterNumberdemo {

	public static void main(String[] args) {
		System.out.println("enter 3 no to find greater number");
		
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();

		if(b<a && c<a) {
			System.out.println(a+"  is greater");
		}

		else if(c<b) {
			System.out.println(b+"  is greater");
		}

		else{
			System.out.println(c+"  is greater");
		}

	}

}
