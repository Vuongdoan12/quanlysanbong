package bo;

import dao.ChuThemSanDao;

public class ChuThemSanBO {

	public static String themSan(int idNguoiDung, String gia, String loai, String tensan, String tinhtrang) {
		// TODO Auto-generated method stub
		return ChuThemSanDao.themSan(idNguoiDung,gia,loai,tensan,tinhtrang);
	}

}
