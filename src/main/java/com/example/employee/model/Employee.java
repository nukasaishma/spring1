package com.example.employee.model;

import javax.persistence.Entity;
	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;

	@Entity
	@Table(name = "employee_data")
	public class Employee {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;
		
		@Column(name = "emp_firstname")
		private String firstname;

		@Column(name = "emp_lastname")
		private String lastname;
		@Column(name="emp_dept")
		private String dept;
		
		
		
		public String getDept() {
			return dept;
		}

		public void setDept(String dept) {
			this.dept = dept;
		}
		//private String email_id;
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getfirstname() {
			return firstname;
		}
		public void setfirstname(String firstname) {
			this.firstname = firstname;
		}
		public String getlastname() {
			return lastname;
		}
		public void setlastname(String lastName) {
			this.lastname = lastName;
		}	
		public Employee() {
			
		}
		
		public Employee(String firstName, String lastName) {
			super();
			this.firstname = firstName;
			this.lastname = lastName;
		}
		}

	


