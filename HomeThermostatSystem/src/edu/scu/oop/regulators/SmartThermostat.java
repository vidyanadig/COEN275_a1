/**
 * 
 */

package edu.scu.oop.regulators;
import java.util.Date;

/**
 * @author vidyanadig
 *
 */
public class SmartThermostat implements SmartRegulator {
	
	private final static int STEP = 3; 
	private Environment environ; // an object of type Environment.
	private SimpleThermostat simpleTherm; //an object of type SimpleThermostat.
	private TempMode mode; // an object of type TempMode.	
	private Date currentTime; // an object of type java.util.Date

	public SmartThermostat (Environment environ) {
		/*
		 * Sets the data member, environ to the value of the parameter, environ. 
		 * Creates the data member, simpleTherm object using the environ parameter and a TSensor object (creates it).
		 * Instantiates the currentTime object. 
		 * Sets the default mode to either HEAT or COOL (your choice) 
		 */
		this.environ = environ;
		this.simpleTherm = new SimpleThermostat(environ);
		this.currentTime = new Date();
		this.mode = TempMode.HEAT;
		StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
		System.out.printf("\n\nIn "+ stackTraceElements[1].getClassName() + "::"+ stackTraceElements[1].getMethodName());
	}
		
	public double getCurrentHomeTemperatureF() {
		StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
		System.out.printf("\n\nIn "+ stackTraceElements[1].getClassName() + "::"+ stackTraceElements[1].getMethodName());
		// calls the getCurrentHomeTemperatureF() on simpleTherm object and  returns the value.
		return this.simpleTherm.getCurrentHomeTemperatureF();
	}
	
	public void showCurrentHomeTemperatureF() {
		StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
		System.out.printf("\n\nIn "+ stackTraceElements[1].getClassName() + "::"+ stackTraceElements[1].getMethodName());
		// calls the showCurrentHomeTemperatureF() on simpleTherm object and  displays the value. 
		this.simpleTherm.showCurrentHomeTemperatureF();
	}
	
	public void reduceTemperature(double noOfDegrees) {
		StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
		System.out.printf("\n\nIn "+ stackTraceElements[1].getClassName() + "::"+ stackTraceElements[1].getMethodName());
		// calls the reduceTemperature() method on simpleTherm object.
		this.simpleTherm.reduceTemperature(noOfDegrees);
	}
	
	public void	showCurrentStatus() {
		//should display the current date and time, current mode, current temperature in Fahrenheit and Centigrade.
		StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
		System.out.printf("\n\nIn "+ stackTraceElements[1].getClassName() + "::"+ stackTraceElements[1].getMethodName());
		System.out.printf("\n\tShowing Current data and time: "+ this.currentTime);
		System.out.printf("\n\tShowing Current mode: ", this.mode.toString());
		System.out.printf("\n\tShowing Current Temperature in F: " + this.getCurrentHomeTemperatureF());
		this.showCurrentHomeTemperatureC();
	}
			
	
	public void increaseTemperature(double noOfDegrees) {
		StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
		System.out.printf("\n\nIn "+ stackTraceElements[1].getClassName() + "::"+ stackTraceElements[1].getMethodName());
		// calls the increaseTemperature() method on simpleTherm object.
		this.simpleTherm.increaseTemperature(noOfDegrees);
	}

	@Override
	public void showCurrentHomeTemperatureC() {
		// calls the getCurrentHomeTemperatureF() on simpleTherm object and  displays the value in degrees Celsius.
		StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
		System.out.printf("\n\nIn "+ stackTraceElements[1].getClassName() + "::"+ stackTraceElements[1].getMethodName());
		System.out.printf("\n\tShowing Current Temperature in C: " + (this.getCurrentHomeTemperatureF() - 32) * 5/9);
	}

	@Override
	public void setMode(TempMode mode) {
		//  assigns the parameter mode to data member mode.
		StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
		System.out.printf("\n\nIn "+ stackTraceElements[1].getClassName() + "::"+ stackTraceElements[1].getMethodName());
		this.mode = mode;
	}

	@Override
	public void coolAt(double temperature) {
		/* 
		 * If the mode is COOL, and the current temperature of the environ object is >= temperature (parameter), 
		 * calls reduceTemperature() of simpleTherm object and reduces temperature by STEP degrees.  
		 * If the mode is not COOL, does nothing.
		 */
		StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
		System.out.printf("\n\nIn "+ stackTraceElements[1].getClassName() + "::"+ stackTraceElements[1].getMethodName());
		if (this.mode == TempMode.COOL && this.environ.getCurrentTemperature() >= temperature) {
			this.simpleTherm.reduceTemperature(STEP);
		} else {
			System.out.println("\n Not cooling");
		}
	}

	@Override
	public void heatAt(double temperature) {
		/* 
		 * If the mode is HEAT, and the current temperature of the environ object is <= temperature (parameter), 
		 * calls increaseTemperature() of simpleTherm object and increases temperature by STEP degrees.  
		 * If the mode is not HEAT, does nothing.
		 */
		StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
		System.out.printf("\n\nIn "+ stackTraceElements[1].getClassName() + "::"+ stackTraceElements[1].getMethodName());
		if (this.mode == TempMode.HEAT && this.environ.getCurrentTemperature() <= temperature) {
			this.simpleTherm.increaseTemperature(STEP);
		} else {
			System.out.println("\n Not heating");
		}
	}

	@Override
	public void showDateTime() {
		// displays the current date and time.
		StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
		System.out.printf("\n\nIn "+ stackTraceElements[1].getClassName() + "::"+ stackTraceElements[1].getMethodName());
		System.out.printf("\nShowing Current date and time: " + this.currentTime.toString()); 
		
	}



}
