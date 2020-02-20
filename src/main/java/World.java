public class World {
    final int gridSize;
    Cell[][] grid;

    public World(int gridSize) {
        if (gridSize < 3) {
            throw new IllegalArgumentException("Grid size cannot be less than 3");
        }
        this.gridSize = gridSize;
        this.grid = new Cell[gridSize][gridSize];
        populateGridWithDeadCells();
    }

    Cell getCell(int row, int column) {
        return this.grid[row][column];
    }

    void setCell(int row, int column, CellStatus cellStatus) {
        this.grid[row][column] = new Cell(cellStatus);
    }

    private void populateGridWithDeadCells() {
        for (int i = 0; i < gridSize; i++) {
            for (int j = 0; j < gridSize; j++) {
                this.grid[i][j] = new Cell(CellStatus.DEAD);
            }
        }
    }

    public void printGrid() {
        for (int i = 0; i < gridSize; i++) {
            StringBuilder line = new StringBuilder();
            for (int j = 0; j < gridSize; j++) {
                line.append(grid[i][j].getCellStatus().status).append("   ");
            }
            System.out.println(line);
        }
    }
}
