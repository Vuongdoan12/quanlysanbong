package bo;

import java.util.List;

import bean.KhuyenMai;
import dao.DanhSachKhuyenMaiDao;

public class DanhSachKhuyenMaiBO {

	public static List<KhuyenMai> getKhuyenMaiList() {
		// TODO Auto-generated method stub
		return DanhSachKhuyenMaiDao.getKhuyenMaiList();
	}
}
