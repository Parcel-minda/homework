package com.tao.model;

import java.util.Date;

/**
 * Donate entity. @author MyEclipse Persistence Tools
 */

public class Donate implements java.io.Serializable {

	// Fields

	private String donateId;
	private Userrs userrs;
	private String tel;
	private String num;
	private Date startTime;
	private String timeChoose;
	private Date collectTime;
	private String dormNumber;
	private String roomNumber;

	// Constructors

	/** default constructor */
	public Donate() {
	}

	/** full constructor */
	public Donate(Userrs userrs, String tel, String num, Date startTime, String timeChoose, Date collectTime,
			String dormNumber, String roomNumber) {
		this.userrs = userrs;
		this.tel = tel;
		this.num = num;
		this.startTime = startTime;
		this.timeChoose = timeChoose;
		this.collectTime = collectTime;
		this.dormNumber = dormNumber;
		this.roomNumber = roomNumber;
	}

	// Property accessors

	public String getDonateId() {
		return this.donateId;
	}

	public void setDonateId(String donateId) {
		this.donateId = donateId;
	}

	public Userrs getUserrs() {
		return this.userrs;
	}

	public void setUserrs(Userrs userrs) {
		this.userrs = userrs;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getNum() {
		return this.num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public Date getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getTimeChoose() {
		return this.timeChoose;
	}

	public void setTimeChoose(String timeChoose) {
		this.timeChoose = timeChoose;
	}

	public Date getCollectTime() {
		return this.collectTime;
	}

	public void setCollectTime(Date collectTime) {
		this.collectTime = collectTime;
	}

	public String getDormNumber() {
		return this.dormNumber;
	}

	public void setDormNumber(String dormNumber) {
		this.dormNumber = dormNumber;
	}

	public String getRoomNumber() {
		return this.roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

}