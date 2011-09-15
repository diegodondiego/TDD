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
		five.times(2);
		Assert.assertTrue(10 == five.amount());

	}

}
