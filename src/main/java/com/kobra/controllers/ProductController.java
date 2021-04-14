package com.kobra.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kobra.services.ProductService;

@Controller
@RequestMapping("/products")
public class ProductController {

      @Autowired
	  private ProductService productService;
      
      @GetMapping("/all")   
      public String createAllItems() {
    	  if( productService.getBooks().isEmpty() &&  productService.getMobiles().isEmpty()) {
    		  productService.getAllMobiles();
        	  productService.getAllBooks();
    	  } 
    	  return "product_all";
      }
      
      @GetMapping("/mobiles") 
	  public String getAllMobiles(Model model) {
    	  
    	  if(!model.containsAttribute("mobiles")) {
    		  model.addAttribute("mobiles",productService.getMobiles());
    	  }
		  return "home";
	  } 
      
      @GetMapping("/books")  
	  public String getAllBooks(Model model) {	 
 		model.addAttribute("books",productService.getBooks());
		  return "home";//name of the jsp file product_all
	  } 

      /**
       * get the product with the given id
       * @param model
       * @param productID
       * @return
       */
      @GetMapping("/{productID}")
      public String getProductById(Model model, @PathVariable("productID") String productID) {
    	  productService.addMobileToCart(productID);
    	 model.addAttribute("cartProducts",productService.getCart());
    	  return "mobile";
      }
      

      /**
       * delete the given product id from the cart list
       * @param model
       * @param productID
       * @return
       */
      @RequestMapping(value = "/deleted/{productID}", method = RequestMethod.GET)
      public String removeFromCart(Model model, @PathVariable("productID") String productID) {
    	  productService.getCart().remove(productService.getMobileById(productID));
    	  return "mobile";
      }
}
