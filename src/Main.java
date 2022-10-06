public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        Maze maze = new Maze();

        maze.createMaze();
        System.out.println(maze.createMaze().toString());
    }

}
