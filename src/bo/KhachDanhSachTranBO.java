package bo;

import java.util.List;

import bean.TranDau;
import dao.KhachDanhSachTranDao;

public class KhachDanhSachTranBO {

	public static List<TranDau> getTranList(String diaChi, String loai, String gioBatDau, String gioKetThuc,
			String ngay) {
		// TODO Auto-generated method stub
		return KhachDanhSachTranDao.getTranList(diaChi, loai, gioBatDau, gioKetThuc, ngay);
	}

}
