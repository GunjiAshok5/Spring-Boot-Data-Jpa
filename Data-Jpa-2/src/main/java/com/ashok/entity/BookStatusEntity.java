package com.ashok.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data     // generate setter and getter methods
@Entity   // Mandatory Annotation 
@Table(name="BookStatus")
public class BookStatusEntity {

	@Id  // Mandatory Primary key to any one column
	private Integer BookId;
	@Column(name="BookedRoute") // optional annotation
	private String BookingRoute;
	
	private String DriverName;
	
	private Double Amount;
	
	
}
