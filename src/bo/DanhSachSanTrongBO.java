package bo;

import java.util.List;

import bean.San;
import dao.DanhSachKhuyenMaiDao;
import dao.DanhSachSanTrongDao;

public class DanhSachSanTrongBO {

	public static List<San> getSanList(String diaChi, String loai, String gioBatDau,String gioKetThuc, String ngay) {
		// TODO Auto-generated method stub
		return DanhSachSanTrongDao.getSanList(diaChi, loai, gioBatDau, gioKetThuc, ngay);
	}

}
