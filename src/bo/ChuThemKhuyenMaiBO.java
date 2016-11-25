package bo;

import dao.ChuThemKhuyenMaiDao;

public class ChuThemKhuyenMaiBO {

	public static String themKhuyenMai(int idNguoiDung, String ngaybatdau, String ngayketthuc, String noidung) {
		// TODO Auto-generated method stub
		return ChuThemKhuyenMaiDao.themKhuyenMai(idNguoiDung,ngaybatdau,ngayketthuc,noidung);
	}

}
