/**
 * 
 */
package br.oloboguara.currency;

/**
 * @author dondiego
 * 
 */
public class BrazillianReal {

	private int amount;

	/**
	 * 
	 * @param value
	 */
	public BrazillianReal(int value) {
		this.amount = value;
	}

	/**
	 * 
	 * @param multiplier
	 * @return
	 */
	public BrazillianReal times(int multiplier) {
		return new BrazillianReal(this.amount * multiplier);
	}

	/**
	 * 
	 * @return
	 */
	public int amount() {
		return this.amount;
	}

}
