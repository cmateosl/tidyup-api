package adapters;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MemoryBoxOutputAdapterTest {
    private final static MemoryBoxOutputAdapter memoryBoxOutputAdapter = new MemoryBoxOutputAdapter();

    @Test
    void shouldGenerateAlwaysNotBlankIdentifiers() {
        final String identifier = memoryBoxOutputAdapter.createBox();

        assertThat(identifier).isNotBlank();
    }

    @Test
    void shouldGenerateDistinctIdentifiers() {
        final String firstIdentifier = memoryBoxOutputAdapter.createBox();
        final String secondIdentifier = memoryBoxOutputAdapter.createBox();

        assertThat(firstIdentifier).isNotEqualTo(secondIdentifier);
    }
}