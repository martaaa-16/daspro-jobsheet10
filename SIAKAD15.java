import java.util.Scanner;

public class SIAKAD15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMhs = sc.nextInt();
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMatkul = sc.nextInt();
        int [][] nilai = new int[jumlahMhs][jumlahMatkul];

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i + 1));
            double totalPerSiswa = 0;
            
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah " + (j + 1) + ": ");
                nilai [i][j] = sc.nextInt();
                totalPerSiswa += nilai [i][j];
            }
        
            System.out.println("Nilai rata-rata: " + totalPerSiswa/jumlahMatkul);
        }
        System.out.println("\n===================================");
        System.out.println("Rata-rata Nilai Setiap Mata Kuliah: ");
        
        for (int j = 0; j < jumlahMatkul; j++) {
            double totalPerMatkul = 0;

            for (int i = 0; i < jumlahMhs; i++) {
                totalPerMatkul += nilai [i][j];
            }

            System.out.println("Mata Kuliah " + (j + 1) + ": " + totalPerMatkul / jumlahMhs);
        }
    }
}