package w01_sorular;

import java.util.Scanner;

public class Q07_MesafeveSure {

    public static void main(String[] args) {

        /*
        Q07 -  Mesafeyi ve hızı alıp süreyi hesaplayan bir kod yazınız.
        Örneğin:İstanbul ile Ankara arası 400km olarak ölçülmektedir. Bu yolu ortalama
        120 km/saat hızla giden bir araç ne kadar sürede hedefe varır?

        Örnek Ekran Çıktısı
        Mesafeyi giriniz: 400
        Hızı giriniz: 100
        Süre 4 saattir.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen mesafeyi giriniz: ");
        double mesafe = scanner.nextDouble();
        System.out.println("Lutfen hizinizi giriniz: ");
        double hiz = scanner.nextDouble();
        double sure = 0;

        sure = mesafe /= hiz;

        System.out.println("Varis suresi: " + sure);


    }
}
