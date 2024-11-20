package w03_sorular;

import java.util.Scanner;

public class Q06_Ternary {

    public static void main(String[] args) {

        /*
        Q6 -  * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
         * Test data: ali eme all
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir isim giriniz: ");
        String isim = scanner.nextLine();

        String sonuc = (isim.length() == 3)
                ? (isim.charAt(0) != isim.charAt(1) &&
                isim.charAt(0) != isim.charAt(2) &&
                isim.charAt(1) != isim.charAt(2))
                ? "Isim unique harflerden oluşuyor"
                : "Isim unique değil"
                : "Isim 3 harfli olmalı";

        System.out.println(sonuc);





    }
}

