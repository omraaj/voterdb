import java.sql.Connection;
import java.sql.DriverManager;


public class DAO 
{
	String username = "root";
	String password ="tiger";
	
	String DB_URL = "jdbc:mysql://localhost:3306/voterregister";
	
	
	public Connection getConnection()
	{
		Connection conn = null;
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			
			conn = DriverManager.getConnection(DB_URL,username,password);
			
			System.out.println(" Connected to DataBase Succesfully!!!  ");
			 
		}
		catch (Exception e)
		{
			System.out.println("Unable to Connect DataBase"+e);
		}
		return conn;
	}

}
