/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tf.entity;

import java.util.Date;

/**
 *
 * @author rashmsam
 */
public class Quote {

	private Integer term;
	private Float sumAssured;
	private String userName;
	private String firstName;
	private String lastName;
	private Integer age;
	private Date dob;
	private String smokerFlag;
	private String state;
	private Float height;
	private Float weight;
	private String gender;
	private String health;
	
	

	public String getHealth() {
		return health;
	}

	public void setHealth(String health) {
		this.health = health;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSmokerFlag() {
		return smokerFlag;
	}

	public void setSmokerFlag(String smokerFlag) {
		this.smokerFlag = smokerFlag;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Float getSumAssured() {
		return sumAssured;
	}

	public void setSumAssured(Float sumAssured) {
		this.sumAssured = sumAssured;
	}

	public Integer getTerm() {
		return term;
	}

	public void setTerm(Integer term) {
		this.term = term;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return this.firstName + "| " + this.lastName + "|" + this.age + "|"
				+ this.sumAssured;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Float getHeight() {
		return height;
	}

	public void setHeight(Float height) {
		this.height = height;
	}

	public Float getWeight() {
		return weight;
	}

	public void setWeight(Float weight) {
		this.weight = weight;
	}
	
}
