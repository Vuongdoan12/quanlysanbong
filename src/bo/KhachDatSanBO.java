package bo;

import dao.KhachDatSanDao;

public class KhachDatSanBO {

	public static String datSan(String idSan, int idNguoiDung, String gioBatDau, String gioKetThuc, String ngay) {
		// TODO Auto-generated method stub
		return KhachDatSanDao.datSan(idSan, idNguoiDung,gioBatDau,gioKetThuc,ngay);
	}
	
}
