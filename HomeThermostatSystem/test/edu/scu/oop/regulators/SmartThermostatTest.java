/**
 * 
 */
package edu.scu.oop.regulators;

import junit.framework.TestCase;

import org.junit.Test;
/**
 * @author vidyanadig
 *
 */
public class SmartThermostatTest extends TestCase{

	private SmartThermostat instSmartThermostat;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Override
	public void setUp() throws Exception {
		Environment environ = new Environment();
		environ.setCurrentTemperature(20);
		instSmartThermostat = new SmartThermostat(environ);
	}

	@Test
	public void test() {
		assertEquals((double)20,instSmartThermostat.getCurrentHomeTemperatureF());
		instSmartThermostat.showCurrentHomeTemperatureC();
		instSmartThermostat.showCurrentHomeTemperatureF();
		instSmartThermostat.coolAt(10);
		assertEquals((double)20,instSmartThermostat.getCurrentHomeTemperatureF());
		instSmartThermostat.increaseTemperature(50);
		assertEquals((double)70,instSmartThermostat.getCurrentHomeTemperatureF());
		instSmartThermostat.reduceTemperature(10);
		assertEquals((double)60,instSmartThermostat.getCurrentHomeTemperatureF());
		instSmartThermostat.setMode(TempMode.HEAT);
		instSmartThermostat.showCurrentStatus();
		instSmartThermostat.showDateTime();
		instSmartThermostat.heatAt(70);
		assertEquals((double)63,instSmartThermostat.getCurrentHomeTemperatureF());
		instSmartThermostat.setMode(TempMode.COOL);
		instSmartThermostat.coolAt(70);
		assertEquals((double)63,instSmartThermostat.getCurrentHomeTemperatureF());
		instSmartThermostat.coolAt(50);
		assertEquals((double)60,instSmartThermostat.getCurrentHomeTemperatureF());
		instSmartThermostat.heatAt(50);
		assertEquals((double)60,instSmartThermostat.getCurrentHomeTemperatureF());


	}

}
