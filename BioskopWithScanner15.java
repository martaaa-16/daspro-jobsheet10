import java.util.Scanner;
import java.util.Arrays;

public class BioskopWithScanner15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom;
        String nama, next;

        String [][] penonton = new String[4][2];
        int menu;

        while (true) {
            System.out.println("===== Menu Bioskop =====");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1-3): ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();
                    System.out.print("Masukkan baris (1-4): ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom (1-2): ");
                    kolom = sc.nextInt();
                    sc.nextLine();
                
                    if (baris > 0 && baris <= 4 && kolom > 0 && kolom <= 2) {
                        penonton[baris - 1][kolom - 1] = nama;
                        System.out.println("Data berhasil disimpan.");
                    } else {
                        System.out.println("Posisi baris atau kolom tidak tersedia.");
                    }
                    break;
                    
                case 2:
                System.out.println("=== Dafatar Penonton ===");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] != null) {
                            System.out.println("Baris " + (i + 1) + " Kolom " + (j + 1) + ": " + penonton[i][j]);
                        } else {
                            System.out.println("Baris " + (i + 1) + " Kolom " + (j + 1) + ": [Kosong]");
                        }
                    }
                }
                break;

                case 3:
                    System.out.println("Terima kasih telah menggunakan aplikasi ini.");
                    sc.close();
                    return;

                default:
                System.out.println("Menu tidak valid. Silahkan pilih menu antara 1-3.");    
                break;
            }
        }
    }
}
