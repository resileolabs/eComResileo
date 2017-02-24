package com.resileo.ecom_sample.ws.service;

import java.util.Random;

public class Items {
	
	public String getItemStatus(String strItemCode) {
		String strDescription = null;
		
		// Wait between 2 and 6 seconds, as equivalent to business-logic's processing time
		try{
			Random r = new Random();
			int nWait = r.nextInt(6-2) + 2;
			
			Thread.sleep( nWait );
		} catch(Throwable th) {
			System.out.println("Exception while processing Items.getItemStatus(): "+th.getMessage());
		}
		
		if( strItemCode.equals("I9101") ) {
			strDescription = "E2001-Item does not exist";
		} else if( strItemCode.equals("I9201") ) {
			strDescription = "E2002-Out of stock";
		} else if( strItemCode.equals("I9301") ) {
			strDescription = "E2003-In stock;Available Quantity 2276";
		} else {
			strDescription = "E2000-Invalid ItemCode";
		}
		
		return strDescription;
	}
	
	public String getItemPrice(String strItemCode) {
		String strDescription = null;
		
		// Wait between 2 and 6 seconds, as equivalent to business-logic's processing time
		try{
			Random r = new Random();
			int nWait = r.nextInt(6-2) + 2;
			
			Thread.sleep( nWait );
		} catch(Throwable th) {
			System.out.println("Exception while processing Items.getItemStatus(): "+th.getMessage());
		}
		
		if( strItemCode.equals("I9401") ) {
			strDescription = "E2101-Price 400.80;Discount 0.0";
		} else if( strItemCode.equals("I9402") ) {
			strDescription = "E2102-Price 520.00;Discount 15.0";
		} else if( strItemCode.equals("I9403") ) {
			strDescription = "E2103-Price 240.00;BUY1GET1FREE";
		} else {
			strDescription = "E2100-Invalid ItemCode";
		}
		
		return strDescription;
	}
	
	public static void main(String[] args) {
		System.out.println(new Random().nextInt());
	}
}
