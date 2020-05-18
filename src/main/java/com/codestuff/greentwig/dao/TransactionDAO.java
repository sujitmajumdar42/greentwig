package com.codestuff.greentwig.dao;

import java.util.List;

import com.codestuff.greentwig.vo.Transaction;

public interface TransactionDAO {
	
	public void add(Transaction transaction);

	public void delete(String id);

	public Transaction get(String id);

	public List<Transaction> getAll();

	public void update(Transaction transaction);
}
