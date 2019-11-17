package com.tao.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Userrs entity. @author MyEclipse Persistence Tools
 */

public class Userrs implements java.io.Serializable {

	// Fields

	private String userrsId;
	private String userrsPhonumber;
	private String userrsPassword;
	private String userrsName;
	private String userrsWords;
	private Set publishments = new HashSet(0);
	private Set orders = new HashSet(0);
	private Set donates = new HashSet(0);

	// Constructors

	/** default constructor */
	public Userrs() {
	}

	/** full constructor */
	public Userrs(String userrsPhonumber, String userrsPassword, String userrsName, String userrsWords,
			Set publishments, Set orders, Set donates) {
		this.userrsPhonumber = userrsPhonumber;
		this.userrsPassword = userrsPassword;
		this.userrsName = userrsName;
		this.userrsWords = userrsWords;
		this.publishments = publishments;
		this.orders = orders;
		this.donates = donates;
	}

	// Property accessors

	public String getUserrsId() {
		return this.userrsId;
	}

	public void setUserrsId(String userrsId) {
		this.userrsId = userrsId;
	}

	public String getUserrsPhonumber() {
		return this.userrsPhonumber;
	}

	public void setUserrsPhonumber(String userrsPhonumber) {
		this.userrsPhonumber = userrsPhonumber;
	}

	public String getUserrsPassword() {
		return this.userrsPassword;
	}

	public void setUserrsPassword(String userrsPassword) {
		this.userrsPassword = userrsPassword;
	}

	public String getUserrsName() {
		return this.userrsName;
	}

	public void setUserrsName(String userrsName) {
		this.userrsName = userrsName;
	}

	public String getUserrsWords() {
		return this.userrsWords;
	}

	public void setUserrsWords(String userrsWords) {
		this.userrsWords = userrsWords;
	}

	public Set getPublishments() {
		return this.publishments;
	}

	public void setPublishments(Set publishments) {
		this.publishments = publishments;
	}

	public Set getOrders() {
		return this.orders;
	}

	public void setOrders(Set orders) {
		this.orders = orders;
	}

	public Set getDonates() {
		return this.donates;
	}

	public void setDonates(Set donates) {
		this.donates = donates;
	}

}