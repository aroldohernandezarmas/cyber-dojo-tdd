import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class DoorTest {

    @Test
    public void checkToggle() {
        Door door = new Door(Door.State.CLOSED);
        door.toggleState();
        assertTrue(door.getState() == Door.State.OPEN);
        door.toggleState();
        assertTrue(door.getState() == Door.State.CLOSED);
    }
}
