package com.codestuff.greentwig.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.codestuff.greentwig.vo.Category;

public class CategoryRowMapper implements RowMapper<Category> {

	@Override
	public Category mapRow(ResultSet rs, int rowNum) throws SQLException {
		Category category = new Category();
		category.setCategoryid(rs.getString("categoryid"));
		category.setCategoryid(rs.getString("description"));
		category.setCategoryid(rs.getString("last_modified"));
		return category;
	}

}
