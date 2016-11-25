package bo;

import java.util.List;

import bean.San;
import dao.AdminQuanLySanDao;

public class AdminQuanLySanBO {

	public static List<San> getSanList() {
		// TODO Auto-generated method stub
		return AdminQuanLySanDao.getSanList();
	}

}
