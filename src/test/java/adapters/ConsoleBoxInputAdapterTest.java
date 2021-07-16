package adapters;

import entities.Box;
import org.junit.jupiter.api.Test;
import usecases.ports.BoxInputPort;
import usecases.ports.BoxOutputPort;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ConsoleBoxInputAdapterTest {
    private final static String IDENTIFIER = "dummy";
    private final static Box BOX = new Box(IDENTIFIER);

    @Test
    void shouldCreateBoxAndReturnIdentifier() {
        final BoxInputPort boxInputPort = mock(BoxInputPort.class);

        when(boxInputPort.registerBox()).thenReturn(BOX);
        final ConsoleBoxInputAdapter consoleBoxInputAdapter = new ConsoleBoxInputAdapter(boxInputPort);

        final String result = consoleBoxInputAdapter.createBox();

        assertThat(result).isEqualTo(IDENTIFIER);
        verify(boxInputPort, times(1)).registerBox();
    }
}