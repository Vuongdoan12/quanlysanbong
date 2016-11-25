package bo;

import java.util.List;

import bean.San;
import dao.ChuDanhSachSanDao;
import dao.ChuDanhSachVipDao;

public class ChuDanhSachSanBO {

	public static List<San> getSanList(int idNguoiDung) {
		// TODO Auto-generated method stub
		return ChuDanhSachSanDao.getSanList(idNguoiDung);
	}

	
}
