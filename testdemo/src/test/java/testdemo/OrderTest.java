package testdemo;

import static org.junit.Assert.*;

import org.junit.Test;

public class OrderTest {
	
	private Order order = new Order();

	@Test
	public void testQuantity() {
		
		// given 
		int qty = 2;
		
		//when
		order.setQuantity(qty);
		
		//then
		assertEquals(qty,order.getQuantity());
	}

	@Test
	public void testItemName() {
		
		//given
		String itemName = "iPhone 12";
		
		//when
		order.setItemName(itemName);
		
		//then
		assertEquals(itemName,order.getItemName());
	}
	
	@Test
	public void testPrice() {
		
		//given
		Double price = (double) 80000;
		
		//when
		order.setPrice(price);
		
		//then
		assertEquals(price,order.getPrice(),0);
	}
	
	
	@Test
	public void testPriceWithTax() {
		
		//given
		Double priceWithTax = (double) 85000;
		
		//when
		order.setPriceWithTex(priceWithTax);
		
		//then
		assertEquals(priceWithTax,order.getPriceWithTex(),0);
	}
	
	@Test
	public void testPriceAndPriceWithTax() {
		
		//given
		Double priceWithTax = (double) 85000;
		Double price = (double) 80000;
		
		//when
		order.setPriceWithTex(priceWithTax);
		order.setPrice(price);
		
		//then
		assertNotEquals(price,order.getPriceWithTex(),0);
	}	
}
