package com.codestuff.greentwig.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.codestuff.greentwig.dao.VendorDAO;
import com.codestuff.greentwig.vo.Vendor;

@Component
public class VendorDAOImpl implements VendorDAO {

	private static final String INSERT = "INSERT INTO VENDOR(vendorid,description) values(?,?)";
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public void add(Vendor vendor) {
		jdbcTemplate.update(INSERT,vendor.getVendorID(),vendor.getDesc());

	}

	@Override
	public void delete(String vendorID) {
		// TODO Auto-generated method stub

	}

	@Override
	public Vendor get(String vendorID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Vendor> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
