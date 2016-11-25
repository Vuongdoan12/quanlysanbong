package dao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.Gson;

import bean.NguoiDung;
import bean.San;
import bean.TinhTrang;
import taolao.MyReader;

public class AdminQuanLyUserDao {

	public static List<NguoiDung> getUserList() {
		// TODO Auto-generated method stub
		String url = "http://fas2016.somee.com/api/nguoidung";
		String method = "GET";
		List<NguoiDung> nguoidungs = new ArrayList<NguoiDung>();
		try {
			String json = MyReader.readFromUrl(url, method);
			JSONArray a = null;
			Gson gson = new Gson();
			JSONObject j = null;
			NguoiDung nguoiDung = new NguoiDung();
		
            try {
				a = new JSONArray(json);
				 for (int i = 0; i < a.length(); i++) {
		                j = a.getJSONObject(i);
		                nguoiDung = gson.fromJson(j.toString(), NguoiDung.class);
		                nguoidungs.add(nguoiDung); 
				 }
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}    
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
		return nguoidungs;
	}

}
