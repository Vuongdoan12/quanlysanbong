package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TimKiemSan
 */
@WebServlet("/KhachTimKiemSan")
public class KhachTimKiemSan extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public KhachTimKiemSan() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*String diaChi = request.getParameter("diaChi");
		String loai = request.getParameter("loai");
		String gioBatDau = request.getParameter("gioBatDau");
		String gioKetThuc = request.getParameter("gioKetThuc");
		String ngay = request.getParameter("ngay");*/
		String bt = request.getParameter("bttimsan");
		
		if ("1".equals(bt))
		{
			RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/KhachDanhSachSanTrong");  
		    dispatcher.forward(request, response);
		}
		else
		{
			RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/KhachDanhSachTran");  
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
