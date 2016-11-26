package bo;

import java.util.List;

import bean.TranDau;
import dao.KhachQuanLyTranDao;
import dao.KhachTranDaThamGiaDao;

public class KhachTranDaThamGiaBO {

	public static List<TranDau> getTranList(int idNguoiDung) {
		// TODO Auto-generated method stub
		return KhachTranDaThamGiaDao.getTranList(idNguoiDung);
	}

}
