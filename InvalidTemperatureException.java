
/**
 * InvalidTemperatureTypeException is an exception that gets thrown if
 * a user tried to create a Temperature object using an invalid temperature
 * type.
 * 
 * @author Jake Sweger
 * @version 1.0
 */
public class InvalidTemperatureException extends Exception {
    /**
     * Default constructor for InvalidTemperatureTypeException objects. It
     * creates an InvalidTemperatureTypeException with a null detail 
     * message.
     */
    public InvalidTemperatureException() {
        super();
    }

    /**
     * Constructor for InvalidTemperatureTypeException objects. It creates
     * an InvalidTemperatureTypeException object with the specified detail
     * message.
     */
    public InvalidTemperatureException(String message) {
        super(message);
    }
}
