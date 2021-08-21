package techrel;

import java.util.Scanner;

public class Average2 {

	public static void main(String[] args) {
		System.out.println("enter 3 no");
@SuppressWarnings("resource")
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
float d=(a+b+c)/3;
System.out.println("avg is : "+d);
	}

}
