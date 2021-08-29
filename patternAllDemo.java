//------------------pattern 1-------------------------------------------------------
public class patternAllDemo {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++)//rows
		{
			for(int j=1;j<=i;j++) {//columns
				
				System.out.print("*");
				
			}
			
			System.out.println();
		}
//--------------------------------pattern 2--------------------------------------------	
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++) {
				int k=1;
				System.out.print(k);
				k++;
			}
			
			System.out.println();
		}
//-------------------------------------pattern 3-----------------------------------------------		
		int i;
		int j;
		for( i=1;i<=5;i++)
		{
			for( j=1;j<=i;j++) {
				if ((i+j)%2==0){
				System.out.print(" 1 ");
				}else {
					System.out.print(" 0 ");
				}
			}
	
			System.out.println();
		}
//-----------------------------------pattern4-------------------------------------------------------		
		for(i=1;i<=5;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
					}
	


//-----------------------------------pattern 5---------------------------------------------------------------

for(i=1;i<=9;i++) {
	for(j=1;j<=i;j++) {
		if(i>5&&(i+j>10))
			break;
		System.out.print(" *");
	}
	System.out.println();
			}

//-------------------------------------------------------------------------------------------------------------------
	int k=1;	
for(i=1;i<=5;i++) {
	for(j=1;j<=i;j++) {
		System.out.print(k+" ");
		
	}
	k++;
	System.out.println();
			}

	}

}

















