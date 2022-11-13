package com.darshanbtp.controller.com;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.darshanbtp.demo.com.entities.vendor;
import com.darshanbtp.service.com.VendorService;

@RestController
public class VendorController {
	
	@Autowired
	VendorService vendorservice;
	
	@RequestMapping("/vendor")
	public HashMap<String, vendor> getvendors() {
		return vendorservice.getallvendors();
	}
	
	@RequestMapping("/vendor/{vendorID}")
	public vendor getvendorbyid(@PathVariable("vendorID") String vendorId) {
		return vendorservice.getvendorbyid(vendorId);
	}	
	
	@PostMapping("/vendor")
	public vendor createvendor(@RequestBody vendor Vendordata) {
		return vendorservice.createvendor(Vendordata);
	}
	
	@RequestMapping(method=RequestMethod.PUT , value = "/vendor")
	public vendor updatevendor(@RequestBody vendor Vendorupdatedata) {
		return vendorservice.updatevendor(Vendorupdatedata);
	}	
	
	@DeleteMapping("/vendor/{vendorID}")
	public void deletevendorbyid(@PathVariable("vendorID") String vendorId) {
		vendorservice.deletevendor(vendorId);
	}	
	

}
