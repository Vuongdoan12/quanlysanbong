package bo;

import dao.KhachTaoTranDao;

public class KhachTaoTranBO {

	public static String datSan(String idSan, int idNguoiDung, String gioBatDau, String gioKetThuc, String ngay,
			String soLuongToiDa) {
		// TODO Auto-generated method stub
		return  KhachTaoTranDao.datSan(idSan,idNguoiDung,gioBatDau,gioKetThuc,ngay,soLuongToiDa);
	}

}
