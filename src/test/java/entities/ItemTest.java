package entities;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ItemTest {
    private final static String NAME = "dummy name";

    @Test
    public void shouldReturnName() {
        final Item item = new Item(NAME);

        final String resultName = item.name();

        assertThat(resultName).isEqualTo(NAME);
    }
}
