package com.codestuff.greentwig.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.codestuff.greentwig.dao.VendorDAO;
import com.codestuff.greentwig.dao.mapper.VendorRowMapper;
import com.codestuff.greentwig.vo.Vendor;
import static com.codestuff.greentwig.util.SQLConstant.VENDOR_INSERT;
import static com.codestuff.greentwig.util.SQLConstant.VENDOR_DELETE;
import static com.codestuff.greentwig.util.SQLConstant.VENDOR_GET;
import static com.codestuff.greentwig.util.SQLConstant.VENDOR_GET_ALL;
import static com.codestuff.greentwig.util.SQLConstant.VENDOR_UPDATE;

@Component
public class VendorDAOImpl implements VendorDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void add(Vendor vendor) {
		jdbcTemplate.update(VENDOR_INSERT,vendor.getVendorID(),vendor.getDesc()); 
	}

	@Override
	public void delete(String vendorID) {
		jdbcTemplate.update(VENDOR_DELETE,vendorID);
	}

	@Override
	public Vendor get(String vendorID) {
		return jdbcTemplate.query(VENDOR_GET, new VendorRowMapper()).get(0);
	}

	@Override
	public List<Vendor> getAll() {
		return jdbcTemplate.query(VENDOR_GET_ALL, new VendorRowMapper());
	}

	@Override
	public void update(Vendor vendor) {
		jdbcTemplate.update(VENDOR_UPDATE,vendor.getDesc(),vendor.getVendorID());
	}
}
