package dao;

import java.io.IOException;

import taolao.MyPost;
import taolao.MyReader;

public class ChuThemSanDao {

	public static String themSan(byte[] datas) {
		
		//String url = "http://fas2016.somee.com/api/San?idNguoiDung="+idNguoiDung+"&gia="+gia+"&loai="+loai+"&ten="+tensan+"&idTinhTrang="+tinhtrang;
		String url = "http://fas2016.somee.com/api/San?idNguoiDung=4&gia=10000&loai=5&ten=man6&idTinhTrang=1";
		String method = "POST";
		
		try {
			String json = MyPost.readFromUrl(url,datas, method);
			System.out.println(json);
			return json;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("aaaaaa");
			e.printStackTrace();
			return "false";
		}
	}

	public static String themSan(int idNguoiDung, String gia, String loai, String tensan, String tinhtrang) {
		// TODO Auto-generated method stub
				String url = "http://fas2016.somee.com/api/San?idNguoiDung="+idNguoiDung+"&gia="+gia+"&loai="+loai+"&ten="+tensan+"&idTinhTrang="+tinhtrang;
				//String url = "http://fas2016.somee.com/api/San?idNguoiDung=4&gia=10000&loai=5&ten=man6&idTinhTrang=1";
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
