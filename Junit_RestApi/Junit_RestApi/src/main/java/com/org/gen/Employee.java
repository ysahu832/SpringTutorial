package com.org.gen;
//import lombok.*;

//import javax.persistence.*;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
//
//@Setter
//@Getter
//@AllArgsConstructor
//@NoArgsConstructor
//@Builder

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String email;

	public String getFirstName() {
		// TODO Auto-generated method stub
		return firstName;
	}

	public void setFirstName(String firstName) {
		// TODO Auto-generated method stub
		this.firstName=firstName;
	}

	public String getLastName() {
		// TODO Auto-generated method stub
		return lastName;
	}

	public void setLastName(String lastName) {
		// TODO Auto-generated method stub
		this.lastName=lastName;
	}

	public String getEmail() {
		// TODO Auto-generated method stub
		return email;
	}

	public void setEmail(String email) {
		// TODO Auto-generated method stub
		this.email=email;
		
	}
	public static Object builder() {
		return null;
	}
	public Employee() {
		super();
	}
	public Employee(long id,String firstName,String lastName,String email) {
		super();
		this.firstName=firstName;
		this.lastName=lastName;
		this.email=email;
	}
	
	
}