package bo;

import java.util.List;

import bean.TranDau;
import dao.KhachQuanLyTranDao;

public class KhachQuanLyTranBO {

	public static List<TranDau> getTranList(int idNguoiDung) {
		// TODO Auto-generated method stub
		return KhachQuanLyTranDao.getTranList(idNguoiDung);
	}

}
