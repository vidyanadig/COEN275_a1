/**
 * 
 */
package edu.scu.oop.regulators;

/**
 * @author vidyanadig
 *
 */
public interface SimpleRegulator {

	public double getCurrentHomeTemperatureF();
	public void showCurrentHomeTemperatureF() ; 
	public void reduceTemperature(double noOfDegrees) ; 
	public void increaseTemperature (double noOfDegrees); 

}
