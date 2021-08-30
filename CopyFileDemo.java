import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CopyFileDemo {

	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("provide source file name");
		String sfile=sc.next();
		System.out.println("provide destination file name");
		String dfile=sc.next();
		FileReader fin=new FileReader(sfile);
		FileWriter fout=new FileWriter(dfile,true);
		int k;
		while((k=fin.read())!=-1) {
			fout.write(k);
			
		}
		System.out.println("file copied....");
		fin.close();
		fout.close();
	}

}
