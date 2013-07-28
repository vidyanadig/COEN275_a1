/**
 * 
 */
package edu.scu.oop.regulators;

/**
 * @author vidyanadig
 *
 */
public interface SmartRegulator extends SimpleRegulator {
	public void	showCurrentHomeTemperatureC();
	public void	setMode(TempMode mode);
	public void	coolAt(double temperature);
	public void	heatAt (double temperature);
	public void	showDateTime();
}
