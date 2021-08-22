package techrel;

import java.util.Scanner;

public class SwapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter two number a and b for swap");
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		SWAP(a,b);
		sc.close();
	}
	private static void SWAP(int a, int b) {
		// TODO Auto-generated method stub
		int temp=0;
		temp=a;
		a=b;
		b=temp;
		System.out.print("\nafter swappig a= "+a+" b= "+b);
	}

}
