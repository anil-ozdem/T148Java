package w03_sorular;

import java.util.Scanner;

public class HarfKontrol {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir harf giriniz: ");


        char harf = scan.next().charAt(0); // Tek bir karakter al

        kontrolEt(harf); // Metodu çağır
        scan.close();
    }

    public static void kontrolEt(char harf) {

        if (harf >= 'a' && harf <= 'z' || harf >= 'A' && harf <= 'Z') {
            if (harf == 'a' || harf == 'e' || harf == 'i' || harf == 'o' || harf == 'u' ||
                    harf == 'A' || harf == 'E' || harf == 'I' || harf == 'O' || harf == 'U') {
                System.out.println("sesli harfdir.");
            } else {
                System.out.println("sessiz harftir.");
            }
        } else {
            System.out.println("Yanlis karakter girdiniz! Lütfen yalnızca bir harf giriniz."); // Hata mesajı
        }
    }
}
