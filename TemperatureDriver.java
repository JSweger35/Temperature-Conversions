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
        Temperature t1;
        String temperatureType= "";
        boolean moreTemperatures = true; //more tempteratures to convert
        t1 = new Temperature(temperatureType, inputTemperature);
        System.out.print("Enter a temperature type (C for Celsius, " +
            "F for Fahrenheit, K for Kelvin): ");
        temperatureType = keyboard.next();
        /*if (!(temperatureType.equalsIgnoreCase("F") || temperatureType.equalsIgnoreCase("C") || temperatureType.equalsIgnoreCase("K"))){
        System.out.println("You entered an invalid temperature type: " + temperatureType);
        System.out.println("It must be \"C\", \"F\", or \"K\".  Please try the program again.");
        }*/
        //else{
        System.out.print("Enter a temperature: "); 
        inputTemperature = keyboard.nextDouble();

        while (moreTemperatures) {
            if (temperatureType.equalsIgnoreCase("F")){
                System.out.println("You entered " + inputTemperature + 
                    " degrees Fahrenheit"); 

                t1.setDegreesFahrenheit(inputTemperature);
                System.out.println("which is " + t1.getDegreesCelsius() + 
                    " degrees Celsius"); 
                System.out.println("and " + t1.getDegreesKelvin() + 
                    " degrees Kelvin.");
            }

            else if (temperatureType.equalsIgnoreCase("C")) {
                System.out.println("You entered " + inputTemperature + 
                    " degrees Celsius");
                t1.setDegreesCelsius(inputTemperature);
                System.out.println("which is " + t1.getDegreesFahrenheit() + 
                    " degrees Fahrenheit"); 
                System.out.println("and " + t1.getDegreesKelvin() + 
                    " degrees Kelvin.");
            }

            else if (temperatureType.equalsIgnoreCase("K")) {
                System.out.println("You entered " + inputTemperature + 
                    " degrees Kelvin");
                t1.setDegreesKelvin(inputTemperature);
                System.out.println("which is " + t1.getDegreesCelsius() + 
                    " degrees Celsius"); 
                System.out.println("and " + t1.getDegreesFahrenheit() + 
                    " degrees Fahrenheit.");
            }

            else{
                System.out.println("You entered an invalid temperature type: " + temperatureType);
                System.out.println("It must be \"C\", \"F\", or \"K\".  Please try the program again.");
            }
        }
    }
}