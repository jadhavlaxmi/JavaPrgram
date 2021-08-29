import java.nio.charset.Charset;
import java.util.Scanner;

public class AllAsciiValDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter character");
		char ch;
		  ch=sc.next().charAt(0);  
		for(int i = 97; i <= 122; i++)  
		{  
			if(i==ch) {
		System.out.println(" The ASCII value of " + (char)i + "  =  " + i);  
		}  
		}
	}

}
