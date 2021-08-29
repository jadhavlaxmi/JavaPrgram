import java.sql.*;
import java.util.Scanner;
public class JdbcConnectionAllCommand {
	private static Scanner sc;
	private static Connection con;
	static {
		Scanner sc=new Scanner(System.in);
	}

	public static void main(String[] args) {
		try {
			for(int i=1;i<=100;i++) {
			openConnection();

			while(true) {

				System.out.println("select the operation :\n"
						+ "1. Show All Records\n"
						+ "2. Search\n"
						+ "3. Insert\n"
						+ "4. update\n"
						+ "5. Delete\n"
						+ "6. Exit");
				@SuppressWarnings("resource")
				Scanner sc=new Scanner(System.in);
				int op=sc.nextInt();

				switch(op)
				{
				case 1://if(op==1)
					showAll();
				break;
				case 2://if(op==2)
					searchByRoll();
				break;	
				case 3://if(op==3)
					insert();
				break;
				case 4://if(op==4)
					update();
				break;
				case 5://if(op==5)
					delete();
				break;
				case 6://if(op==6)
					closeConnection();
				System.exit(0);
				break;
				default:
					System.out.println("Invalid Option");


				}
			}

			}
		}

		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			closeConnection();
		}


	}

	@SuppressWarnings("unused")
	private static void openConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/techrel_new";
		String un="root";
		String pw="";
		Connection con=DriverManager.getConnection(url,un,pw);
		System.out.println("connection done");


	}

	private static void closeConnection() {
		// TODO Auto-generated method stub
		if(con!=null)
			try {
				con.close();
				System.out.println("connection closed");	
				sc.close();
			}catch(SQLException e)
		{
				e.printStackTrace();
		}
	}

	private static void insert() throws SQLException, ClassNotFoundException{
		int id;
		String name;
		String add;
		int marks;
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/techrel_new";
		String un="root";
		String pw="";
		Connection con=DriverManager.getConnection(url,un,pw);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter roll,name,address,marks");
		
		String sql= "insert into student (id,name,add,marks) values (?, ?, ?, ?)";
		id=sc.nextInt();
		name=sc.next();
		add=sc.next();
		marks=sc.nextInt();
		Statement myStmt = con.prepareStatement(sql);

		// set param values
		((PreparedStatement) myStmt).setInt(1, id);
		((PreparedStatement) myStmt).setString(2, name);
		((PreparedStatement) myStmt).setString(3, add);
		((PreparedStatement) myStmt).setInt(4, marks);
		int n=myStmt.executeUpdate(sql);
		if(0<n)
		{
			System.out.println("record inserted");
		}else
		{
			System.out.println("record not inserted");
		}

	}

	private static void searchByRoll() throws SQLException, ClassNotFoundException{
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/techrel_new";
		String un="root";
		String pw="";
		Connection con=DriverManager.getConnection(url,un,pw);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter roll no ");
		int id=sc.nextInt();
		String sql="select * from student where id="+id;
		Statement stm=con.createStatement();
		//int n=stm.executeUpdate(sql);
		ResultSet res=stm.executeQuery(sql);
		if(res.next())
		{
			System.out.println();
			id=res.getInt("id");
			String nm=res.getString(2);
			String add=res.getString(3);
			int marks=res.getInt(4);

			System.out.println("id : "+id);
			System.out.println("Name : "+nm);
			System.out.println("Address : "+add);
			System.out.println("Marks : "+marks);

		}	else {
			System.out.println("record not found");
		}
		res.close();
	}

	private static void showAll() throws SQLException, ClassNotFoundException{
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/techrel_new";
		String un="root";
		String pw="";
		Connection con=DriverManager.getConnection(url,un,pw);
		Statement stm=con.createStatement();
		String sql1="select * from student";
		ResultSet res=stm.executeQuery(sql1);
		while(res.next())
		{
			System.out.println();
			int id=res.getInt("id");
			String nm=res.getString(2);
			String add=res.getString(3);
			int marks=res.getInt(4);

			System.out.println("id : "+id);
			System.out.println("Name : "+nm);
			System.out.println("Address : "+add);
			System.out.println("Marks : "+marks);

		}res.close();

	}

	private static void update()throws SQLException, ClassNotFoundException {
		int id;
		String name;
		String add;
		int marks;
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/techrel_new";
		String un="root";
		String pw="";
		Connection con=DriverManager.getConnection(url,un,pw);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter roll to update");
		id=sc.nextInt();
		System.out.println("enter name,address,marks for updation");
		
		name=sc.next();
		add=sc.next();
		marks=sc.nextInt();
		String sql="update student set name='"+name+"',add='"+add+"',marks="+marks+" where id="+id;
		Statement stm=con.createStatement();
		int n=stm.executeUpdate(sql);
		if(0<n)
		{
			System.out.println("record updated");
		}else
		{
			System.out.println("record not available");
		}
	}

	private static void delete() throws SQLException{
		System.out.println("enter roll no to delete data");
		int roll=sc.nextInt();
		String sql="detete from student where id="+roll;
		Statement stm=con.createStatement();
		int n=stm.executeUpdate(sql);
		if(0<n) {
			System.out.println("data deleted");
		}else {
			System.out.println("record not Available");
		}

	}

}
