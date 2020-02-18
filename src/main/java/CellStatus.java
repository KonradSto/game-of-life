public enum CellStatus {
    ALIVE("o"), DEAD("x");

    public final String status;

    private CellStatus(String status) {
        this.status = status;
    }
}
