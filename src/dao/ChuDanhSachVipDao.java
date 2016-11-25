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
import bean.Vip;
import taolao.MyReader;

public class ChuDanhSachVipDao {

	public static List<Vip> getVipList(int i2) {
		// TODO Auto-generated method stub
		String url = "http://fas2016.somee.com/api/vip?idChuSan="+i2;
		String method = "GET";
		List<Vip> vips = new ArrayList<Vip>();
		try {
			String json = MyReader.readFromUrl(url, method);
			JSONArray a = null;
			Gson gson = new Gson();
			JSONObject j = null;
			JSONObject jj = null;
			JSONObject jjj = null;
			NguoiDung chu = new NguoiDung();
			NguoiDung thue = new NguoiDung();
			Vip vip = new Vip();		
            try {
				a = new JSONArray(json);
				 for (int i = 0; i < a.length(); i++) {
		                j = a.getJSONObject(i);
		                jj = j.getJSONObject("NguoiDung");
		                jjj = j.getJSONObject("NguoiDung1");
		                
		                vip = gson.fromJson(j.toString(), Vip.class);
		                thue = gson.fromJson(jj.toString(), NguoiDung.class);
		                chu = gson.fromJson(jjj.toString(), NguoiDung.class);
		                vip.setChuSan(chu);
		                vip.setNguoiThue(thue);
		                vips.add(vip);
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
		
		return vips;
	}

}
