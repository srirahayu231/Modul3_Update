import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Program Menghitung Nilai Akhir Mahasiswa ===");
        System.out.print("Masukkan Nama Mahasiswa : ");
        String nama = input.nextLine();

        System.out.print("Masukkan Nilai Tugas (0-100): ");
        double tugas = input.nextDouble();

        System.out.print("Masukkan Nilai UTS (0-100): ");
        double uts = input.nextDouble();

        System.out.print("Masukkan Nilai UAS (0-100): ");
        double uas = input.nextDouble();

        // Perhitungan nilai akhir dengan bobottt
        double nilaiAkhir = (0.3 * tugas) + (0.3 * uts) + (0.4 * uas);

        // Menentukan grade
        char grade;
        if (nilaiAkhir >= 85) {
            grade = 'A';
        } else if (nilaiAkhir >= 75) {
            grade = 'B';
        } else if (nilaiAkhir >= 65) {
            grade = 'C';
        } else if (nilaiAkhir >= 50) {
            grade = 'D';
        } else {
            grade = 'E';
        }

        // Menentukan keterangan lulus/tidak
        String keterangan = (nilaiAkhir >= 65) ? "Lulus" : "Tidak Lulus";

        // Menampilkan hasil
        System.out.println("\n=== Hasil Akhir ===");
        System.out.println("Nama        : " + nama);
        System.out.println("Nilai Akhir : " + nilaiAkhir);
        System.out.println("Grade       : " + grade);
        System.out.println("Keterangan  : " + keterangan);
    }
}
