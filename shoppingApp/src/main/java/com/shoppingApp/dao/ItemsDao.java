package com.shoppingApp.dao;

import java.util.List;

import com.shoppingApp.model.Items;

public interface ItemsDao {

	 long save(Items item);

	 Items get(long id);
	 
	 List<Items> getItems(String item_category);

	 List<Items> list();

	 void update(long id, Items item);

	 void delete(long id);
}
