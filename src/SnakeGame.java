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


    public static void main(String[] args) throws IOException, InterruptedException {
        drawWall();
        eatFood();
    }


    public static void drawWall() {
        for (int i = 0; i < widthWall; i++) { //редове
            for (int j = 0; j < heightWall; j++) { //колони
                if (i == 0 || i == widthWall - 1 || j == 0 || j == heightWall - 1) { //стени
                    System.out.print("€");
                } else if (i == headX && j == headY) {  //главата на змията
                    System.out.print("f");
                } else if (i == foodX && j == foodY) {  //ябълка
                    System.out.print("♥");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void moveUp() {
        boolean up = true;
        if (up) {
            headY++;
        }
    }

    public static void moveDown() {
        boolean down = true;
        if (down) {
            headY--;
        }
    }

    public static void moveRight() {
        boolean right = true;
        if (right) {
            headX++;
        }
    }

    public static void moveLeft() {
        boolean left = true;
        if (left) {
            headX--;
        }
    }

    public static void eatFood(){
        if(headX == foodX && headY == foodY){
            foodX = rand.nextInt((9) + 1) % widthWall;
            foodY = rand.nextInt((9) + 1) % heightWall;
        }
    }
}
