import adapters.ConsoleBoxInputAdapter;
import adapters.MemoryBoxOutputAdapter;
import usecases.BoxUseCases;

class Application {
    public static void main(String[] args) {
        final MemoryBoxOutputAdapter memoryBoxOutputAdapter = new MemoryBoxOutputAdapter();
        final BoxUseCases boxUseCases = new BoxUseCases(memoryBoxOutputAdapter);
        final ConsoleBoxInputAdapter consoleBoxInputAdapter = new ConsoleBoxInputAdapter(boxUseCases);
    }
}
