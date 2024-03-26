class Segitiga {
    double alas;
    double tinggi;
    double sisi;

    // Constructor
    public Segitiga(double alas, double tinggi, double sisi) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi = sisi;
    }

    // Method untuk menghitung luas segitiga
    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    // Method untuk menghitung keliling segitiga
    public double hitungKeliling() {
        return alas + tinggi + sisi;
    }
}

public class Main {
    public static void main(String[] args) {
        // Membuat objek segitiga ke-1
        Segitiga segitiga1 = new Segitiga(1, 1, 1);
        
        // Menghitung luas dan keliling segitiga ke-1
        double luas1 = segitiga1.hitungLuas();
        double keliling1 = segitiga1.hitungKeliling();
        
        // Menampilkan hasil segitiga ke-1
        System.out.println("Segitiga 1:");
        System.out.println("Luas: " + luas1);
        System.out.println("Keliling: " + keliling1);
        
        // Membuat objek segitiga ke-2
        Segitiga segitiga2 = new Segitiga(30, 10, 90);
        
        // Menghitung luas dan keliling segitiga ke-2
        double luas2 = segitiga2.hitungLuas();
        double keliling2 = segitiga2.hitungKeliling();
        
        // Menampilkan hasil segitiga ke-2
        System.out.println("\nSegitiga 2:");
        System.out.println("Luas: " + luas2);
        System.out.println("Keliling: " + keliling2);
        
         Segitiga segitiga3 = new Segitiga(20, 30, 60);
        
        // Menghitung luas dan keliling segitiga ke-2
        double luas3 = segitiga3.hitungLuas();
        double keliling3 = segitiga3.hitungKeliling();
        
        // Menampilkan hasil segitiga ke-3
        System.out.println("\nSegitiga 3:");
        System.out.println("Luas: " + luas3);
        System.out.println("Keliling: " + keliling3);
    }
}
