import java.io.IOException;
import java.util.Random;

public class SnakeGame {
    //стени
    public static int widthWall = 25;
    public static int heightWall = 45;

    //глава
    public static int headX = 3;
    public static int headY = 2;

    //ябълка
    public static Random rand = new Random();
    public static int foodX = rand.nextInt(widthWall - 2) + 1;
    public static int foodY = rand.nextInt(heightWall - 2) + 1;


    public static boolean gameOver = false;

    public static int score = 0;

    public static int[] tailX = new int[100];
    public static int[] tailY = new int[100];
    public static int nTail = 0;


    public static void main(String[] args) {
        MyKeyListener key = new MyKeyListener();
        game();
    }

    public static void drawWall() {
        for (int i = 0; i < widthWall; i++) { //редове
            for (int j = 0; j < heightWall; j++) { //колони
                if (i == 0 || i == widthWall - 1 || j == 0 || j == heightWall - 1) { //стени
                    System.out.print("#");
                } else if (i == headX && j == headY) {  //главата на змията
                    System.out.print("S");
                } else if (i == foodX && j == foodY) {  //ябълка
                    System.out.print("F");
                } else {
                    boolean print = false;
                    for (int k = 0; k < nTail; k++) {
                        if (tailX[k] == i && tailY[k] == j) {
                            System.out.print("s");
                            print = true;
                        }
                    }
                    if (!print) {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
        System.out.println("Score: " + score);
    }

    public static void moveUp() {
        if (MyKeyListener.moveUp) {
            headX--;
        }
    }

    public static void moveDown() {
        if (MyKeyListener.moveDown) {
            headX++;
        }
    }

    public static void moveRight() {
        if (MyKeyListener.moveRight) {
            headY++;
        }
    }

    public static void moveLeft() {
        if (MyKeyListener.moveLeft) {
            headY--;
        }
    }

    public static void eatFood() {
        if (headX == foodX && headY == foodY) {
            foodX = rand.nextInt(widthWall - 2) + 1;
            foodY = rand.nextInt(heightWall - 2) + 1;
            nTail++;
            score += 10;
        }
    }

    public static void gameOver() {
        if (headX == 0 || headX == widthWall - 1 || headY == 0 || headY == heightWall - 1) {
            gameOver = true;
        }
        for (int i = 0; i < nTail; i++) {
            if (tailX[i] == headX && tailY[i] == headY) {
                gameOver = true;
            }
        }
    }

    public static void game() {
        while (!gameOver) {
            drawWall();
            sleep();
            rules();
            controls();
            clearScreen();
        }
    }

    public static void clearScreen() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void controls() {
        moveUp();
        moveDown();
        moveLeft();
        moveRight();
    }

    public static void sleep() {
        try {
            Thread.sleep(250);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void rules() {
        gameOver();
        eatFood();
        snakeIncrease();
    }

    public static void snakeIncrease() {
        for (int i = nTail; i > 0; i--) {
            tailX[i] = tailX[i - 1];
            tailY[i] = tailY[i - 1];
        }
        tailX[0] = headX;
        tailY[0] = headY;
    }
}