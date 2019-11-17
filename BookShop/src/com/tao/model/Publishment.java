package com.tao.model;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Publishment entity. @author MyEclipse Persistence Tools
 */

public class Publishment implements java.io.Serializable {

	// Fields

	private String bookId;
	private Userrs userrs;
	private String bookName;
	private String editWriter;
	private String editPlace;
	private String degree;
	private Float oldPrice;
	private Float newPrice;
	private Timestamp publishTime;
	private Set orders = new HashSet(0);

	// Constructors

	/** default constructor */
	public Publishment() {
	}

	/** full constructor */
	public Publishment(Userrs userrs, String bookName, String editWriter, String editPlace, String degree,
			Float oldPrice, Float newPrice, Timestamp publishTime, Set orders) {
		this.userrs = userrs;
		this.bookName = bookName;
		this.editWriter = editWriter;
		this.editPlace = editPlace;
		this.degree = degree;
		this.oldPrice = oldPrice;
		this.newPrice = newPrice;
		this.publishTime = publishTime;
		this.orders = orders;
	}

	// Property accessors

	public String getBookId() {
		return this.bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public Userrs getUserrs() {
		return this.userrs;
	}

	public void setUserrs(Userrs userrs) {
		this.userrs = userrs;
	}

	public String getBookName() {
		return this.bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getEditWriter() {
		return this.editWriter;
	}

	public void setEditWriter(String editWriter) {
		this.editWriter = editWriter;
	}

	public String getEditPlace() {
		return this.editPlace;
	}

	public void setEditPlace(String editPlace) {
		this.editPlace = editPlace;
	}

	public String getDegree() {
		return this.degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public Float getOldPrice() {
		return this.oldPrice;
	}

	public void setOldPrice(Float oldPrice) {
		this.oldPrice = oldPrice;
	}

	public Float getNewPrice() {
		return this.newPrice;
	}

	public void setNewPrice(Float newPrice) {
		this.newPrice = newPrice;
	}

	public Timestamp getPublishTime() {
		return this.publishTime;
	}

	public void setPublishTime(Timestamp publishTime) {
		this.publishTime = publishTime;
	}

	public Set getOrders() {
		return this.orders;
	}

	public void setOrders(Set orders) {
		this.orders = orders;
	}

}