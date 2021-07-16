package usecases;

import entities.Box;
import usecases.ports.BoxOutputPort;
import usecases.ports.BoxInputPort;

public class BoxUseCases implements BoxInputPort {
    private final BoxOutputPort boxOutputPort;

    public BoxUseCases(final BoxOutputPort boxOutputPort) {
        this.boxOutputPort = boxOutputPort;
    }

    @Override
    public Box registerBox() {
        final String identifier = boxOutputPort.createBox();
        return new Box(identifier);
    }
}
