package com.bookstore.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class UserShipping {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String userShippingName;
	private String userShippingStreet1;
	private String userShippingtreet2;
	private String userShippingStreet3;
	private String userShippingCity;
	private String userShippingState;
	private String userShippingCountry;
	private String userShippingZipcode;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserShippingName() {
		return userShippingName;
	}

	public void setUserShippingName(String userShippingName) {
		this.userShippingName = userShippingName;
	}

	public String getUserShippingStreet1() {
		return userShippingStreet1;
	}

	public void setUserShippingStreet1(String userShippingStreet1) {
		this.userShippingStreet1 = userShippingStreet1;
	}

	public String getUserShippingtreet2() {
		return userShippingtreet2;
	}

	public void setUserShippingtreet2(String userShippingtreet2) {
		this.userShippingtreet2 = userShippingtreet2;
	}

	public String getUserShippingStreet3() {
		return userShippingStreet3;
	}

	public void setUserShippingStreet3(String userShippingStreet3) {
		this.userShippingStreet3 = userShippingStreet3;
	}

	public String getUserShippingCity() {
		return userShippingCity;
	}

	public void setUserShippingCity(String userShippingCity) {
		this.userShippingCity = userShippingCity;
	}

	public String getUserShippingState() {
		return userShippingState;
	}

	public void setUserShippingState(String userShippingState) {
		this.userShippingState = userShippingState;
	}

	public String getUserShippingCountry() {
		return userShippingCountry;
	}

	public void setUserShippingCountry(String userShippingCountry) {
		this.userShippingCountry = userShippingCountry;
	}

	public String getUserShippingZipcode() {
		return userShippingZipcode;
	}

	public void setUserShippingZipcode(String userShippingZipcode) {
		this.userShippingZipcode = userShippingZipcode;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	

}
