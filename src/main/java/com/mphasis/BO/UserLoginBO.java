package com.mphasis.BO;

import com.mphasis.dao.UserLoginDao;
import com.mphasis.bean.UserLogin;
import com.mphasis.exception.BussinessException; 

public class UserLoginBO {

	public boolean findUser(String email, String password) throws BussinessException {

		UserLogin userLogin = new UserLogin();

		userLogin.setEmail(email);
		userLogin.setPassword(password);

		boolean userExists = UserLoginDao.isUserExist(userLogin);

		if (userExists)
			return true;

		throw new BussinessException("Not Registered or Invalid Credentails");

	}

}