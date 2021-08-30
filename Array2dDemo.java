import java.util.Scanner;

public class Array2dDemo {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		int i,j,m,n;

		Scanner sc=new Scanner(System.in);
		//take no of rows
		System.out.println("enter no of rows");
		 m=sc.nextInt();
		//take no of col
				System.out.println("enter no of rows");
				 n=sc.nextInt();
					int p[][]=new int[m][n];
				//take elements from user
				System.out.println("enter elements");
				for( i=0;i<m;i++) {
					for( j=0;j<n;j++) {
						 p[i][j]=sc.nextInt();
					}
				}
				System.out.println("array elements");
				for(i=0;i<m;i++) {
					for(j=0;j<n;j++) {
						
						System.out.print( p[i][j]+" ");
					}
					System.out.println();
				}
	}

}
