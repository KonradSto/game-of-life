public class GameOfLife {
    World world;

    public GameOfLife(World world) {
        this.world = world;
    }

    public void printWorld() {
        for (int i = 0; i < world.gridSize; i++) {
            StringBuilder line = new StringBuilder();
            for (int j = 0; j < world.gridSize; j++) {
                line.append(world.grid[i][j].getCellStatus().status).append("   ");
            }
            System.out.println(line);
        }
    }
}
