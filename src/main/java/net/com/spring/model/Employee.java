/*
 * GumBox Inc
 * (c) 2022 GumBox Inc. Viet Nam
 *
 */
package net.com.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author falcon
 */
@Entity // mappting table database
@Table(name = "employee") // Name table. Default name table is name Class
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Auto_increment
	private long id;

	@Column(name = "first_name") // ( name, length, nullable, unique)
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "email")
	private String email;

	public long getId() { return id; }

	public void setId( long id ) { this.id = id; }

	public String getFirstName() { return firstName; }

	public void setFirstName( String firstName ) { this.firstName = firstName; }

	public String getLastName() { return lastName; }

	public void setLastName( String lastName ) { this.lastName = lastName; }

	public String getEmail() { return email; }

	public void setEmail( String email ) { this.email = email; }

}