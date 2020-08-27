package amit.kumar.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import amit.kumar.db.services.ProductService;

/**
 * 
 */
@Controller
@RequestMapping("/gcharts")
public class GglPieChart
{
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping(value = "/listchart", method = RequestMethod.GET , produces = "application/json")
	public  String productChart(ModelMap model,HttpServletResponse response){
		
		model.addAttribute("SalesList", productService.find());
		return "listchart";
	}
}
