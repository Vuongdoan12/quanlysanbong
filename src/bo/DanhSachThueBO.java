package bo;

import java.util.List;

import bean.Thue;
import dao.DanhSachKhuyenMaiDao;
import dao.DanhSachThueDao;

public class DanhSachThueBO {

	public static List<Thue> getThueList(String string) {
		// TODO Auto-generated method stub
		return DanhSachThueDao.getThuelist(string);
	}

}
