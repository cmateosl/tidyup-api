package entities;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BoxTest {
    private final static String IDENTIFIER = "afe13";

    @Test
    public void shouldReturnIdentifier() {
        final Box box = new Box(IDENTIFIER);

        final String resultIdentifier = box.identifier();

        assertThat(resultIdentifier).isEqualTo(IDENTIFIER);
    }
}
