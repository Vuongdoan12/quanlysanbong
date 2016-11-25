package bo;

import java.util.List;

import bean.Thue;
import dao.KhachDanhSachKhuyenMaiDao;
import dao.ChuDanhSachThueDao;

public class ChuDanhSachThueBO {

	public static List<Thue> getThueList(int i) {
		// TODO Auto-generated method stub
		return ChuDanhSachThueDao.getThuelist(i);
	}

}
