package com.codestuff.greentwig.dao;

import java.util.List;

import com.codestuff.greentwig.vo.Category;

public interface CategoryDAO {

	public void add(Category category);

	public void delete(String id);

	public Category get(String id);

	public List<Category> getAll();

	public void update(Category category);
}
