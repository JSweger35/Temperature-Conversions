import java.util.Scanner;
/**
* TemperatureDriver runs and tests the Temperature class.
* 
* @author Jake Sweger
* @version 2.0
*/
public class TemperatureDriver {
    /**
     * main() reads Fahrenheit temperatures and 
     * displays their Celsius and Kelvin equivalents.
     */
    public static void main(String[] args) {
        double inputTemperature = 0.0;
        Scanner keyboard = new Scanner(System.in); 
        Temperature t1 = new Temperature();
        String temperaturetype= "";
        
        System.out.print("Enter a temperature type (C for Celsius, " +
        "F for Fahrenheit, K for Kelvin): ");
        System.out.print("Enter a Fahrenheit temperature: "); 
        inputTemperature = keyboard.nextDouble(); 
        System.out.println("You entered " + inputTemperature + 
                " degrees Fahrenheit"); 
        t1.setDegreesFahrenheit(inputTemperature);
        System.out.println("which is " + t1.getDegreesCelsius() + 
                " degrees Celsius"); 
        System.out.println("and " + t1.getDegreesKelvin() + 
                " degrees Kelvin.");
        System.out.print("Enter another Fahrenheit temperature: ");
    }
}