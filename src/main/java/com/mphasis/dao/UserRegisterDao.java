package com.mphasis.dao; 

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mphasis.bean.UserLogin;
import com.mphasis.bean.UserRegister;

public class UserRegisterDao {

	private static Connection connection;

	public boolean addUserDB(UserRegister userReg) {

		String name = userReg.getName();
		String email = userReg.getEmail();
		String password = userReg.getPassword();

		UserLogin userLogin = new UserLogin();
		userLogin.setEmail(email);
		userLogin.setPassword(password);

		connection = DBUtil.establishConnection();

		if (UserLoginDao.isUserExist(userLogin) == false) {

			try {
				PreparedStatement prepare = connection
						.prepareStatement("INSERT INTO user (name, email, password) VALUES (?, ?, ?)");

				prepare.setString(1, name);
				prepare.setString(2, email);
				prepare.setString(3, password);

				int affectedRows = prepare.executeUpdate();

				if (affectedRows == 1)
					return true;

			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

		return false;
	}
}