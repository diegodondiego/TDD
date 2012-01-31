/**
 * 
 */
package br.oloboguara.tests;

import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyDouble;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.when;
import static org.powermock.api.mockito.PowerMockito.mockStatic;
import static org.powermock.api.mockito.PowerMockito.verifyStatic;

import java.io.Serializable;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import br.oloboguara.statics.StaticHelpers;

/**
 * @author dondiego
 * 
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(StaticHelpers.class)
public class StaticHelpersTests {

	/**
	 * testing {@link StaticHelpers#getCurrencyAsPhrase(Double)}
	 */
	@Test
	public void getCurrencyAsPhraseTests() {

		mockStatic(StaticHelpers.class);

		when(StaticHelpers.getCurrencyAsPhrase(anyDouble(), any(Serializable.class))).thenReturn("hello!");
		
		assertTrue("hello!".equals(StaticHelpers.getCurrencyAsPhrase(0D, 1L)));

		verifyStatic(times(2));
		
		System.out.println(StaticHelpers.getSystemDate());
		
	}

}
