package amit.kumar.db.imp.resources;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import amit.kumar.beans.Products;
import amit.kumar.db.services.ProductDAO;

@Repository
public class ProductDAOImpl implements ProductDAO {

	private JdbcTemplate jdbcTemplate;
	 
    public ProductDAOImpl(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }
 
    
	@Override
	public void saveOrUpdate(Products contact) {

	}

	@Override
	public void delete(int contactId) {

	}

	@Override
	public Products get(int contactId) {
		return null;
	}

	@Override
	public List<Products> list() {
		 String sql = "select * from (select sum(value) value , payitem from  pay_result where payyear = 2018 and paymonth = 1 GROUP BY payitem ) where rownum <=24";
		    List<Products> listContact = jdbcTemplate.query(sql, new RowMapper<Products>() {
		 
		        @Override
		        public Products mapRow(ResultSet rs, int rowNum) throws SQLException {
		        	Products product = new Products();
		        	product.setPayitem(rs.getString("payitem"));
		        	product.setValue(rs.getInt("value"));
		            
		            return product;
		        }
		 
		    });
		 
		    return listContact;
	}

}
