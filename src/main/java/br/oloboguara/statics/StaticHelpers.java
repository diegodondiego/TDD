/**
 * 
 */
package br.oloboguara.statics;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author dondiego
 *
 */
public final class StaticHelpers {

	public static String getCurrencyAsPhrase(Double value, Serializable ser) {
		return null;
	}
	
	public static String getSystemDate() {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		return sdf.format(new Date());
	}
	
}

