package techrel;
import java.util.Scanner;

//import techrel.*;
public class Prime2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter number ");
		try (Scanner sc = new Scanner(System.in)) {
			int n=sc.nextInt();
			/*int count=0;
   for(int i=1;i<=n;i++)
      {
			Demoprime p=new Demoprime(i);
			if(p.isPrime())
			{
				System.out.println("prime no : "+i);
				count++;
			}else
			{
				System.out.println("not a prime no : "+i);
			}
				

      }
   System.out.println("total prime no  : "+count);	*/

Demoprime p=new Demoprime(n);
				
			
				if(p.isPrime())
				{
					System.out.println(" prime no ");
				}else
				{
					System.out.println(" not prime no ");
					
				}
		}
		
	
	
	

	}
}
