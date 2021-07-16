package adapters;

import entities.Box;
import usecases.ports.BoxInputPort;

public class ConsoleBoxInputAdapter {
    private final BoxInputPort boxInputPort;

    public ConsoleBoxInputAdapter(final BoxInputPort boxInputPort) {
        this.boxInputPort = boxInputPort;
    }

    public String createBox() {
        final Box box = this.boxInputPort.registerBox();
        return box.identifier();
    }
}
