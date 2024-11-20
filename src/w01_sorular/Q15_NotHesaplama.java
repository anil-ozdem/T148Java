package w01_sorular;

import java.util.Scanner;

public class Q15_NotHesaplama {

    public static void main(String[] args) {

        /*
        Q15 -   1.Kullanıcıya "Vize sınav sonucunuzu giriniz :"
        2.vize notu double değerinde girilecek.
        3. Kullanıcıya "Vize sınavı yüzdesini giriniz". ->> double olmalı ->> 0,40 etkiliyor   !!Yüzde kaç etkilediğini Sisteme siz giriyorsunuz.!!
        4.Kullanıcıya  "Final sınav sonucunuzu giriniz.
        5. final notu double değerinde olmalı. (örn: 65,5)
        6.Kullanıcıya  "Final sınavı yüzdesini giriniz"-->> double olmalı ->> 0,60 etkiliyor.
        7. Vize final ortalamasını bulmak için, vize nin yüzde40 ı, finalin yüzde60 ı alınmalı ve çıkan sonuçlar toplanmalıdır.
        8. Çıkan sonucu (dersin not ortalamasını) double toplam'a eşitleyebilirsiniz.

        eğer ortalaması 90(90 dahil)'dan büyük ise, harf notu olarak AA,
        80(80dahil) ile 90 arasında ise  BA,
        70(70 dahil) ile 80 arasında ise BB,
        60(60dahil) ile 70 arasında ise CB,
        50(50 dahil) ile 60 arasında ise CC,
        40(40 dahil) ile 50 arasında ise DC,
        30(30 dahil) ile 40 arasında ise DD,
        30 'dan düşük ise FF gelmeli.
         */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen vize notunuzu giriniz.");
        double vizeNotu = scanner.nextDouble();
        System.out.println("Lutfen vize sinavinin yüzdesini giriniz. orn:(0,40)");
        double vizeYuzdesi = scanner.nextDouble();
        System.out.println("Lutfen final notunuzu giriniz.");
        double finalNotu = scanner.nextDouble();
        System.out.println("Lutfen vize sinavinin yüzdesini giriniz. orn:(0,60)");
        double finalYuzdesi = scanner.nextDouble();
        double ortalama = (vizeNotu * vizeYuzdesi) + (finalNotu * finalYuzdesi);

        if (ortalama >= 90) {
            System.out.println("Not ortalamaniz: " + ortalama + " Harf notunuz: AA");
        } else if (ortalama >= 80 && ortalama < 90) {
            System.out.println("Not ortalamaniz: " + ortalama + " Harf notunuz: BA");
        } else if (ortalama >= 70 && ortalama < 80) {
            System.out.println("Not ortalamaniz: " + ortalama + " Harf notunuz: BB");
        } else if (ortalama >= 60 && ortalama < 70) {
            System.out.println("Not ortalamaniz: " + ortalama + " Harf notunuz: CB");
        } else if (ortalama >= 50 && ortalama < 60) {
            System.out.println("Not ortalamaniz: " + ortalama + " Harf notunuz: CC");
        } else if (ortalama >= 40 && ortalama < 50) {
            System.out.println("Not ortalamaniz: " + ortalama + " Harf notunuz: DC");
        } else if (ortalama >= 30 && ortalama < 40) {
            System.out.println("Not ortalamaniz: " + ortalama + " Harf notunuz: DD");
        } else System.out.println("Not ortalamaniz: " + ortalama + " Harf notunuz: FF");

    }
}
