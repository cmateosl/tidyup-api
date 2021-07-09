package entities;

/**
 * Entity that represents anything that a user will store in a box.
 */
public class Item {
    private final String name;

    public Item(final String name) {
        this.name = name;
    }

    /**
     * Obtain the name of the item.
     *
     * @return String
     */
    public String name() {
        return name;
    }
}
