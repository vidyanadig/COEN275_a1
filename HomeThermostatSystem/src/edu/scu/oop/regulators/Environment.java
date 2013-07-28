/**
 * 
 */
package edu.scu.oop.regulators;

/**
 * @author vidyanadig
 *
 */
public class Environment {
	private double currentTemperature; //Units are in Fahrenheit degrees.
	
	public void setCurrentTemperature (double temperature) {
		//sets the data member, currentTemperature to the parameter value.
		StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
		System.out.printf("\n\nIn "+ stackTraceElements[1].getClassName() + "::"+ stackTraceElements[1].getMethodName());
		this.currentTemperature = temperature;
	}
	public double getCurrentTemperature() {
		//returns the current temperature.
		StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
		System.out.printf("\n\nIn "+ stackTraceElements[1].getClassName() + "::"+ stackTraceElements[1].getMethodName());
		return this.currentTemperature;
	}
	public void reduce() {
		//reduces the current temperature by a degree.
		StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
		System.out.printf("\n\nIn "+ stackTraceElements[1].getClassName() + "::"+ stackTraceElements[1].getMethodName());
		this.currentTemperature--;
	}
	public void reduce(int red) {
		//reduces the current temperature by a degree.
		StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
		System.out.printf("\n\nIn "+ stackTraceElements[1].getClassName() + "::"+ stackTraceElements[1].getMethodName());
		this.currentTemperature = this.currentTemperature - red;
	}	
	public void increase() {
		//increases the current temperature by a degree.
		StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
		System.out.printf("\n\nIn "+ stackTraceElements[1].getClassName() + "::"+ stackTraceElements[1].getMethodName());
		this.currentTemperature++;
	}
	
}
