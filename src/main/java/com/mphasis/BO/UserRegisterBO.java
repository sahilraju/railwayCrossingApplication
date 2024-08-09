package com.mphasis.BO;

import com.mphasis.dao.UserRegisterDao;
import com.mphasis.bean.UserRegister;
import com.mphasis.exception.BussinessException;

public class UserRegisterBO {

	private UserRegisterDao userRegDao;

	public int addUser(String name, String email, String password) throws BussinessException {

		UserRegister userRegister = new UserRegister();

		userRegister.setName(name);
		userRegister.setEmail(email);
		userRegister.setPassword(password);

		userRegDao = new UserRegisterDao();

		boolean isDataInserted = userRegDao.addUserDB(userRegister);
 
		if (isDataInserted)
			return 1;

		throw new BussinessException("Already registered or Invalid Credentails");

	}

} 