package com.emp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.springframework.lang.NonNull;

/**
 * @author Venu.K
 *
 */
@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer empID;

	@NonNull
	@NotEmpty
	private String empName;

	@NonNull
	@NotEmpty
	@Email
	private String email;

	private Integer mobileNo;

	public Integer getEmpID() {
		return empID;
	}

	public void setEmpID(Integer empID) {
		this.empID = empID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(Integer mobileNo) {
		this.mobileNo = mobileNo;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + ", email=" + email + ", mobileNo=" + mobileNo
				+ "]";
	}

	public Employee(Integer empID, String empName, String email, Integer mobileNo) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.email = email;
		this.mobileNo = mobileNo;
	}

}
