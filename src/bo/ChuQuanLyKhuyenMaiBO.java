package bo;

import java.util.List;

import bean.KhuyenMai;
import dao.ChuQuanLyKhuyenMaiDao;

public class ChuQuanLyKhuyenMaiBO {

	public static List<KhuyenMai> getKhuyenMaiList(int idNguoiDung) {
		// TODO Auto-generated method stub
		return ChuQuanLyKhuyenMaiDao.getKhuyenMaiList(idNguoiDung);
	}

}
