public class App {
    public static void main(String[] args) {
        Grid grid = new Grid(8);
        grid.setAliveCell(2,3);
        grid.setAliveCell(3,3);
        grid.setAliveCell(4,3);
        grid.setAliveCell(4,4);
        grid.printGrid();
    }


}
