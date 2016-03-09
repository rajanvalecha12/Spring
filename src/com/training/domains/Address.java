package com.training.domains;

public class Address {
private String addrLine1;
private String addrLine2;
private String city;
private String pincode;
public String getAddrLine1() {
	return addrLine1;
}
public void setAddrLine1(String addrLine1) {
	this.addrLine1 = addrLine1;
}
public String getAddrLine2() {
	return addrLine2;
}
public void setAddrLine2(String addrLine2) {
	this.addrLine2 = addrLine2;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getPincode() {
	return pincode;
}
public void setPincode(String pincode) {
	this.pincode = pincode;
}
public Address(String addrLine1, String addrLine2, String city, String pincode) {
	super();
	this.addrLine1 = addrLine1;
	this.addrLine2 = addrLine2;
	this.city = city;
	this.pincode = pincode;
}
public Address() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Address [addrLine1=" + addrLine1 + ", addrLine2=" + addrLine2 + ", city=" + city + ", pincode=" + pincode
			+ "]";
}

}
