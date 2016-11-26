package bo;

import java.util.List;

import bean.Thue;
import dao.KhachDanhSachThueDao;

public class KhachDanhSachThueBO {

	public static List<Thue> getThueList(int idNguoiDung) {
		// TODO Auto-generated method stub
		return KhachDanhSachThueDao.getThueList(idNguoiDung);
	}

}
