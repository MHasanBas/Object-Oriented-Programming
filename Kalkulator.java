import java.util.Scanner;

public class Kalkulator {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan angka pertama: ");
        double angka1 = scanner.nextDouble();
        
        System.out.print("Masukkan operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        
        System.out.print("Masukkan angka kedua: ");
        double angka2 = scanner.nextDouble();
        
        double hasil = 0;
        switch(operator) {
            case '+':
                hasil = tambah(angka1, angka2);
                break;
            case '-':
                hasil = kurang(angka1, angka2);
                break;
            case '*':
                hasil = kali(angka1, angka2);
                break;
            case '/':
                if (angka2 != 0) {
                    hasil = bagi(angka1, angka2);
                } else {
                    System.out.println("Pembagian dengan nol tidak dapat dilakukan.");
                    return;
                }
                break;
            default:
                System.out.println("Operator yang dimasukkan tidak valid.");
                return;
        }
        
        System.out.println("Hasil: " + hasil);
        
        scanner.close();
    }
    
    public static double tambah(double angka1, double angka2) {
        return angka1 + angka2;
    }
    
    public static double kurang(double angka1, double angka2) {
        return angka1 - angka2;
    }
    
    public static double kali(double angka1, double angka2) {
        return angka1 * angka2;
    }
    
    public static double bagi(double angka1, double angka2) {
        return angka1 / angka2;
    }
}
