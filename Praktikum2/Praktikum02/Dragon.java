package Praktikum02;

public class Dragon {
    int x;
    int y;
    int direction;

    public void changeDirection(int newDirection) {
        if (newDirection >= 1 && newDirection <= 4) {
            direction = newDirection;
        } else {
            System.out.println("Arah yang dimasukkan tidak valid.");
        }
    }

    public void move(int steps) {
        switch (direction) {
            case 1: // Atas
            
                y += steps;
                break;
            case 2: // Kanan
                x += steps;
                break;
            case 3: // Bawah
                y -= steps;
                break;
            case 4: // Kiri
                x -= steps;
                break;
        }
    }

    public void printStatus() {
        String arahString = "";
        switch (direction) {
            case 1:
                arahString = "atas";
                break;
            case 2:
                arahString = "kanan";
                break;
            case 3:
                arahString = "bawah";
                break;
            case 4:
                arahString = "kiri";
                break;
        }
        System.out.println("Posisi Dragon: (" + x + ", " + y + ")");
        System.out.println("Arah Dragon: " + direction + " (" + arahString + ")");
        System.out.println("==================");
    }
}
