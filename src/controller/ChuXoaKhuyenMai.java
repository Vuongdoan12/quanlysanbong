package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import taolao.MyReader;

/**
 * Servlet implementation class ChuXoaKhuyenMai
 */
@WebServlet("/ChuXoaKhuyenMai")
public class ChuXoaKhuyenMai extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChuXoaKhuyenMai() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String idKhuyenMai = request.getParameter("idKhuyenMai");
		String url = "http://fas2016.somee.com/api/khuyenmai?idKhuyenMai="+idKhuyenMai;
		String method = "DELETE";
		String json = MyReader.readFromUrl(url, method);
		System.out.println(json);
		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/ChuQuanLyKhuyenMai");  
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
