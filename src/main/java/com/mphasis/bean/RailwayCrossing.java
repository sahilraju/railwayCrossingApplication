package com.mphasis.bean;

public class RailwayCrossing {

	private String name;
	private String status;
	private String personInCharge;
	private String trainSchedule;
	private String landMark;
	private String address;

	public String getName() {
		return name;
	}
 
	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPersonInCharge() {
		return personInCharge;
	}

	public void setPersonInCharge(String personInCharge) {
		this.personInCharge = personInCharge;
	}

	public String getTrainSchedule() {
		return trainSchedule;
	}

	public void setTrainSchedule(String trainSchedule) {
		this.trainSchedule = trainSchedule;
	}

	public String getLandMark() {
		return landMark;
	}

	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "RailwayCrossing [name=" + name + ", status=" + status + ", personInCharge=" + personInCharge
				+ ", trainSchedule=" + trainSchedule + ", landMark=" + landMark + ", address=" + address + "]";
	}

}
