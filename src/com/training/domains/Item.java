package com.training.domains;

public class Item {
private int itemnumber;
private String itemName;
private double ratePerUnit;
public int getItemnumber() {
	return itemnumber;
}
public void setItemnumber(int itemnumber) {
	this.itemnumber = itemnumber;
}
public String getItemName() {
	return itemName;
}
public void setItemName(String itemName) {
	this.itemName = itemName;
}
public double getRatePerUnit() {
	return ratePerUnit;
}
public void setRatePerUnit(double ratePerUnit) {
	this.ratePerUnit = ratePerUnit;
}
public Item(int itemnumber, String itemName, double ratePerUnit) {
	super();
	this.itemnumber = itemnumber;
	this.itemName = itemName;
	this.ratePerUnit = ratePerUnit;
}
public Item() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Item [itemnumber=" + itemnumber + ", itemName=" + itemName + ", ratePerUnit=" + ratePerUnit + "]";
}

}
