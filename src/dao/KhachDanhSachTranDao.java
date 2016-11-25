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
import bean.Thue;
import bean.TinhTrang;
import bean.TranDau;
import taolao.MyReader;

public class KhachDanhSachTranDao {

	public static List<TranDau> getTranList(String diaChi, String loai, String gioBatDau, String gioKetThuc,
			String ngay) {
		// TODO Auto-generated method stub
		String url = "http://fas2016.somee.com/api/trandau?diaChi=" + diaChi +"&loai=" + loai+ "&gioBatDau=" + gioBatDau + "&gioKetThuc="+ gioKetThuc + "&ngay="+ ngay;
		
		String method = "GET";
		List<TranDau> trandaus = new ArrayList<TranDau>();
		try {
			String json = MyReader.readFromUrl(url, method);
			JSONArray a = null;
			Gson gson = new Gson();
			JSONObject j = null;
			JSONObject jj = null;
			JSONObject jjj = null;
			TranDau trandau = new TranDau();
			Thue thue = new Thue();
			NguoiDung nguoiDung = new NguoiDung();
			System.out.println(url);
            try {
				a = new JSONArray(json);
				 for (int i = 0; i < a.length(); i++) {
		                j = a.getJSONObject(i);
		                jj = j.getJSONObject("Thue");
		                jjj = jj.getJSONObject("NguoiDung");
		                trandau = gson.fromJson(j.toString(), TranDau.class);
		                nguoiDung = gson.fromJson(jjj.toString(), NguoiDung.class);
		                thue = gson.fromJson(jj.toString(), Thue.class);
		                thue.setNguoiThue(nguoiDung);
		                trandau.setThue(thue);
		                trandaus.add(trandau);
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
		
		return trandaus;
	
	}

}
