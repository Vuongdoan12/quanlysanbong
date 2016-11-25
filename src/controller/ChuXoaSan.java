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
 * Servlet implementation class ChuXoaSan
 */
@WebServlet("/ChuXoaSan")
public class ChuXoaSan extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChuXoaSan() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String idSan = request.getParameter("id");
		String url = "http://fas2016.somee.com/api/san?id="+idSan;
		String method = "DELETE";
		String json = MyReader.readFromUrl(url, method);
		System.out.println(json);
		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/ChuDanhSachSan");  
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
