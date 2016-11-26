package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.NguoiDung;
import bo.ChuThemKhuyenMaiBO;
import bo.KhachDatSanBO;

/**
 * Servlet implementation class KhachDatSan
 */
@WebServlet("/KhachDatSan")
public class KhachDatSan extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public KhachDatSan() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String idSan = request.getParameter("idSan");
		String ngay = request.getParameter("ngay");
		String gioBatDau = request.getParameter("gioBatDau");
		String gioKetThuc = request.getParameter("gioKetThuc");
		
		NguoiDung nguoiDung = new NguoiDung();
		HttpSession session = request.getSession();
		nguoiDung = (NguoiDung) session.getAttribute("nguoiDung");
		String thue = KhachDatSanBO.datSan(idSan, nguoiDung.getIdNguoiDung(),gioBatDau,gioKetThuc,ngay);
		System.out.println(thue);
		if ("true".equals(thue))
		{
			RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/KhachQuanLySanDat");  
		    dispatcher.forward(request, response);
		}else
		{
			RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/KhachDanhSachSanTrong");  
		    dispatcher.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
