package Praktikum02;
public class DragonMain {
    public static void main(String[] args) {
        Dragon dragon1 = new Dragon();
        Dragon dragon2 = new Dragon();

        // Mengubah arah dan posisi dragon
        dragon1.changeDirection(2);
        dragon1.move(3);

        dragon2.changeDirection(3);
        dragon2.move(2);

        // Mencetak status dragon
        System.out.println("Status Dragon 1:");
        dragon1.printStatus();

        System.out.println("Status Dragon 2:");
        dragon2.printStatus();
    }
}
