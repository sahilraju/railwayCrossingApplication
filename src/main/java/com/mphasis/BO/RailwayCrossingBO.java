package com.mphasis.BO;

import java.util.List;

import com.mphasis.bean.RailwayCrossing;
import com.mphasis.dao.RailwayCrossingDao;
import com.mphasis.exception.BussinessException;

public class RailwayCrossingBO {

	private static final RailwayCrossingDao railCrossDao = new RailwayCrossingDao();

	public void addCrossing(String name, String status, String personInCharge, String schedule, String landmark,
			String address) {

		RailwayCrossing crossing = new RailwayCrossing();

		crossing.setName(name);
		crossing.setStatus(status);
		crossing.setPersonInCharge(personInCharge);
		crossing.setTrainSchedule(schedule);
		crossing.setLandMark(landmark);
		crossing.setAddress(address);
 
		railCrossDao.addCrossing(crossing);

	}

	public List<RailwayCrossing> viewCrossings() {

		return railCrossDao.viewCrossings();

	}

	public void updateCrossing(String name, String status, String personInCharge, String schedule, String landmark,
			String address) {
		
		RailwayCrossing crossing = new RailwayCrossing();

		crossing.setName(name);
		crossing.setStatus(status);
		crossing.setPersonInCharge(personInCharge);
		crossing.setTrainSchedule(schedule);
		crossing.setLandMark(landmark);
		crossing.setAddress(address);

		railCrossDao.updateCrossing(crossing);

	}
	
	public boolean deleteCrossing(String name) throws BussinessException { 
		
		if(railCrossDao.deleteCrossing(name) == false)
			throw new BussinessException("Crossing Not Found to Delete");
		
		return true; 
		
	}
	
	public RailwayCrossing searchCrossing(String name) throws BussinessException {
		
		RailwayCrossing crossing = railCrossDao.searchCrossing(name);
		
		if(crossing != null) {
			return crossing;
		}
		
		throw new BussinessException("Crossing Not Found"); 
		
	}
 
}
