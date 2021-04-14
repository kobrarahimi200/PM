package com.kobra.services;
import com.kobra.models.*;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

@Service 
public class ProductService {

	private List<Mobile> mobiles = new ArrayList<>();//list of the mobile devices
	private List<Book> books = new ArrayList<>();//list of the books
	private List<Mobile> cart = new ArrayList<>();//list of cart list
	
	/**
	 * adding to the list of mobiles
	 * @return
	 */
	public List<Mobile> getAllMobiles() {
		mobiles.add(new Iphone("Iphone 12", "124", 64, 1020,"https://tinyurl.com/yecmbft5"));
		mobiles.add(new Iphone("Iphone X", "125", 64, 780,"https://tinyurl.com/2rnm4up8"));
		mobiles.add(new Samsung("Galaxy note8", "120", 64, 450, CPU.EXYNOS,"https://tinyurl.com/p8a97cvh"));
		mobiles.add(new Samsung("Galaxy A5", "121", 128, 300, CPU.EXYNOS,"https://tinyurl.com/y42k83uf"));
		mobiles.add(new Samsung("Galaxy S10", "122", 256, 700, CPU.SNAPDRAGON,"https://tinyurl.com/742ufejp"));
		mobiles.add(new Samsung("Galaxy A5", "121", 128, 300, CPU.EXYNOS,"https://tinyurl.com/y42k83uf"));
		mobiles.add(new Samsung("Galaxy S10", "122", 256, 700, CPU.SNAPDRAGON,"https://tinyurl.com/742ufejp"));
		mobiles.add(new Iphone("11 pro", "123", 124, 456,"https://tinyurl.com/2rnm4up8"));
	
		return mobiles;
	}
	/**
	 * adding to the list of books
	 * @return
	 */
	public List<Book> getAllBooks() {
		
		books.add(new PaperBook("200", "Kite Runner", 320, "Khalid Hossini", "MC rohil", 20, Type.OILY,"https://tinyurl.com/2u6r4xxt"));
		books.add(new PaperBook("201", "BECOMING", 230, "Michelle Obama", "MC rohil", 26, Type.OILY,"https://tinyurl.com/2rtfmrhu"));
		books.add(new DigitalBook( "202", "Fast thinking",202, "Ariya Demo", "MC rohil",80, 60,"https://tinyurl.com/jm4vyaah"));
		books.add(new DigitalBook("203", "Kite Runner",203,  "Khalid Hossini", "MC rohil", 65, 33,"https://tinyurl.com/jm4vyaah"));
		books.add(new PaperBook("204", "BECOMING", 230, "Michelle Obama", "MC rohil", 26, Type.OILY,"https://tinyurl.com/2rtfmrhu"));
		books.add(new DigitalBook( "205", "Fast thinking",202, "Ariya Demo", "MC rohil",80, 60,"https://tinyurl.com/jm4vyaah"));
		
		return books;
	}
	/**
	 * get moblies list
	 * @return
	 */
	public List<Mobile> getMobiles() {
		return mobiles;
	}

	/**
	 * sets moblies list
	 * @param mobiles
	 */
	public void setMobiles(List<Mobile> mobiles) {
		this.mobiles = mobiles;
	}
	/**
	 * get book list
	 * @return
	 */
	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}
	/**
	 * get cart list
	 * @return
	 */
	public List<Mobile> getCart() {
		return cart;
	}

	public void setCart(List<Mobile> cart) {
		this.cart = cart;
	}
	
/**
 * gets the mobile object with the given id
 * @param id
 * @return
 */
	public Mobile getMobileById(String id) {
		Predicate<Mobile> byId = p -> p.getproductID().equals(id);
		return filterMobiles(byId);
	}
	/**
	 * find the mobile object
	 * @param strategy
	 * @return
	 */
	public Mobile filterMobiles(Predicate<Mobile> strategy) {
		return getAllMobiles().stream().filter(strategy).findFirst().orElse(null);
	}
	/**
	 * gets the book object from the list with the given id
	 * @param id
	 * @return
	 */
	public Book getBookById(String id) {
		Predicate<Book> byId = p -> p.getproductID().equals(id);
		return filterBooks(byId);
	}
	/**
	 * find the book object
	 * @param strategy
	 * @return
	 */
	public Book filterBooks(Predicate<Book> strategy) {
		return getAllBooks().stream().filter(strategy).findFirst().orElse(null);
	}
	/**
	 * add mobile to the cart
	 * @param id
	 */
	public void addMobileToCart(String id) {
		cart.add(getMobileById(id));
	}
	
}
