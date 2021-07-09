package usecases.ports;

import entities.Box;

public interface BoxInputPort {
    /**
     * Register a box inside the system.
     *
     * @return Box Registered box.
     */
    Box registerBox();
}
