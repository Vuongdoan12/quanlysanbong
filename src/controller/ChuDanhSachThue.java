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
import bean.Thue;
import bo.DanhSachKhuyenMaiBO;
import bo.DanhSachThueBO;

/**
 * Servlet implementation class ChuDanhSachThue
 */
@WebServlet("/ChuDanhSachThue")
public class ChuDanhSachThue extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChuDanhSachThue() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<Thue> list = null;
		list = DanhSachThueBO.getThueList("aa");
		request.setAttribute("danhSachThue", list);
		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/chu/chu.jsp");  
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
