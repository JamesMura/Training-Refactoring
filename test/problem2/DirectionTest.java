package problem2;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;


public class DirectionTest {

    @Test
    public void shouldFaceWestWhenTurningLeftFromNorth() {
        assertEquals(Direction.NORTH.turnLeft(), Direction.WEST);
    }

    @Test
    public void shouldFaceSouthWhenTurningLeftTwiceFromNorth() {
        assertEquals(Direction.NORTH.turnLeft().turnLeft(), Direction.SOUTH);
    }

    @Test
    public void shouldFaceEastWhenTurningRightFromNorth() {
        assertEquals(Direction.NORTH.turnRight(), Direction.EAST);
    }

    @Test
    public void shouldFaceSouthWhenTurningRightTwiceFromNorth() {
        assertEquals(Direction.NORTH.turnRight().turnRight(), Direction.SOUTH);
    }

}
