
---

## 📘 README – Program Menghitung Nilai Akhir Mahasiswa

### 🧩 Deskripsi Program

Program ini dibuat menggunakan **bahasa Java** untuk menghitung **nilai akhir mahasiswa** berdasarkan tiga komponen penilaian:

* **Tugas** (30%)
* **UTS** (30%)
* **UAS** (40%)

Selain menghitung nilai akhir, program juga:
✅ Menentukan **grade (A–E)**
✅ Menampilkan **predikat teks** (misalnya *Sangat Baik*, *Baik*, dll)
✅ Memberikan hasil akhir yang rapi dan mudah dibaca.

---

### ⚙️ Fitur Utama

1. **Input data mahasiswa** (nama dan nilai tugas, UTS, UAS).
2. **Perhitungan otomatis nilai akhir** berdasarkan bobot komponen.
3. **Penentuan grade huruf (A–E)** menggunakan percabangan `if–else`.
4. **Konversi grade ke predikat teks** menggunakan struktur `switch–case`.
5. **Output hasil akhir** yang berisi nama, nilai akhir, grade, dan predikat.

---

### 🧮 Rumus Perhitungan

```
Nilai Akhir = (0.3 × Nilai Tugas) + (0.3 × Nilai UTS) + (0.4 × Nilai UAS)
```

---

### 💻 Kode Program

```java
import java.util.Scanner;

public class NilaiMahasiswa {
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

        // Perhitungan nilai akhir
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

        // ✅ Fitur tambahan: predikat berdasarkan grade
        String predikat;
        switch (grade) {
            case 'A':
                predikat = "Sangat Baik";
                break;
            case 'B':
                predikat = "Baik";
                break;
            case 'C':
                predikat = "Cukup";
                break;
            case 'D':
                predikat = "Kurang";
                break;
            default:
                predikat = "Sangat Kurang";
        }

        System.out.println("\n=== Hasil Akhir ===");
        System.out.println("Nama        : " + nama);
        System.out.println("Nilai Akhir : " + nilaiAkhir);
        System.out.println("Grade       : " + grade);
        System.out.println("Predikat    : " + predikat);

        input.close();
    }
}
```

---

### 🧠 Penjelasan Alur Program

1. Program meminta **input** dari pengguna: nama, nilai tugas, nilai UTS, dan nilai UAS.
2. Menghitung **nilai akhir** berdasarkan bobot.
3. Menentukan **grade huruf (A–E)** menggunakan struktur `if–else`.
4. Menentukan **predikat teks** berdasarkan grade menggunakan `switch–case`.
5. Menampilkan hasil akhir di layar dengan format rapi.

---

### 📤 Contoh Input & Output

#### 🟩 Input:

```
Masukkan Nama Mahasiswa : Dikha Krisnanda
Masukkan Nilai Tugas (0-100): 80
Masukkan Nilai UTS (0-100): 75
Masukkan Nilai UAS (0-100): 90
```

#### 🟦 Output:

```
=== Hasil Akhir ===
Nama        : Dikha Krisnanda
Nilai Akhir : 82.50
Grade       : B
Predikat    : Baik
```

---

### 🧰 Tools & Versi

* **Bahasa**: Java
* **Compiler/IDE**: Visual Studio Code / IntelliJ IDEA / NetBeans
* **Versi Java**: direkomendasikan Java 17 atau lebih baru
* **Cara Kompilasi & Jalankan:**

  ```bash
  javac NilaiMahasiswa.java
  java NilaiMahasiswa
  ```

---

### 🧑‍💻 Pembuat

* **Nama:** Dikha Krisnanda Hafizd
* **Kelas:** G
* **Universitas:** Universitas Muhammadiyah Malang

---

