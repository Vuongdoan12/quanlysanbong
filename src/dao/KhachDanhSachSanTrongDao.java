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
import bean.TinhTrang;
import taolao.MyReader;

public class KhachDanhSachSanTrongDao {

	public static List<San> getSanList(String diaChi, String loai, String gioBatDau, String gioKetThuc, String ngay) {
		// TODO Auto-generated method stub
		String url = "http://fas2016.somee.com/api/san?diaChi=" + diaChi +"&loai=" + loai+ "&gioBatDau=" + gioBatDau + "&gioKetThuc="+ gioKetThuc + "&ngay="+ ngay;
		//String url = "http://fas2016.somee.com/api/san?diaChi=Quảng&loai=7&gioBatDau=1&gioKetThuc=4&ngay=2016-11-28";

		String method = "GET";
		List<San> sans = new ArrayList<San>();
		try {
			String json = MyReader.readFromUrl(url, method);
			JSONArray a = null;
			Gson gson = new Gson();
			JSONObject j = null;
			JSONObject jj = null;
			JSONObject jjj = null;
			San san = new San();
			NguoiDung nguoiDung = new NguoiDung();
			TinhTrang tinhtrang = new TinhTrang();
			System.out.println(url);
            try {
				a = new JSONArray(json);
				 for (int i = 0; i < a.length(); i++) {
		                j = a.getJSONObject(i);
		                jj = j.getJSONObject("NguoiDung");
		                jjj = j.getJSONObject("TinhTrang");
		                san = gson.fromJson(j.toString(), San.class);
		                nguoiDung = gson.fromJson(jj.toString(), NguoiDung.class);
		                tinhtrang = gson.fromJson(jj.toString(), TinhTrang.class);
		                san.setChuSan(nguoiDung);
		                san.setTinhTrang(tinhtrang);
		                sans.add(san);
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
		
		return sans;
	}

}
