package id.MLPT.Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class KoneksiDatabase {
		
	public Connection getConnection(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbkantor", "root", "1234567890");			      
			return conn;	
		} catch (ClassNotFoundException e){
			e.printStackTrace();
			return null;
		} catch (SQLException e){
			e.printStackTrace();
			return null;
		}

		
	}
}
