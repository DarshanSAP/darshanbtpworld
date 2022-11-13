package com.darshanbtp.service.com;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.darshanbtp.demo.com.entities.vendor;

@Component
public class VendorService {
	
	HashMap<String, vendor> Vendors = new HashMap<String, vendor>(); 
	
	@Autowired
	vendor ven1;
	@Autowired
	vendor ven2;
	@Autowired
	vendor ven3;
	
	private void FillVendors() {
		// TODO Auto-generated method stub
		
		Vendors.put("1", ven1);
		Vendors.put("2", ven2);
		Vendors.put("3", ven3);
		
	}
	
	
	public VendorService() {
		FillVendors();
	}



	public HashMap<String, vendor> getallvendors() {
		FillVendors();
		return Vendors;
	}
	
	public vendor getvendorbyid( String vendorId ) {
		FillVendors();
		return (vendor)Vendors.get(vendorId);
	}
	
	public vendor createvendor( vendor vendorId ) {
		FillVendors();
		return (vendor)Vendors.put("4", vendorId); 
	}
	
	public vendor updatevendor( vendor vendorId ) {
		FillVendors();
		return vendorId;
		
	}
	
	public void deletevendor( String vendorId ) {
		FillVendors();
		Vendors.remove(vendorId);
		
	}
	
	

}
