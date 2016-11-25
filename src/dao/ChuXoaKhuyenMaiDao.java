package dao;

import java.io.IOException;

import taolao.MyReader;

public class ChuXoaKhuyenMaiDao {

	public static String xoaKhuyenMai(String idKhuyenMai) {
		// TODO Auto-generated method stub
		String url = "http://fas2016.somee.com/api/khuyenmai?idKhuyenMai="+idKhuyenMai;
		String method = "DELETE";
		try {
			String json = MyReader.readFromUrl(url, method);
			return json;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "false";
		}
	}

}
