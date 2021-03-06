package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.San;
import bean.TranDau;
import bo.KhachDanhSachSanTrongBO;
import bo.KhachDanhSachTranBO;

/**
 * Servlet implementation class DanhSachTran
 */
@WebServlet("/KhachDanhSachTran")
public class KhachDanhSachTran extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public KhachDanhSachTran() {
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
		
		List<TranDau> list = null;
		list = KhachDanhSachTranBO.getTranList(diaChi, loai, gioBatDau, gioKetThuc, ngay);
		request.setAttribute("danhSachSanTrong", list);
		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/khach/danhsachtran.jsp");  
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
