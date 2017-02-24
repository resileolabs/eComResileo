package com.resileo.ecom_sample.ws.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import com.resileo.ecom_sample.ws.bean.ParcelBean;

public class ParcelServiceImpl implements ParcelServiceInterface {

	private static Map<String, ParcelBean> parcels = new HashMap<String, ParcelBean>();
	
	static{
		ParcelBean parcel = null;
		parcel = new ParcelBean("AE00123", "E1001", "Invalid Tracking Id.");
		parcels.put("AE00123", parcel);
		
		parcel = new ParcelBean("AE00201", "E1002", "Parcel in transit. Location is Cupertino, CA.");
		parcels.put("AE00201", parcel);
		
		parcel = new ParcelBean("AE00301", "E1003", "Parcel was delivered. Date Time 21-FEB-2017 14:15.");
		parcels.put("AE00301", parcel);
		
		parcel = new ParcelBean("AE00401", "E1004", "Parcel was returned to sender.");
		parcels.put("AE00401", parcel);
		
		parcel = new ParcelBean("AE00501", "E1005", "Receiver is not available to receive. Checked 2 times.");
		parcels.put("AE00501", parcel);
		
		parcel = new ParcelBean("AE00601", "E1006", "Parcel is damaged. Returned by receiver. Parcel at warehouse Dallas TX.");
		parcels.put("AE00601", parcel);
		
	}
	
	@Override
	public ParcelBean getTrackingIdStatus(String trackId) {
		ParcelBean parcel = null;
		
		try{
			Random r = new Random();
			int nWait = r.nextInt(6-2) + 2;
			
			Thread.sleep( nWait*1000 );
		} catch(Throwable th) {
			System.out.println("Exception while processing Items.getItemStatus(): "+th.getMessage());
		}
		
		if( parcels.containsKey(trackId) ) {
			parcel = parcels.get(trackId);
		} else {
			parcel = parcels.get("AE00123");
		}
		
		return parcel;
	}

}
