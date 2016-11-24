package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.KhuyenMai;
import bean.San;
import bo.DanhSachKhuyenMaiBO;
import bo.DanhSachSanTrongBO;

/**
 * Servlet implementation class DanhSachSanTrong
 */
@WebServlet("/KhachDanhSachSanTrong")
public class KhachDanhSachSanTrong extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public KhachDanhSachSanTrong() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String diaChi = request.getParameter("diaChi");
		String loai = request.getParameter("loai");
		String gioBatDau = request.getParameter("gioBatDau");
		String gioKetThuc = request.getParameter("gioKetThuc");
		String ngay = request.getParameter("ngay");
		
		List<San> list = null;
		list = DanhSachSanTrongBO.getSanList(diaChi, loai, gioBatDau, gioKetThuc, ngay);
		if(list == null){
			RequestDispatcher rd = request.getRequestDispatcher("/khach/formtimsan.jsp");
			rd.forward(request, response);
		}
		request.setAttribute("danhSachSanTrong", list);
		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/khach/danhsachsantrong.jsp");  
	    dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
