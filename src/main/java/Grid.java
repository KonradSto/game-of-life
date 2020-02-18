import java.util.Arrays;

public class Grid {
    private final int size;
    private Cell[][] grid;

    public Grid(int size) {
        if (size < 3){
            throw new IllegalArgumentException("Size cannot be less than 3");
        }
        this.size = size;
        this.grid = new Cell[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                grid[i][j] = new Cell(CellStatus.DEAD);
            }
        }
    }

    public void setAliveCell(int row, int column){
        Cell aliveCell = new Cell(CellStatus.ALIVE);
        grid[row][column] = aliveCell;
    }

    public void printGrid(){
        for (int i = 0; i < size; i++) {
            String line = "";
            for (int j = 0; j < size; j++) {
                Cell cell = grid[i][j];
                line += cell.getCellStatus().status + "  ";
            }
            System.out.println(line);
        }
    }

    @Override
    public String toString() {
        return "Grid{" +
                "size=" + size +
                ", grid=" + Arrays.toString(grid) +
                '}';
    }
}
