package testdemo;

import static org.junit.Assert.*;

import org.junit.Test;

public class OrderTest {
	
	private Order order = new Order();

	@Test
	public void testQuantity() {
		int qty = 2;
		order.setQuantity(qty);
		assertEquals(qty,order.getQuantity());
	}

	@Test
	public void testItemName() {
		String itemName = "iPhone 12";
		order.setItemName(itemName);
		assertEquals(itemName,order.getItemName());
	}
	
	@Test
	public void testPrice() {
		Double price = (double) 80000;
		order.setPrice(price);
		assertEquals(price,order.getPrice(),0);
	}
	
	
	@Test
	public void testPriceWithTax() {
		Double priceWithTax = (double) 85000;
		order.setPriceWithTex(priceWithTax);
		assertEquals(priceWithTax,order.getPriceWithTex(),0);
	}
	
	@Test
	public void testPriceAndPriceWithTax() {
		Double priceWithTax = (double) 85000;
		Double price = (double) 80000;
		order.setPriceWithTex(priceWithTax);
		order.setPrice(price);
		assertNotEquals(price,order.getPriceWithTex(),0);
	}	
}
