package com.codestuff.greentwig.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.codestuff.greentwig.dao.VendorDAO;
import com.codestuff.greentwig.service.VendorService;
import com.codestuff.greentwig.vo.Vendor;

@Component
public class VendorServiceImpl implements VendorService {
	
	@Autowired
	private VendorDAO vendorDAO;
	
	@Override
	public void add(Vendor vendor) {
		vendorDAO.add(vendor);
	}

	@Override
	public void delete(String vendorID) {
		vendorDAO.delete(vendorID);

	}

	@Override
	public Vendor get(String vendorID) {
		return vendorDAO.get(vendorID);
	}

	@Override
	public List<Vendor> getAll() {
		return vendorDAO.getAll();
	}

	@Override
	public void update(Vendor vendor) {
		vendorDAO.update(vendor);
	}

}
