package id.MLPT.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import id.MLPT.Data.DataKaryawan;

public class SimpanDataGolongan {
		
	public static void SimpanDataGol(DataKaryawan ambil){
		try
	    {
	      // create a mysql database connection
	      String myDriver = "com.mysql.jdbc.Driver";
	      String myUrl = "jdbc:mysql://localhost:3306/dbkantor";
	      Class.forName(myDriver);
	      Connection conn = DriverManager.getConnection(myUrl, "root", "1234567890");
	      // the mysql insert statement
	      String query = " insert into golongan (id_golongan, golongan, nama_golongan, gaji_golongan)"
	        + " values (?, ?, ?, ?)";

	      // create the mysql insert preparedstatement
	      PreparedStatement preparedStmt = conn.prepareStatement(query);
	      preparedStmt.setInt 	 (1, ambil.getIdGolongan());
	      preparedStmt.setString (2, ambil.getGolongan());
	      preparedStmt.setString (3, ambil.getNamaGolongan());
	      preparedStmt.setInt 	 (4, ambil.getGajiGolongan());
	      
	      // execute the preparedstatement
	      preparedStmt.execute();
	      
	      conn.close();
	      
	    }
	    catch (Exception e)
	    {
	      System.err.println("Got an exception!");
	      System.err.println(e.getMessage());
	    }
	}
}
