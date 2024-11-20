package practice.day06;

import java.util.Scanner;

public class P01_whileLoop {
    public static void main(String[] args) {

        /*
        Kullanicidan bolunen ve bolen seklinde 2 sayi alalim ve bolme operatoru
        kullanmadan bolme islemini gerceklestriip bolumu hesaplayan method create
        ediniz
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bolunecek sayiyi giriniz.");
        int bolunen = scanner.nextInt();
        System.out.println("Lutfen bolecek sayiyi giriniz.");
        int bolen = scanner.nextInt();



        bolmeIslemi(bolunen,bolen);



    }
    private static void bolmeIslemi(int bolunen, int bolen){

        int sayac=0;
        int ilkBolunen= bolunen;
        while (bolunen >= bolen) {
            bolunen=bolunen-bolen;
            sayac++;
        }
        System.out.println(ilkBolunen+ " sayisinin " +bolen+ " sayisina bolumu "+sayac+ " kalan ise "+bolunen+" dir");
    }

}
