package com.basic.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

@Entity
@Table(name="EmployeeModelDetails")
@SQLDelete(sql = "UPDATE employee_model_details SET is_active ='N' WHERE id=?")
@Where(clause = "is_active='Y'")
public class EmployeeModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	//@Column(name="First_Name")
	
	private String name;
	//@Column(name="is_active")
	
	private String is_active;
	@Override
	public String toString() {
		return "EmployeeModel [id=" + id + ", name=" + name + ", is_active=" + is_active + "]";
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIs_active() {
		return is_active;
	}
	public void setIs_active(String is_active) {
		this.is_active = is_active;
	}
	public EmployeeModel(long id, String name, String is_active) {
		super();
		this.id = id;
		this.name = name;
		this.is_active = is_active;
	}
	public EmployeeModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
