package techrel;

import java.util.Scanner;

public class MathOperatinDemo {

	public static void main(String[] args) {
		int a,b,op;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first no.");
		a=sc.nextInt();
		System.out.println("enter the second no.");
		b=sc.nextInt();
		for(;;) {
		System.out.println("select opration :\n"
				+ "1. Additin\n"
				+ "2. substraction\n"
				+ "3. Multiplication\n"
				+ "4. Division\n"
				+ "5. exit");
		op=sc.nextInt();
		
		switch(op)
		{
		case 1:if (op==1)
			System.out.println("Additin : "+(a+b));
		break;
		case 2:if (op==2)
			System.out.println("substraction : "+(a-b));
		break;
		case 3:if (op==3)
			System.out.println("Multiplication : "+(a*b));
		break;
		case 4:if (op==4)
			System.out.println("Division : "+(a/b));
		break;
		case 5:if (op==5)
			System.out.println("Thank You ");
			System.exit(0);
		break;
		default:
			System.out.println("your Choice is wrong plz enter valid option ");
		}
		
		}
	}

}
