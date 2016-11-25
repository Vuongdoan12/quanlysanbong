package bo;

import java.util.List;

import bean.San;
import dao.KhachDanhSachKhuyenMaiDao;
import dao.KhachDanhSachSanTrongDao;

public class KhachDanhSachSanTrongBO {

	public static List<San> getSanList(String diaChi, String loai, String gioBatDau,String gioKetThuc, String ngay) {
		// TODO Auto-generated method stub
		return KhachDanhSachSanTrongDao.getSanList(diaChi, loai, gioBatDau, gioKetThuc, ngay);
	}

}
