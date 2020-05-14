package com.codestuff.greentwig.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.codestuff.greentwig.vo.Vendor;

@Service
public interface VendorService {

	public void add(Vendor vendor);
	
	public void delete(String vendorID);
	
	public Vendor get(String vendorID);
	
	public List<Vendor> getAll();
	
	public void update(Vendor vendor);
	
}
