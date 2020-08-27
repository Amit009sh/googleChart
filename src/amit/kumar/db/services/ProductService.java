package amit.kumar.db.services;

import java.util.List;

import amit.kumar.beans.Products;

public interface ProductService {
	public void saveOrUpdate(Products contact);
    public void delete(int contactId);    
    public Products get(int contactId);   
    public List<Products> list();
    public String find();
}
