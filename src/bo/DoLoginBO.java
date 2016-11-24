package bo;

import bean.NguoiDung;
import dao.DoLoginDAO;

public class DoLoginBO {

	public static NguoiDung getLogin(String userName, String password) {
		// TODO Auto-generated method stub
		return DoLoginDAO.getLogin(userName,password);
	}

}
