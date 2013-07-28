/**
 * 
 */
package edu.scu.oop.regulators;

/**
 * @author vidyanadig
 *
 */
public class SimpleThermostat implements SimpleRegulator{

	/**
	 * @author vidyanadig
	 *
	 */
	public class TSensor {

		private Environment environ; // an object of type Environment.
		
		public TSensor (Environment environ) {
			// A constructor to set the value of the data member, environ.
			this.environ = environ;
			StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
			System.out.printf("\n\nIn "+ stackTraceElements[1].getClassName() + "::"+ stackTraceElements[1].getMethodName());
			
		}
		
		public double getCurrentHomeTemperatureF() {
			//returns the current temperature of the environ object.
			StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
			System.out.printf("\n\nIn "+ stackTraceElements[1].getClassName() + "::"+ stackTraceElements[1].getMethodName());	
			return this.environ.getCurrentTemperature();
		}
	}

	private Environment environ; //an object of type Environment.
	private TSensor sensor;// an object of type TSensor.			

	public  SimpleThermostat (Environment environ) {
		/* 
		 * Sets the data member, environ to the value of the parameter, environ. 
		 * Creates the data member, sensor object using the environ parameter.
		 */
		this.environ = environ;
		this.sensor =  this.new TSensor(environ);
		StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
		System.out.printf("\n\nIn "+ stackTraceElements[1].getClassName() + "::"+ stackTraceElements[1].getMethodName());
	}
	
	@Override
	public double getCurrentHomeTemperatureF() {
		StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
		System.out.printf("\n\nIn "+ stackTraceElements[1].getClassName() + "::"+ stackTraceElements[1].getMethodName());
		// returns the current temperature of the environment, using the sensor object.
		return this.sensor.getCurrentHomeTemperatureF();
	}
	

	@Override
	public void showCurrentHomeTemperatureF() {
		// From SimpleRegulator
		StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
		System.out.printf("\n\nIn "+ stackTraceElements[1].getClassName() + "::"+ stackTraceElements[1].getMethodName());
		System.out.printf("\n\tShowing Current Home Temperature in F: " + this.sensor.getCurrentHomeTemperatureF());
	}

	@Override
	public void reduceTemperature(double noOfDegrees) {
		// From SimpleRegulator
		StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
		System.out.printf("\n\nIn "+ stackTraceElements[1].getClassName() + "::"+ stackTraceElements[1].getMethodName());
		this.environ.setCurrentTemperature(this.environ.getCurrentTemperature() - noOfDegrees);
	}

	@Override
	public void increaseTemperature(double noOfDegrees) {
		// From SimpleRegulator
		StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
		System.out.printf("\n\nIn "+ stackTraceElements[1].getClassName() + "::"+ stackTraceElements[1].getMethodName());
		this.environ.setCurrentTemperature(this.environ.getCurrentTemperature() + noOfDegrees);
	}

	

}
