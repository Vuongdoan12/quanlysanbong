package bo;

import java.util.List;

import bean.KhuyenMai;
import dao.KhachDanhSachKhuyenMaiDao;

public class KhachDanhSachKhuyenMaiBO {

	public static List<KhuyenMai> getKhuyenMaiList() {
		// TODO Auto-generated method stub
		return KhachDanhSachKhuyenMaiDao.getKhuyenMaiList();
	}
}
