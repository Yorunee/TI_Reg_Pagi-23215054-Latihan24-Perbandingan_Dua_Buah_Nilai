package Pertemuan5;

import java.util.Scanner;

public class Latihan24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ulangi;
        
        do {
            System.out.println("=======Program Perbandingan Nilai=======");
            System.out.print("Masukkan nilai pertama : ");
            int nilaiPertama = input.nextInt();
            System.out.print("Masukkan nilai kedua : ");
            int nilaiKedua = input.nextInt();
            
            if (nilaiPertama > nilaiKedua) {
                System.out.println("Hasil : " + nilaiPertama + " Lebih besar dari " + nilaiKedua);
            } else if (nilaiPertama < nilaiKedua) {
                System.out.println("Hasil : " + nilaiPertama + " Lebih kecil dari " + nilaiKedua);
            } else {
                System.out.println("Hasil : " + nilaiPertama + " Sama dengan " + nilaiKedua);
            }
            
            System.out.print("Ulangi Aktivitas ? (Ya/Tidak) : ");
            ulangi = input.next();
        } while (ulangi.equalsIgnoreCase("Ya"));
        
        input.close();
    }
}




