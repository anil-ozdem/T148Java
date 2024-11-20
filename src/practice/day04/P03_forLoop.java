package practice.day04;

import java.util.Scanner;

public class P03_forLoop {

    public static void main(String[] args) {

        // Kullanıcıdan 5 adet sayı isteyiniz
        // Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.
        // bu soruyu continue kullanarak çözünüz.


        Scanner scanner = new Scanner(System.in);
        int toplam=0;

        for (int i = 1; i <=5 ; i++) {

            System.out.println("Lutfen 5 adet sayi giriniz...");
            int sayi= scanner.nextInt();

            if (sayi>=5 && sayi<=10){
                continue;
            }
            toplam+=sayi;
            
        }
        System.out.println("Toplam= "+toplam);












    }
}
