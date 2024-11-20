package practice.day01;

import java.util.Scanner;

public class P02_dataCasting {

    public static void main(String[] args) {
/*

    SORU: Kullanıcıdan bir harf alın ve o harften sonra gelen 3 harfi sırasıyla yazdırın
 */
        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen bir harf yaziniz: ");
        char harf = scan.next().charAt(0);

        System.out.println("Girdiğiniz " + harf + " harfinden sonra gelen 3 harf:" +
                (char) (harf + 1) + "," + (char) (harf + 2) + "," + (char) (harf + 3));
        /*
        char degeri olarak girilen harfe karsilik gelen bir decimal değer vardir.
        sonra ki 3 harf ise 1'er arttirarak bulunur. Fakat harf olarak cikti almak istersek
        char icin casting yapilmalidir.
         */


    }
}
