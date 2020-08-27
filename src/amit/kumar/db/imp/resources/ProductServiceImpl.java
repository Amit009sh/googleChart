package amit.kumar.db.imp.resources;

import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import amit.kumar.beans.Products;
import amit.kumar.db.services.ProductDAO;
import amit.kumar.db.services.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDAO productDAO;
	
	@Override
	public void saveOrUpdate(Products contact) {
		productDAO.saveOrUpdate(contact);

	}

	@Override
	public void delete(int contactId) {
		productDAO.delete(contactId);
	}

	@Override
	public Products get(int contactId) {
		return productDAO.get(contactId);
	}

	@Override
	public List<Products> list() {
		return productDAO.list();
	}

	@Override
	public String find() {		
		String message;
		JSONObject json = new JSONObject();
		JSONArray array = new JSONArray();
		JSONObject item;
		List<Products> l = productDAO.list();
		for(Products o:l){
			item = new JSONObject();
			item.put("lang",String.valueOf(o.getValue()));
			item.put("talks",o.getPayitem());
			array.put(item);
		}
		
		json.put("SalesList", array);
		message = json.toString();
		
		return message;
	
	}

}
