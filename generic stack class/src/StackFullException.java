/**
 * Exception thrown when attempting to push an element
 * onto a stack that has already reached its maximum capacity.
 * @author Jakob Dotti
 * @version 23.02.2026
 */
public class StackFullException extends Exception {

    /**
     * Constructs a new StackFullException with a specific error message.
     *
     * @param message description of the error
     */
    public StackFullException(String message) {
        super(message);
    }
}