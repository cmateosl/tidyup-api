package usecases;

import entities.Box;
import org.junit.jupiter.api.Test;
import usecases.ports.BoxOutputPort;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

public class BoxUseCasesTest {
    private final static String IDENTIFIER = "dummyId02";

    @Test
    public void shouldSaveNewBoxWithData() {
        final BoxOutputPort mock = mock(BoxOutputPort.class);
        when(mock.createBox()).thenReturn(IDENTIFIER);

        final BoxUseCases boxUseCases = new BoxUseCases(mock);

        final Box box = boxUseCases.registerBox();

        assertThat(box.identifier()).isEqualTo(IDENTIFIER);
        verify(mock).createBox();
    }
}
