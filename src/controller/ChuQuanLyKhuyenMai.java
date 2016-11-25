package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.KhuyenMai;
import bean.NguoiDung;
import bo.ChuQuanLyKhuyenMaiBO;
import bo.KhachDanhSachKhuyenMaiBO;

/**
 * Servlet implementation class ChuDanhSachKhuyenMai
 */
@WebServlet("/ChuQuanLyKhuyenMai")
public class ChuQuanLyKhuyenMai extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChuQuanLyKhuyenMai() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<KhuyenMai> list = null;
		
		NguoiDung nguoiDung = new NguoiDung();
		HttpSession session = request.getSession();
		nguoiDung = (NguoiDung) session.getAttribute("nguoiDung");
		request.setAttribute("danhSachKhuyenMai", list);
		list = ChuQuanLyKhuyenMaiBO.getKhuyenMaiList(nguoiDung.getIdNguoiDung());
		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/chu/quanlikhuyenmai.jsp");  
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
