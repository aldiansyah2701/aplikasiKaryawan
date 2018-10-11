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

import id.MLPT.Data.DataKaryawan;
import id.MLPT.Config.KoneksiDatabase;
import id.MLPT.DAO.SimpanDataKaryawan;;

/**
 * Servlet implementation class DataKaryawan
 */
@WebServlet("/MasukanDataKaryawan")
public class MasukanDataKaryawan extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MasukanDataKaryawan() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String id_Karyawan = request.getParameter("idKaryawan");
		String nama = request.getParameter("nama");
		String tanggal = request.getParameter("tanggal");
		String id_Golongan = request.getParameter("idGolongan");
		
		int idKaryawan = Integer.parseInt(id_Karyawan);
		int idGolongan = Integer.parseInt(id_Golongan);
		
		DataKaryawan datakaryawan = new DataKaryawan();
		datakaryawan.setIdKaryawan(idKaryawan);
		datakaryawan.setNama(nama);
		datakaryawan.setTanggal(tanggal);
		datakaryawan.setIdGolongan(idGolongan);
		
		
		System.out.println(datakaryawan.getNama());
		
		SimpanDataKaryawan simpandata = new SimpanDataKaryawan();
		
		simpandata.SimpanData(datakaryawan);
		
		//------------------------------------------------option value
		/*
		
		*/
		
		
		response.sendRedirect("FormMasukanDataKaryawan");
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
