package com.codestuff.greentwig.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.codestuff.greentwig.vo.Expense;

public class ExpenseRowMapper implements RowMapper<Expense> {

	@Override
	public Expense mapRow(ResultSet rs, int rowNum) throws SQLException {
		Expense expense = new Expense();
		expense.setExpid(rs.getString("expid"));
		expense.setExpDate(rs.getString("exp_date"));
		expense.setTransid(rs.getString("transid"));
		expense.setVendorid(rs.getString("vendorid"));
		expense.setTotalCost(rs.getInt("total_cost"));
		expense.setPaymentMode(rs.getString("payment_mode"));
		return expense;
	}

}
