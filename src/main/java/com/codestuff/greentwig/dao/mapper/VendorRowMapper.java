package com.codestuff.greentwig.dao.mapper;


import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.codestuff.greentwig.vo.Vendor;

public class VendorRowMapper implements RowMapper<Vendor> {

	@Override
	public Vendor mapRow(ResultSet rs, int rowNum) throws SQLException {
		Vendor vendor = new Vendor();
		vendor.setVendorID(rs.getString("vendorid"));
		vendor.setDesc(rs.getString("description"));
		vendor.setLastModified(rs.getString("last_modified"));
		return null;
	}

}
