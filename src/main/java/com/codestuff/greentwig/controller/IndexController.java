package com.codestuff.greentwig.controller;

import java.sql.Connection;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/")
public class IndexController {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@RequestMapping("/f5")
	public String f5Monitor() {
		return "OK";
	}
	
	@RequestMapping("/db")
	public String dbInfo() {
		String url = "";
		String response = "OK";
		try(Connection con= jdbcTemplate.getDataSource().getConnection()) {
			System.out.println("Request Received at F5Monitor"+con.getMetaData().getURL());
			url = con.getMetaData().getURL();
			response="<p><strong>"+url+"</strong></p>";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return response;
	}
}
