import java.util.Scanner;

public class Palindromee {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int no = 0,rem;
		int rev = 0;

		System.out.println("enter no ");
		no=sc.nextInt();
		int temp=no;
		while(temp!=0)
		{rem=temp%10;
		rev=rev*10+rem;
		temp=temp/10;
		}
		if(no==rev)
		{
			System.out.println("no is palindrome");
		}
		else
		{
			System.out.println("no is not palindrome");
		}
		sc.close();

	}

}
