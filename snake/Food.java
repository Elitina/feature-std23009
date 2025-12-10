package snake.entity;

import java.util.Random;

public class Food {
    public static final int SCREEN_HEIGHT = 20;
    public static final int SCREEN_WIDTH = 40;
    private Position position;
    private final Random random;

    public Food() {
        this.random = new Random();
        generateNewPosition();
    }

    public void generateNewPosition() {
        int row = random.nextInt(SCREEN_HEIGHT - 2) + 1;
        int col = random.nextInt(SCREEN_WIDTH - 2) + 1;
        this.position = new Position(row, col);
    }

    public Position getPosition() {
        return position;
    }
}
