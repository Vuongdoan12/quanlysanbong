package controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.NguoiDung;
import bo.ChuThemSanBO;
import taolao.ToByte;

/**
 * Servlet implementation class ChuThemSan
 */
@WebServlet("/chu/ChuThemSan")
public class ChuThemSan extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChuThemSan() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String loai = request.getParameter("them-loai");
		String tensan = request.getParameter("them-tensan");
		String gia = request.getParameter("them-gia");
		String tinhtrang = request.getParameter("them-tinhtrang");
		NguoiDung nguoiDung = new NguoiDung();
		HttpSession session = request.getSession();
		nguoiDung = (NguoiDung) session.getAttribute("nguoiDung");
		String ok;
		String them = ChuThemSanBO.themSan(nguoiDung.getIdNguoiDung(),gia,loai,tensan,tinhtrang);
		if ("true".equals(them))
		{
			RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/ChuDanhSachSan");  
		    dispatcher.forward(request, response);
		}else
		{
			RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/ChuThemSan");  
		    dispatcher.forward(request, response);
		}


		/*Map<String, Object> params = new LinkedHashMap<>();
		params.put("idNguoiDung", nguoiDung.getIdNguoiDung());
		params.put("gia", gia);
		params.put("loai", loai);
		params.put("ten", tensan);
		params.put("idTinhTrang", tinhtrang);
		byte[] datas;
		try {
			datas = ToByte.parseMapToByte(params);
		    ok = ChuThemSanBO.themSan(datas);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}		*/
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
