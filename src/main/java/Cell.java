public class Cell {
    private CellStatus cellStatus;

    public Cell(CellStatus cellStatus) {
        this.cellStatus = cellStatus;
    }

    public CellStatus getCellStatus() {
        return cellStatus;
    }

    public void setNextStatus(int row, int column, World world) {
        if (cellStatus == CellStatus.ALIVE && determineNextCellState(row, column, world) == CellStatus.DEAD) {
            cellStatus = CellStatus.DEAD;
        }
        if (cellStatus == CellStatus.DEAD && determineNextCellState(row, column, world) == CellStatus.ALIVE) {
            cellStatus = CellStatus.ALIVE;
        }
    }

    static int countAliveNeighbours(int row, int column, World world) {
        int count = 0;
        count += addAliveCell(row + 1, column, world);
        count += addAliveCell(row, column -1, world);
        count += addAliveCell(row, column +1, world);
        count += addAliveCell(row - 1, column, world);
        count += addAliveCell(row - 1, column - 1, world);
        count += addAliveCell(row + 1, column + 1, world);
        count += addAliveCell(row - 1, column - 1, world);
        count += addAliveCell(row - 1, column + 1, world);
        return count;
    }

    private static int addAliveCell(int row, int column, World world) {
        if (world.getCell(row, column).getCellStatus() == CellStatus.ALIVE) {
            return 1;
        } else {
            return 0;
        }
    }

    private CellStatus determineNextCellState(int row, int column, World world) {
        int numberOfAliveNeighbours = Cell.countAliveNeighbours(row, column, world);
        if (world.getCell(row, column).getCellStatus() == CellStatus.ALIVE) {
            if (numberOfAliveNeighbours < 2) {
                return CellStatus.DEAD;
            } else if (numberOfAliveNeighbours == 2 || numberOfAliveNeighbours == 3) {
                return CellStatus.ALIVE;
            } else {
                return CellStatus.DEAD;
            }
        } else {
            if (numberOfAliveNeighbours == 3) {
                return CellStatus.ALIVE;
            }
        }
        return CellStatus.DEAD;
    }
}
