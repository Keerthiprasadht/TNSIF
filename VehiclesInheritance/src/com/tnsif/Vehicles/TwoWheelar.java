package com.tnsif.Vehicles;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="two_wheeler")
public class TwoWheelar extends Vehicle{
	
	
	@Column(name = "handle_type")
	private String handleTwoWheelar;
	
	public void setHandleTwoWheelar(String handleTwoWheelar) {
		this.handleTwoWheelar = handleTwoWheelar;
	}


	public String getHandleTwoWheelar() {
		return handleTwoWheelar;
	}

	
	

	
}
