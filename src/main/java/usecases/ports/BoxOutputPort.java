package usecases.ports;

public interface BoxOutputPort {
    /**
     * Create a new box and return the identifier.
     *
     * @return String New identifier.
     */
    String createBox();
}
