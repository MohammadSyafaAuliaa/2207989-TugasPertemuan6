import java.util.Scanner;

class InputSegitiga {
    double alas;
    double tinggi;
    double sisi;

    double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    double hitungKeliling() {
        return 3 * sisi;
    }
}

public class Segitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        InputSegitiga segitiga = new InputSegitiga();

        System.out.print("Masukkan alas segitiga: ");
        segitiga.alas = input.nextDouble();

        System.out.print("Masukkan tinggi segitiga: ");
        segitiga.tinggi = input.nextDouble();

        System.out.print("Masukkan panjang sisi segitiga: ");
        segitiga.sisi = input.nextDouble();

        System.out.println("\nLuas segitiga: " + segitiga.hitungLuas());
        System.out.println("Keliling segitiga: " + segitiga.hitungKeliling());

        input.close();
    }
}
