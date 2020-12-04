package UTS.PBO;

import java.util.Date;
import java.util.Scanner;

/*
 * @author
 * Nama              : Raihan Giffari
 * Kelas             : IF-1
 * NIM               : 10119008
 *
 */

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Date date = new Date();
        Age age = new Age(date.getYear());
        System.out.print("Masukkan Tahun Lahir Anda : ");
        age.setYearBirth(scan.nextInt());
        System.out.println("\n======Hasil Perhitungan Umur======");
        System.out.println("Tahun lahir anda : " + age.getYearBirth());
        System.out.println("Hari ini tahun : " + age.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah "+age.hitungUmur()+" tahun");
        System.out.println("Tandanya Kamu "+age.tandanyaKamu(age.hitungUmur()));
    }
}