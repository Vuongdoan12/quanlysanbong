package lib;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.NguoiDung;

public class PerLib extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static boolean isLogin(HttpServletRequest request , HttpServletResponse response) throws IOException{
		HttpSession session = request.getSession();
		NguoiDung sUser = (NguoiDung)session.getAttribute("nguoiDung");
		if(sUser == null){ // chưa login
			response.sendRedirect(request.getContextPath()+"/Login");
			return false;
		}
		return true;
	}
}
