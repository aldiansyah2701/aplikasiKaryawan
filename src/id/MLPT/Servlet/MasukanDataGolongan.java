package id.MLPT.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import id.MLPT.DAO.SimpanDataGolongan;
import id.MLPT.DAO.SimpanDataKaryawan;
import id.MLPT.Data.DataKaryawan;

/**
 * Servlet implementation class MasukanDataGolongan
 */
@WebServlet("/MasukanDataGolongan")
public class MasukanDataGolongan extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MasukanDataGolongan() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String id_Golongan = request.getParameter("idGolongan");
		String golongan = request.getParameter("golongan");
		String namaGolongan = request.getParameter("namaGolongan");
		String gaji_Golongan = request.getParameter("gajiGolongan");
		
		int idGolongan = Integer.parseInt(id_Golongan);
		int gajiGolongan = Integer.parseInt(gaji_Golongan);
		
		DataKaryawan datakaryawanGol = new DataKaryawan();
		datakaryawanGol.setIdGolongan(idGolongan);
		datakaryawanGol.setGolongan(golongan);
		datakaryawanGol.setNamaGolongan(namaGolongan);
		datakaryawanGol.setGajiGolongan(gajiGolongan);
		
		SimpanDataGolongan simpandataGol = new SimpanDataGolongan();
		
		simpandataGol.SimpanDataGol(datakaryawanGol);
		
		response.sendRedirect("MasukanDataGolongan.jsp");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
