package Praktikum02;
public class Snake {
    int x;
    int y;

    public void moveLeft() {
        x--;
    }

    public void moveRight() {
        x++;
    }

    public void moveUp() {
        y++;
    }

    public void moveDown() {
        y--;
    }

    public void printPosition() {
        System.out.println("Posisi snake: (" + x + ", " + y + ")");
    }
}
