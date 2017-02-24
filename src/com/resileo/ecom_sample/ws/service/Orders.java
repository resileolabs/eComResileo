package com.resileo.ecom_sample.ws.service;

import java.util.Random;

public class Orders {
	
	public String getUserOrders(String strUserCode) {
		String strDescription = null;
		
		// Wait between 2 and 6 seconds, as equivalent to business-logic's processing time
		try{
			Random r = new Random();
			int nWait = r.nextInt(6-2) + 2;
			
			Thread.sleep( nWait*1000 );
		} catch(Throwable th) {
			System.out.println("Exception while processing Items.getItemStatus(): "+th.getMessage());
		}
		
		if( strUserCode.equals("U8001") ) {
			strDescription = "E3101-No orders exist for this user";
		} else if( strUserCode.equals("U8002") ) {
			strDescription = "E3102-O345890;O890456";
		} else {
			strDescription = "E3100-Invalid UserCode";
		}
		
		return strDescription;
	}
}
