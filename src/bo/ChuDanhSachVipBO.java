package bo;

import java.util.List;

import bean.Vip;
import dao.KhachDanhSachKhuyenMaiDao;
import dao.ChuDanhSachVipDao;

public class ChuDanhSachVipBO {

	public static List<Vip> getVipList(int i) {
		// TODO Auto-generated method stub
		return ChuDanhSachVipDao.getVipList(i);
	}

}
