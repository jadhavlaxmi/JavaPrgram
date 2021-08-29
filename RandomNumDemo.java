import java.util.Scanner;

public class RandomNumDemo {

	public static void main(String[] args) {
		int a=(int) (Math.random()*100);
		for(int k=1;k<=100;k++) {
		System.out.print("guess the number ");
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		
		if(i>a) {
			System.out.print("your number is greater than the given no plz try again ");
		}
		else if(i<a) {
			System.out.print("your number is smaller than the given no plz try again ");
		}
		else {
			System.out.print("well done your guess is correct !!!! ");
			System.exit(0);
		}
	}
		
	}
	}
