import java.util.Scanner;

class Mahasiswa {
    String nama;
    String nim;
    double nilai;

    void tampilkanData() {
        System.out.println("Nama  : " + nama);
        System.out.println("NIM   : " + nim);
        System.out.println("Nilai : " + nilai);
        cekKelulusan();
    }

    void cekKelulusan() {
        if (nilai >= 60) {
            System.out.println("Status: Lulus");
        } else {
            System.out.println("Status: Tidak Lulus");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Mahasiswa mhs1 = new Mahasiswa();
        Mahasiswa mhs2 = new Mahasiswa();
        Mahasiswa mhs3 = new Mahasiswa();

        Mahasiswa[] daftarMahasiswa = {mhs1, mhs2, mhs3};

        for (int i = 0; i < daftarMahasiswa.length; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i + 1));

            System.out.print("Nama: ");
            daftarMahasiswa[i].nama = input.nextLine();

            System.out.print("NIM: ");
            daftarMahasiswa[i].nim = input.nextLine();

            System.out.print("Nilai: ");
            daftarMahasiswa[i].nilai = input.nextDouble();
            input.nextLine();
        }

        System.out.println("\n=== DATA MAHASISWA ===");

        for (int i = 0; i < daftarMahasiswa.length; i++) {
            System.out.println("\nMahasiswa ke-" + (i + 1));
            daftarMahasiswa[i].tampilkanData();
        }

        input.close();
    }
}