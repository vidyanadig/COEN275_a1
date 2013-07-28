/**
 * 
 */
package edu.scu.oop.regulators;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

/**
 * @author vidyanadig
 *
 */
public class EnvironmentTest extends TestCase {

	private Environment environ;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		environ = new Environment();
	}

	@Test
	public void test() {
		assertEquals((double)0, environ.getCurrentTemperature());
		environ.setCurrentTemperature(90);
		assertEquals((double)90, environ.getCurrentTemperature());
		environ.reduce();
		assertEquals((double)89, environ.getCurrentTemperature());
		environ.reduce(20);
		assertEquals((double)69, environ.getCurrentTemperature());
		environ.increase();
		environ.reduce();
		assertEquals((double)69, environ.getCurrentTemperature());
		environ.setCurrentTemperature(190.45);
		assertEquals((double)190.45, environ.getCurrentTemperature());
	}

}
