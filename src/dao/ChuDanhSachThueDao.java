package dao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.Gson;

import bean.KhuyenMai;
import bean.NguoiDung;
import bean.San;
import bean.Thue;
import taolao.MyReader;

public class ChuDanhSachThueDao {

	public static List<Thue> getThuelist(int i2) {
		// TODO Auto-generated method stub
		String url = "http://fas2016.somee.com/api/Thue?idNguoiDung="+i2+"&isChuSan=1";
		String method = "GET";
		List<Thue> thues = new ArrayList<Thue>();
		try {
			String json = MyReader.readFromUrl(url, method);
			JSONArray a = null;
			Gson gson = new Gson();
			JSONObject j = null;
			JSONObject jj = null;
			JSONObject jjj = null;
			JSONObject jjjj = null;
			San san = new San();
			NguoiDung nguoithue = new NguoiDung();
			NguoiDung chu = new NguoiDung();
			Thue thue = new Thue();		
            try {
				a = new JSONArray(json);
				 for (int i = 0; i < a.length(); i++) {
		                j = a.getJSONObject(i);
		                jj = j.getJSONObject("NguoiDung");
		                jjj = j.getJSONObject("San");
		                jjjj = j.getJSONObject("NguoiDung");
		                thue = gson.fromJson(j.toString(), Thue.class);
		                san = gson.fromJson(jjj.toString(), San.class);
		                nguoithue = gson.fromJson(jj.toString(), NguoiDung.class);
		                chu = gson.fromJson(jjjj.toString(), NguoiDung.class);
		                san.setChuSan(chu);
		                thue.setSan(san);
		                thue.setNguoiThue(nguoithue);
		                thues.add(thue);
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
		//aa
		return thues;
	}

}
