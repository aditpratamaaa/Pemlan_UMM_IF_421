import java.util.Scanner;

public class Main{
    public static void main(String[] args ){
        Scanner input = new Scanner(System.in);
        System.out.println(">>>Data Mahasiswa<<<");

        System.out.println("Masukkan Nama Mahasiswa: ");
        String nama = input.nextLine();

        System.out.println("Masukkan Nilai Mahasiswa: ");
        int nilai = input.nextInt();

        System.out.println("Data Mahasiswa: ");
        System.out.println("Nama: " + nama);
        System.out.println("Nilai: " + nilai);
        System.out.println("Jurusan Mahasiswa: ");


    }
}