public class Cell {
    private CellStatus cellStatus;

    public Cell(CellStatus cellStatus) {
        this.cellStatus = cellStatus;
    }

    public CellStatus getCellStatus() {
        return cellStatus;
    }
}
