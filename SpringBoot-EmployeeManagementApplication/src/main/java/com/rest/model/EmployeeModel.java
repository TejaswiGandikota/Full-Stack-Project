package com.rest.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employee_details")
public class EmployeeModel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(name="emp_name")
	private String name;
	@Column(name="emp_mail")
	private String email;
	@Column(name="emp_gender")
	private String gender;
	@Column(name="emp_deptno")
	private String deptno;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDeptno() {
		return deptno;
	}
	public void setDeptno(String deptno) {
		this.deptno = deptno;
	}
	public EmployeeModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeModel(Long id, String name, String email, String gender, String deptno) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.deptno = deptno;
	}
	@Override
	public String toString() {
		return "EmployeeModel [id=" + id + ", name=" + name + ", email=" + email + ", gender=" + gender + ", deptno="
				+ deptno + "]";
	}
	
	

}
