package w03_sorular;

import java.util.Scanner;

public class Q09_KrediKarti {
    public static void main(String[] args) {


    /*
    Q9 - * Kullanıcıdan aldığınız  Adı, Soyadı ve kredi kartı numaralarını aşağıdaki gibi özel forma dönüştürün
         * Kredi kartı numarasını kontrol edin, yoksa 16 haneden küçük olursa   "Geçersiz kredi kartı numarası" yazdırın.
         * input : John White 1234234534561478
           output: Ad : J*** Soyad :W**** kartNo:***********1478 (Adın baş harfleri ve soyadı büyük olmalıdır)
     */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen adinizi giriniz: ");
        String isim = scanner.nextLine();
        System.out.println("Lutfen soyadinizi giriniz: ");
        String soyIsim = scanner.nextLine();
        System.out.println("Lutfen kredi karti numaranizi giriniz: ");
        String kkNo = scanner.nextLine();

        isim = isim.substring(0, 1).toUpperCase() + isim.substring(1).replaceAll("\\w", "*");
        soyIsim = soyIsim.substring(0, 1).toUpperCase() + soyIsim.substring(1).replaceAll("\\w", "*");
        ;
        System.out.println("Adiniz: " + isim);
        System.out.println("Soyadiniz: " + soyIsim);

        if (kkNo.length() != 16) {
            System.out.println("Gecersiz kart numarasi");

        } else
            System.out.println("Kart numaraniz: "+kkNo.substring(0, 4).replaceAll("\\w", "*") + " " + kkNo.substring(4, 8).replaceAll("\\w", "*")
                    + " " + kkNo.substring(8, 12).replaceAll("\\w", "*") + " " + kkNo.substring(12, 16));


    }
}