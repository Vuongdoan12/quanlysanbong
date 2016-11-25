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
import taolao.MyReader;

public class ChuQuanLyKhuyenMaiDao {

	public static List<KhuyenMai> getKhuyenMaiList(int idNguoiDung) {
		// TODO Auto-generated method stub
		String url = "http://fas2016.somee.com/api/khuyenmai?idNguoiDung="+idNguoiDung;
		
		String method = "GET";
		List<KhuyenMai> khuyenMais = new ArrayList<KhuyenMai>();
		try {
			String json = MyReader.readFromUrl(url, method);
			JSONArray a = null;
			Gson gson = new Gson();
			JSONObject j = null;
			JSONObject jj = null;
			KhuyenMai khuyenMai = new KhuyenMai();
			NguoiDung nguoiDung = new NguoiDung();
						
            try {
				a = new JSONArray(json);
				 for (int i = 0; i < a.length(); i++) {
		                j = a.getJSONObject(i);
		                jj = j.getJSONObject("NguoiDung");
		                khuyenMai = gson.fromJson(j.toString(), KhuyenMai.class);
		                nguoiDung = gson.fromJson(jj.toString(), NguoiDung.class);
		                khuyenMai.setChuSan(nguoiDung);
		                khuyenMais.add(khuyenMai);
		                System.out.println(khuyenMai.getNoiDung());
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
		
		return khuyenMais;
	}

}
