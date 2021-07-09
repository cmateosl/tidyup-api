package entities;

/**
 * Entity that represents a container of items.
 *
 * @see Item
 */
public final class Box {
    private final String identifier;

    public Box(final String identifier) {
        this.identifier = identifier;
    }

    /**
     * Obtain the unique key identifier of the box.
     *
     * @return String Identifier key.
     */
    public String identifier() {
        return this.identifier;
    }
}
