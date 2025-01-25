package in.mbtions.di.beans;

public class Address {
	private int hno;
	private String city;
	private int pincode;
	
	public Address(int hno, String city, int pincode) {
		this.hno = hno;
		this.city = city;
		this.pincode = pincode;
	}
	
	public String toString() {
		return "#"+hno+", "+city+", "+pincode;
	}
}
