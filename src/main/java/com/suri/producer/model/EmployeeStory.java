package com.suri.producer.model;

import lombok.*;

/*@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor*/
public class EmployeeStory {
	
	private String employeeId;
	private String employeeName;
	private String employeeAddress;
	private String employeePhone;
	private String employeeAccNo;
	private String employeeGender;
	
	public EmployeeStory(String employeeId, String employeeName, String employeeAddress, String employeePhone,
			String employeeAccNo, String employeeGender) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
		this.employeePhone = employeePhone;
		this.employeeAccNo = employeeAccNo;
		this.employeeGender = employeeGender;
	}
	
	
	
	public EmployeeStory() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeAddress() {
		return employeeAddress;
	}
	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}
	public String getEmployeePhone() {
		return employeePhone;
	}
	public void setEmployeePhone(String employeePhone) {
		this.employeePhone = employeePhone;
	}
	public String getEmployeeAccNo() {
		return employeeAccNo;
	}
	public void setEmployeeAccNo(String employeeAccNo) {
		this.employeeAccNo = employeeAccNo;
	}
	public String getEmployeeGender() {
		return employeeGender;
	}
	public void setEmployeeGender(String employeeGender) {
		this.employeeGender = employeeGender;
	}



	@Override
	public String toString() {
		return "EmployeeStory [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeAddress="
				+ employeeAddress + ", employeePhone=" + employeePhone + ", employeeAccNo=" + employeeAccNo
				+ ", employeeGender=" + employeeGender + "]";
	}

	
	

}
