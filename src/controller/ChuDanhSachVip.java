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

import bean.NguoiDung;
import bean.Thue;
import bean.Vip;
import bo.ChuDanhSachThueBO;
import bo.ChuDanhSachVipBO;

/**
 * Servlet implementation class ChuDanhSachVip
 */
@WebServlet("/ChuDanhSachVip")
public class ChuDanhSachVip extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChuDanhSachVip() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<Vip> list = null;
		NguoiDung nguoiDung = new NguoiDung();
		HttpSession session = request.getSession();
		nguoiDung = (NguoiDung) session.getAttribute("nguoiDung");
		
		list = ChuDanhSachVipBO.getVipList(nguoiDung.getIdNguoiDung());
		request.setAttribute("danhSachVip", list);
		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/chu/chuvip.jsp");  
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
