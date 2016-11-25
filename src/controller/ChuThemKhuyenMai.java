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
import bo.ChuThemSanBO;

/**
 * Servlet implementation class ChuThemKhuyenMai
 */
@WebServlet("/chu/ChuThemKhuyenMai")
public class ChuThemKhuyenMai extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChuThemKhuyenMai() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String ngaybatdau = request.getParameter("km-ngaybatdau");
		String ngayketthuc = request.getParameter("km-ngayketthuc");
		String noidung = request.getParameter("km-noidung");
		
		NguoiDung nguoiDung = new NguoiDung();
		HttpSession session = request.getSession();
		nguoiDung = (NguoiDung) session.getAttribute("nguoiDung");
		
		String them = ChuThemKhuyenMaiBO.themKhuyenMai(nguoiDung.getIdNguoiDung(),ngaybatdau,ngayketthuc,noidung);
		System.out.println(them);
		if ("true".equals(them))
		{
			RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/ChuDanhSachKhuyenMai");  
		    dispatcher.forward(request, response);
		}else
		{
			RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/chu/themkhuyenmai.jsp");  
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
