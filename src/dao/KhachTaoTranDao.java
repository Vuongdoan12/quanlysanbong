package dao;

import java.io.IOException;

import taolao.MyReader;

public class KhachTaoTranDao {

	public static String datSan(String idSan, int idNguoiDung, String gioBatDau, String gioKetThuc, String ngay,
			String soLuongToiDa) {
		// TODO Auto-generated method stub
		String url = "http://fas2016.somee.com/api/thue?idSan="+idSan+"&idNguoiDung="+idNguoiDung+"&gioBatDau="+gioBatDau+"&gioKetThuc="+gioKetThuc+"&ngay="+ngay+"&soLuongToiDa="+soLuongToiDa+"&soLuongHienCo=1";		
		System.out.println(url);
		String method = "GET";
		
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
