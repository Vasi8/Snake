import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Random;

public class SnakeGame {
    //стени
    public static int widthWall = 10;
    public static int heightWall = 30;

    //глава
    public static int headX = 3;
    public static int headY = 2;

    //ябълка
    public static Random rand = new Random();
    public static int foodX = rand.nextInt((9) + 1) % widthWall;
    public static int foodY = rand.nextInt((9) + 1) % heightWall;


    public static boolean gameOver;
    private static KeyEvent key;

    public static void main(String[] args) throws IOException, InterruptedException {
    }

}