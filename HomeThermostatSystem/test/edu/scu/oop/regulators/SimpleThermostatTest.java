package edu.scu.oop.regulators;

import junit.framework.TestCase;

import org.junit.Test;

public class SimpleThermostatTest extends TestCase {
	
	private SimpleThermostat simThermostat;
	
	@Override
	public void setUp() throws Exception {
		Environment environ = new Environment();
		environ.setCurrentTemperature(20);
		simThermostat = new SimpleThermostat(environ);
	}

	@Test
	public void test() {
		System.out.println("\nTesting SimpleThermostat");
		assertEquals((double)20, simThermostat.getCurrentHomeTemperatureF());
		simThermostat.showCurrentHomeTemperatureF();
		simThermostat.increaseTemperature(10);
		simThermostat.reduceTemperature(30);
		assertEquals((double)0, simThermostat.getCurrentHomeTemperatureF());
		simThermostat.showCurrentHomeTemperatureF();
	}

}
