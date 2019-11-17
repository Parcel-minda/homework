package com.tao.model;

import java.sql.Timestamp;

/**
 * Orders entity. @author MyEclipse Persistence Tools
 */

public class Orders implements java.io.Serializable {

	// Fields

	private String orderId;
	private Publishment publishment;
	private Userrs userrs;
	private Timestamp completeTime;

	// Constructors

	/** default constructor */
	public Orders() {
	}

	/** minimal constructor */
	public Orders(String orderId, Publishment publishment, Userrs userrs) {
		this.orderId = orderId;
		this.publishment = publishment;
		this.userrs = userrs;
	}

	/** full constructor */
	public Orders(String orderId, Publishment publishment, Userrs userrs, Timestamp completeTime) {
		this.orderId = orderId;
		this.publishment = publishment;
		this.userrs = userrs;
		this.completeTime = completeTime;
	}

	// Property accessors

	public String getOrderId() {
		return this.orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public Publishment getPublishment() {
		return this.publishment;
	}

	public void setPublishment(Publishment publishment) {
		this.publishment = publishment;
	}

	public Userrs getUserrs() {
		return this.userrs;
	}

	public void setUserrs(Userrs userrs) {
		this.userrs = userrs;
	}

	public Timestamp getCompleteTime() {
		return this.completeTime;
	}

	public void setCompleteTime(Timestamp completeTime) {
		this.completeTime = completeTime;
	}

}