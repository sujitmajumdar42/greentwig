package com.codestuff.greentwig.dao;

import java.util.List;

import com.codestuff.greentwig.vo.Item;

public interface ItemDAO {
	
	public void add(Item item);

	public void delete(String id);

	public Item get(String id);

	public List<Item> getAll();

	public void update(Item item);
}
