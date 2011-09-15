/**
 * 
 */
package br.oloboguara.tests;

import org.junit.Assert;
import org.junit.Test;

import br.oloboguara.currency.BrazillianReal;

/**
 * @author dondiego
 * 
 */
public class RealTests {

	@Test
	public void testMultiplication() {
		
		BrazillianReal five = new BrazillianReal(5);
		BrazillianReal ten = five.times(2);
		Assert.assertTrue(5 == five.amount());
		five.times(2);
		ten = ten.times(2);
		Assert.assertTrue(10 != ten.amount());
		Assert.assertTrue(20 == ten.amount());

	}

}
