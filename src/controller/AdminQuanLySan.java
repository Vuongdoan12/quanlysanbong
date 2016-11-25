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
import bean.San;
import bo.AdminQuanLySanBO;
import bo.ChuDanhSachSanBO;

/**
 * Servlet implementation class AdminQuanLySan
 */
@WebServlet("/AdminQuanLySan")
public class AdminQuanLySan extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminQuanLySan() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<San> list = null;
		
		list = AdminQuanLySanBO.getSanList();
		request.setAttribute("danhSachSan", list);
		
		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/admin/quanliSan.jsp");  
	    dispatcher.forward(request, response);;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
