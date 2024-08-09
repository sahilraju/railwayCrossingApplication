package com.mphasis.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mphasis.bean.UserLogin; 

public class UserLoginDao {

	private static Connection connection;

	public static boolean isUserExist(UserLogin userLog) {

		connection = DBUtil.establishConnection();

		try {
			PreparedStatement prepare = connection
					.prepareStatement("SELECT * FROM user WHERE email = ? AND password = ?");

			prepare.setString(1, userLog.getEmail());
			prepare.setString(2, userLog.getPassword());

			ResultSet rSet = prepare.executeQuery();

			if (rSet.next())
				return true;

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}
}