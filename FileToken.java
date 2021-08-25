
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class FileToken {
public void readData() throws IOException {
	String filepath="src/Employee.txt";
	BufferedReader br = new BufferedReader(new FileReader(filepath));
		String line = null;
		System.out.println("\nyour comma seperated data\n");
	while ((line = br.readLine()) != null) {
		  String[] values = line.split(",");
		  for (String str : values) {
			  
		    System.out.println(str);
		  }
}
	}
public void InsertData() throws IOException {
	
	int batchsize=50;
	Connection con=null;
	int count=0;
	try {
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/techrel_new","root","");
		//con.setAutoCommit(false);
		PreparedStatement stmt=con.prepareStatement("insert into dbcartoondetails (name,address,bornyear,salery)values(?,?,?,?)");
		
		BufferedReader br = new BufferedReader(new FileReader("src/Employee.txt"));
			String line = null;
		
		while ((line = br.readLine()) != null) {
			  String[] values = line.split(",");
			  for (String str : values) {
				  
			    System.out.print(str);
			  }
			  
		String name=values[0];
		  String address=values[1];
		  String bornyear=values[2];
		  String salery=values[3];
		  stmt.setString(1,name);
			stmt.setString(2,address);
			stmt.setInt(3,Integer.parseInt(bornyear));
			stmt.setInt(4,Integer.parseInt(salery));
			
			if(count%batchsize==0)
			{
				//stmt.executeBatch();
				int j=stmt.executeUpdate();
				System.out.println("\n"+j+" records inserted");
			}
			//stmt.executeBatch();
			//System.out.println("\n All records inserted Successfully");
	
	

		}
	}catch(Exception e1) {
			e1.printStackTrace();
}}
	


	public static void main(String[] args) throws SQLException, IOException {
		FileToken ft=new FileToken();
		ft.readData();
		ft.InsertData();
		
		}

	}


