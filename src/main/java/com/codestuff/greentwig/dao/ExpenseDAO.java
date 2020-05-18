package com.codestuff.greentwig.dao;

import java.util.List;

import com.codestuff.greentwig.vo.Expense;

public interface ExpenseDAO {
	public void add(Expense expense);

	public void delete(String id);

	public Expense get(String id);

	public List<Expense> getAll();

	public void update(Expense expense);
}
