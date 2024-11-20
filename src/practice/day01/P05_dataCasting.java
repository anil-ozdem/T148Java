package practice.day01;

import java.util.Scanner;

public class P05_dataCasting {

    public static void main(String[] args) {

        /*
            Kullanicidan herhangi bir sayi alip bu sayiyi
            -128 ile +127 arasinda olan bir sayiya donusturun.

            */

        Scanner scan= new Scanner(System.in);
        System.out.print("Lütfen tam bir sayi giriniz...");
        int sayi= scan.nextInt();
        System.out.println((byte)sayi);



    }
}
