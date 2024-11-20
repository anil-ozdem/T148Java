package practice.day01;

import java.util.Scanner;

public class P04_Scanner {

    public static void main(String[] args) {
         /*
    INTERVIEW SORUSU: SWAP SORUSU:
    Kullanıcıdan iki sayı alıp üçüncü bir değişken kullanmadan
    ikisinin değerlerini birbirinin yerine değiştiriniz

  */


            Scanner scan=new Scanner(System.in);

            System.out.println("İki adet tam sayı giriniz");
            System.out.print ("1.Tam Sayı: ");
            int sayi1=scan.nextInt();

            System.out.println("2.Tam Sayı: ");
            int sayi2=scan.nextInt();

            System.out.println("1.Girilen Tam Sayı: "+sayi1+"\n2.Girilen Sayı: "+sayi2);
            System.out.println("--------- HOKUS POKUSSSS ----------");

            sayi1=sayi1+sayi2;
            sayi2=sayi1-sayi2;
            sayi1=sayi1-sayi2;

            System.out.println("1.Tam Sayı: "+sayi1+"\n2.Tam Sayı: "+sayi2);
    }
}
