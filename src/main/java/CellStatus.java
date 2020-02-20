public enum CellStatus {
    ALIVE("o"), DEAD("x");

    public final String status;

    CellStatus(String status) {
        this.status = status;
    }
}
