
/**
 * Write a description of class Temperature here.
 * Temperature stores a temperature in Fahrenheit, Celsius, and Kelvin scales.
 * @author Jake Sweger
 * @version Version 1.0
 */
public class Temperature
{
    private double degreesFahrenheit; // Fahrenheit temperature
    private double degreesCelsius; // Celsius temperature
    private double degreesKelvin; // Kelvin temperature

    /**
     * getDegreesCelsius retrieves the Celsius temperature value
     * 
     * @return a double value containing the Celsius temperature
     */
    public double getDegreesCelsius() {
        return degreesCelsius;
    }

    /**
     * getDegreesKelvin retrieves the Kelvin temperature value
     * 
     * @return a double value containing the Kelvin temperature
     */
    public double getDegreesKelvin() {
        return degreesKelvin;
    }

    /**
     * The setDegreesFahrenheit method sets the Fahrenheit temperature
     * 
     * @param degrees The Fahrenheit value to store 
     */
    public void setDegreesFahrenheit(double degrees) {
        degreesFahrenheit = degrees; // set Fahrenheit value
        degreesCelsius = (degreesFahrenheit - 32.0) * 5.0 / 9.0; // set Celsius
        degreesKelvin = degreesCelsius + 273.15; // set Kelvin value
    }
}

