package com.resileo.ecom_sample.ws.bean;

import java.io.Serializable;

public class ParcelBean implements Serializable{

	private static final long serialVersionUID = 884299960261806608L;
	
	private String strTrackId, strReturnCode, strReturnDescription;
	
	public ParcelBean() {
	}
	
	public ParcelBean(String strTrackId, String strReturnCode, String strReturnDescription) {
		this.strTrackId = strTrackId;
		this.strReturnCode = strReturnCode;
		this.strReturnDescription = strReturnDescription;
	}
	
	public String getTrackId() {
		return strTrackId;
	}
	public void setTrackId(String strTrackId) {
		this.strTrackId = strTrackId;
	}
	
	public String getReturnCode() {
		return strReturnCode;
	}
	public void setReturnCode(String strReturnCode) {
		this.strReturnCode = strReturnCode;
	}
	
	public String getReturnDescription() {
		return strReturnDescription;
	}
	public void setReturnDescription(String strReturnDescription) {
		this.strReturnDescription = strReturnDescription;
	}
	
	@Override
	public String toString() {
		return strTrackId+" :: "+strReturnCode+" :: "+strReturnDescription;
	}
}
