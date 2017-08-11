import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class DoorsVisitorTest {

    private static final int AMOUNT_OF_DOORS = 100;

    @Test
    public void checkThatAfterVisitingTheDoorsAllTheTimesTheStateIsCorrect() {
        Door[] doors = new Door[AMOUNT_OF_DOORS];

        Random rnd = new Random();

        for (int i = 0; i < doors.length; i++) {
            doors[i] = new Door(rnd.nextBoolean() ? Door.State.OPEN : Door.State.CLOSED);
        }

        DoorVisitor visitor = new DoorVisitor();

        Door[] doorsAtFinalState = visitor.visit(doors);

        assertTrue(doors.length == doorsAtFinalState.length);

        for (int i = 0; i < doorsAtFinalState.length; i++) {
            Door door = new Door(doors[i].getState());
            for (int j = 1; j <= doorsAtFinalState.length; j++) {
                if ((i + 1) % j == 0) {
                    door.toggleState();
                }
            }
            assertTrue(doorsAtFinalState[i].getState() == door.getState());
        }

    }
}
