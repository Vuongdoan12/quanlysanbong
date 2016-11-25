package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.NguoiDung;
import bo.DoLoginBO;

/**
 * Servlet implementation class DoLogin
 */
@WebServlet("/DoLogin")
public class DoLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		NguoiDung nguoiDung = null;
		nguoiDung = DoLoginBO.getLogin(userName,password);
		if (nguoiDung == null)
		{
			response.sendRedirect(request.getContextPath() + "/DoLogin");
		}
		else
		{
			HttpSession session = request.getSession();
			session.setAttribute("nguoiDung", nguoiDung);
			if (nguoiDung.getQuyen()==1){
	    		  response.sendRedirect(request.getContextPath() + "/ChuDanhSachThue");
			}else if(nguoiDung.getQuyen()==2)
	    	  {
	    		  response.sendRedirect(request.getContextPath() + "/KhachDanhSachKhuyenMai");
	    	  }
			else{
				response.sendRedirect(request.getContextPath() + "/AdminQuanLySan");
			}
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
