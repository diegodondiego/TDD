/**
 * 
 */
package br.oloboguara.tests;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyDouble;
import static org.mockito.Mockito.when;
import static org.powermock.api.mockito.PowerMockito.mockStatic;

import java.io.Serializable;

import org.junit.Assert;
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

		Assert.assertTrue("hello!".equals(StaticHelpers.getCurrencyAsPhrase(0D, 1L)));

	}

}
