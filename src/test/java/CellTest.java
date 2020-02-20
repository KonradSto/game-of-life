import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CellTest {

    @Test
    public void shouldReturnCorrectNumberOfAliveNeighbours() {
        // Given
        World world = new World(4);
        world.setCell(2, 2, CellStatus.ALIVE);
        world.setCell(2, 3, CellStatus.ALIVE);
        world.setCell(3, 3, CellStatus.ALIVE);
        world.setCell(0, 0, CellStatus.ALIVE);

        // Then
        assertEquals(2, Cell.countAliveNeighbours(2,2, world));
    }
}
