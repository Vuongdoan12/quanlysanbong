package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.NguoiDung;
import bean.San;
import bo.AdminQuanLySanBO;
import bo.AdminQuanLyUserBO;

/**
 * Servlet implementation class AdminQuanLyUser
 */
@WebServlet("/AdminQuanLyUser")
public class AdminQuanLyUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminQuanLyUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<NguoiDung> list = null;
		
		list = AdminQuanLyUserBO.getUserList();
		request.setAttribute("danhSachUser", list);
		
		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/admin/quanliUser.jsp");  
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
