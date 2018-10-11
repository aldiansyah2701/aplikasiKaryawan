package id.MLPT.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import id.MLPT.Data.DataKaryawan;;
public class SimpanDataKaryawan {
		
	public static void SimpanData(DataKaryawan ambil){
		try
	    {
	      // create a mysql database connection
	      String myDriver = "com.mysql.jdbc.Driver";
	      String myUrl = "jdbc:mysql://localhost:3306/dbkantor";
	      Class.forName(myDriver);
	      Connection conn = DriverManager.getConnection(myUrl, "root", "1234567890");
	      // the mysql insert statement
	      String query = " insert into karyawan (id_karyawan, nama_karyawan,tgl_masuk_karyawan,golongan_id_golongan)"
	        + " values (?, ?, ?, ?)";

	      // create the mysql insert preparedstatement
	      PreparedStatement preparedStmt = conn.prepareStatement(query);
	      preparedStmt.setInt 	 (1, ambil.getIdKaryawan());
	      preparedStmt.setString (2, ambil.getNama());
	      preparedStmt.setString (3, ambil.getTanggal());
	      preparedStmt.setInt 	 (4, ambil.getIdGolongan());
	      
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
