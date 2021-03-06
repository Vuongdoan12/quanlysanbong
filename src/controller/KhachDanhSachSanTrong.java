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
import bo.KhachDanhSachKhuyenMaiBO;
import bo.KhachDanhSachSanTrongBO;

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
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		String diaChi = request.getParameter("diaChi");
		String loai = request.getParameter("loai");
		String gioBatDau = request.getParameter("gioBatDau");
		String gioKetThuc = request.getParameter("gioKetThuc");
		String ngay = request.getParameter("ngay");
		request.setAttribute("gioBatDau", gioBatDau);
		request.setAttribute("gioKetThuc", gioKetThuc);
		request.setAttribute("ngay", ngay);
		List<San> list = null;
		list = KhachDanhSachSanTrongBO.getSanList(diaChi, loai, gioBatDau, gioKetThuc, ngay);
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
