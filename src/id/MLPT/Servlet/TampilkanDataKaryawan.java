package id.MLPT.Servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import id.MLPT.Config.KoneksiDatabase;
import id.MLPT.Data.DataKaryawan;


/**
 * Servlet implementation class TampilkanDataKaryawan
 */
@WebServlet("/TampilkanDataKaryawan")
public class TampilkanDataKaryawan extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TampilkanDataKaryawan() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		Statement statement = null;
		ResultSet resultSet = null;
		
		KoneksiDatabase db = new KoneksiDatabase();
		Connection conn = db.getConnection();
		
		try {
			statement = conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String sql ="SELECT a.*, b.* FROM karyawan a JOIN golongan b WHERE a.golongan_id_golongan=b.id_golongan ORDER BY b.gaji_golongan DESC";

		try {
			resultSet = statement.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		List<DataKaryawan> empList = new ArrayList<DataKaryawan>();
		
		try {
			while(resultSet.next()){
				DataKaryawan emp1 = new DataKaryawan();
				
				
				
				emp1.setIdKaryawan(resultSet.getInt("a.id_karyawan"));
				emp1.setNama(resultSet.getString("a.nama_karyawan"));
				emp1.setTanggal(resultSet.getString("a.tgl_masuk_karyawan"));	
				emp1.setIdGolongan(resultSet.getInt("a.golongan_id_golongan"));
				
				emp1.setGolongan(resultSet.getString("b.golongan"));
				emp1.setNamaGolongan(resultSet.getString("b.nama_golongan"));
				emp1.setGajiGolongan(resultSet.getInt("b.gaji_golongan"));
									
				empList.add(emp1);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.setAttribute("empList", empList);
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/TampilkanDataKaryawan.jsp");
		rd.forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
