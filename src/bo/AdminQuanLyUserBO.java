package bo;

import java.util.List;

import bean.NguoiDung;
import dao.AdminQuanLyUserDao;

public class AdminQuanLyUserBO {

	public static List<NguoiDung> getUserList() {
		// TODO Auto-generated method stub
		return AdminQuanLyUserDao.getUserList();
	}

}
