/**
 * 
 */
package br.oloboguara.spy;

/**
 * @author dondiego
 * 
 */
public class Multiply {


	/**
	 * the first number to multiply.
	 */
	private Long firstNumber;
	
	/**
	 * the second number.
	 */
	private Long secondNumber;
	


	/**
	 * 
	 * @param firstNumber
	 * @param secondNumber
	 */
	public Multiply(Long firstNumber, Long secondNumber) {
		super();
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
	}
	
	/**
	 * a.k.a result
	 * 
	 * @return
	 */
	public Long multiplyDatShit() {
			
		return this.firstNumber * this.secondNumber;
	}
	
}
