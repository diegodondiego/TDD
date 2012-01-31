/**
 * 
 */
package br.oloboguara.tests;

import static org.junit.Assert.assertTrue;

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
		assertTrue(5 == five.amount());
		five.times(2);
		ten = ten.times(2);
		assertTrue(10 != ten.amount());
		assertTrue(20 == ten.amount());

	}

	@Test
	public void reaisEquals() {
		BrazillianReal five = new BrazillianReal(5);
		BrazillianReal secondFive = new BrazillianReal(5);
		BrazillianReal six = new BrazillianReal(6);

		assertTrue(five.equals(secondFive));
		assertTrue(!five.equals(six));
		assertTrue(five != secondFive);
		assertTrue(five != six);
	}

}