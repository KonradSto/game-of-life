import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import static org.junit.Assert.assertEquals;

public class WorldTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void shouldThrowExceptionForGridSizeLessThan3() {
        thrown.expect(IllegalArgumentException.class);
        new World(2);
    }

    @Test
    public void shouldReturnOnlyDeadCellsUponCreation() {
        // Given
        int gridSize = 3;
        World world = new World(gridSize);

        // Then
        for (int i = 0; i < gridSize; i++) {
            for (int j = 0; j < gridSize; j++) {
                assertEquals(CellStatus.DEAD, world.getCell(i, j).getCellStatus());
            }
        }
    }

    @Test
    public void shouldSetCellToAlive() {
        // Given
        World world = new World(8);

        // When
        world.setCell(3, 4, CellStatus.ALIVE);

        // Then
        assertEquals(CellStatus.ALIVE, world.getCell(3,4).getCellStatus());
    }
}
