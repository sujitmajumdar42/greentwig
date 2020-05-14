package com.codestuff.greentwig.util;

public class SQLConstant {
	
	public static final String VENDOR_INSERT = "INSERT INTO VENDOR(vendorid,description) values(?,?)";
	public static final String VENDOR_DELETE = "DELETE FROM VENDOR WHERE vendorid=?";
	public static final String VENDOR_GET = "SELECT * FROM VENDOR where vendorid=?";
	public static final String VENDOR_GET_ALL = "SELECT * FROM VENDOR";
	public static final String VENDOR_UPDATE = "UPDATE VENDOR set decription=? where vendorid=?";
}
