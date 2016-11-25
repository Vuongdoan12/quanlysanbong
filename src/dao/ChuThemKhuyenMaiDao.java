package dao;

import java.io.IOException;

import taolao.MyReader;

public class ChuThemKhuyenMaiDao {

	public static String themKhuyenMai(int idNguoiDung, String ngaybatdau, String ngayketthuc, String noidung) {
		// TODO Auto-generated method stub
		String url = "http://fas2016.somee.com/api/khuyenmai?idNguoiDung="+idNguoiDung+"&ngayBatDau="+ngaybatdau+"&ngayKetThuc="+ngayketthuc+"&noiDung="+noidung;		
		System.out.println(url);
		String method = "GET";
		
		try {
			String json = MyReader.readFromUrl(url, method);
			System.out.println(json);
			return json;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
			return "false";
		}
	}

}
