package com.mphasis.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mphasis.bean.RailwayCrossing;
import com.mphasis.exception.BussinessException;

public class RailwayCrossingDao {

	private Connection connection;

	public void addCrossing(RailwayCrossing crossing) {

		connection = DBUtil.establishConnection();

		try {
			PreparedStatement prepare = connection.prepareStatement(
					"INSERT INTO rail_crossings (name,status,person_in_charge,schedule,landmark,address) "
							+ "VALUES (?, ?, ?, ?, ?, ?)");

			prepare.setString(1, crossing.getName());
			prepare.setString(2, crossing.getStatus());
			prepare.setString(3, crossing.getPersonInCharge());
			prepare.setString(4, crossing.getTrainSchedule());
			prepare.setString(5, crossing.getLandMark());
			prepare.setString(6, crossing.getAddress());

			int affectedRows = prepare.executeUpdate();

			System.out.println(affectedRows);

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public List<RailwayCrossing> viewCrossings() {

		connection = DBUtil.establishConnection();

		List<RailwayCrossing> crossings = new ArrayList<>();

		try {
			ResultSet rSet = connection.createStatement().executeQuery("SELECT * FROM rail_crossings");

			while (rSet.next()) {

				RailwayCrossing crossing = new RailwayCrossing();
				crossing.setName(rSet.getString(2));
				crossing.setStatus(rSet.getString(3)); 
				crossing.setPersonInCharge(rSet.getString(4));
				crossing.setTrainSchedule(rSet.getString(5));
				crossing.setLandMark(rSet.getString(6));
				crossing.setAddress(rSet.getString(7));

				crossings.add(crossing);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return crossings;
	}

	public void updateCrossing(RailwayCrossing crossing) {

		connection = DBUtil.establishConnection();

		try {
			PreparedStatement prepare = connection.prepareStatement(
					"UPDATE rail_crossings SET status = ?, person_in_charge = ?, schedule = ?, landmark = ?, address =? WHERE name = ?");

			prepare.setString(1, crossing.getStatus());
			prepare.setString(2, crossing.getPersonInCharge());
			prepare.setString(3, crossing.getTrainSchedule()); 
			prepare.setString(4, crossing.getLandMark());
			prepare.setString(5, crossing.getAddress());
			prepare.setString(6, crossing.getName());

			int affectedRows = prepare.executeUpdate();

			System.out.println(affectedRows);

		} catch (SQLException e) {

			e.printStackTrace();
		}

	} 
	
	public boolean deleteCrossing(String name) {
		
		connection = DBUtil.establishConnection();

		try {
			PreparedStatement prepare = connection.prepareStatement("DELETE FROM rail_crossings WHERE name = ?");

			prepare.setString(1, name); 
			
			int affectedRows = prepare.executeUpdate();

			System.out.println(affectedRows);
			
			if(affectedRows == 1)
				return true; 

		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		return false; 
		
	}
	
	public RailwayCrossing searchCrossing(String name) {
		
		connection = DBUtil.establishConnection();

		try {
			PreparedStatement prepare = connection.prepareStatement("SELECT * FROM rail_crossings WHERE name = ?");
			
			prepare.setString(1, name); 

			ResultSet rSet = prepare.executeQuery();
			
			RailwayCrossing crossing = new RailwayCrossing();
			
			if(rSet.next()) {
				
				crossing.setName(rSet.getString(2)); 
				crossing.setStatus(rSet.getString(3));
				crossing.setPersonInCharge(rSet.getString(4));
				crossing.setTrainSchedule(rSet.getString(5));
				crossing.setLandMark(rSet.getString(6));
				crossing.setAddress(rSet.getString(7));
				
			}
			
			return crossing; 

		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		return null;  
		
	}
	
	public static void main(String[] args) {
		new RailwayCrossingDao().updateCrossing(null);
	}

}
