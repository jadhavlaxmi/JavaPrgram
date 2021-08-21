import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int f=1;
		int i,n;
		System.out.println("enter no to find factorial");
		n=sc.nextInt();
		if(n<=0)
		{
			System.out.println("invalid no.");
		}else {
			for(i=1;i<=n;i++)
				f=f*i;
			System.out.println(" factorial  is= "+f);
		}
		sc.close();

	}

}

