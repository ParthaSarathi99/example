package com.coforge.assignment.erm.model;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

import javax.persistence.*;

@Entity
@Table(name="employee")


public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="empid")
	private int empid;
	
	@Column(name="empfname")
	private String empfname;
	
	@Column(name="emplname")
	private String emplname;
	
	@Column(name="empdob")
	private String empdob;
	
	@Column(name="empaddress")
	private String  empaddress;
	
	@Column(name="password")
	private String password;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpfname() {
		return empfname;
	}

	public void setEmpfname(String empfname) {
		this.empfname = empfname;
	}

	public String getEmplname() {
		return emplname;
	}

	public void setEmplname(String emplname) {
		this.emplname = emplname;
	}

	public String getEmpdob() {
		return empdob;
	}

	public void setEmpdob(String empdob) {
		this.empdob = empdob;
	}

	public String getEmpaddress() {
		return empaddress;
	}

	public void setEmpaddress(String empaddress) {
		this.empaddress = empaddress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		Base64.Encoder encoder = Base64.getEncoder();
		String normalString = password;
		String encodedString = encoder.encodeToString(
		normalString.getBytes(StandardCharsets.UTF_8) );
		this.password = encodedString;
	}
	
	
	


	
	

}
