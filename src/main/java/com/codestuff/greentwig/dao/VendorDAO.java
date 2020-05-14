package com.codestuff.greentwig.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.codestuff.greentwig.vo.Vendor;

@Component
public interface VendorDAO {
	
	public void add(Vendor vendor);
	
	public void delete(String vendorID);
	
	public Vendor get(String vendorID);
	
	public List<Vendor> getAll();
}
