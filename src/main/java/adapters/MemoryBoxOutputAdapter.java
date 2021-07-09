package adapters;

import usecases.ports.BoxOutputPort;

public class MemoryBoxOutputAdapter implements BoxOutputPort {
    private Long sequence = 0L;

    @Override
    public String createBox() {
        sequence++;
        return sequence.toString();
    }
}
