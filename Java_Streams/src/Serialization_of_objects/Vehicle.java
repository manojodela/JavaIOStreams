package Serialization_of_objects;

import java.io.Serializable;

public class Vehicle implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3450200787912401189L;
	private String type;
	private int no;
	
	
	public Vehicle(String type, int no) {
		super();
		this.type = type;
		this.no = no;
	}

	@Override
	public String toString() {
		return "Vehicle [type=" + type + ", no=" + no + "]";
	}
	
	
}
