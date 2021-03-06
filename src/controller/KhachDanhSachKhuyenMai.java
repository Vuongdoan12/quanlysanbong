package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONException;

import bean.KhuyenMai;
import bo.KhachDanhSachKhuyenMaiBO;

/**
 * Servlet implementation class DanhSachKhuyenMai
 */
@WebServlet("/KhachDanhSachKhuyenMai")
public class KhachDanhSachKhuyenMai extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public KhachDanhSachKhuyenMai() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<KhuyenMai> list = null;
		list = KhachDanhSachKhuyenMaiBO.getKhuyenMaiList();
		request.setAttribute("danhSachKhuyenMai", list);
		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/khach/khach.jsp");  
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
