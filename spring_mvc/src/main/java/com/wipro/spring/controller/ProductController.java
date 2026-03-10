package com.wipro.spring.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wipro.spring_mvc.entity.Product;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/estore")
public class ProductController {

	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	@ResponseBody
	public String welcome() {

		return "<h1  style='color:red'>WELCOME CUSTOMERS</h1>";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addProduct(HttpServletRequest request, HttpServletResponse response, HttpSession session) {

		int pid = Integer.parseInt(request.getParameter("pid"));
		String pname = request.getParameter("pname");
		double price = Double.parseDouble(request.getParameter("price"));

		Product product = new Product();

		product.setPid(pid);
		product.setPname(pname);
		product.setPrice(price);
		
		
		session.setAttribute("product", product);
		

		return "display"; // display.jsp

	}

	@RequestMapping(value="/show" , method = RequestMethod.POST)
	  public String   readAndShowProduct(@ModelAttribute Product product , HttpSession session) {
		  
		  
				session.setAttribute("product", product);
			
				return "display";
		  
	  }
	
		
	}
	


