package dao;

import java.io.IOException;

import com.google.gson.Gson;

import bean.NguoiDung;
import taolao.MyReader;

public class DoLoginDAO {

	public static NguoiDung getLogin(String userName, String password) {
		// TODO Auto-generated method stub
		String url = "http://fas2016.somee.com/api/nguoidung?tenDangNhap="+userName+"&matKhau="+password;
		//String url = "http://localhost:35353/api/nguoidung?tenDangNhap="+userName+"&matKhau="+password;
		String method = "GET";
		Gson gson = new Gson();
		NguoiDung nguoidung = new NguoiDung();
		String json;
		try {
			json = (MyReader.readFromUrl(url, method));
			nguoidung = gson.fromJson(json, NguoiDung.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}  
        return nguoidung;    
	}

}
