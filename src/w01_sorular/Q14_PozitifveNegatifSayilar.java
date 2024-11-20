package w01_sorular;

import java.util.Scanner;

public class Q14_PozitifveNegatifSayilar {

    public static void main(String[] args) {

        /*
        Q14 -//Kullanicidan bir sayi aliniz
        //Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
        //10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
        //Sayi o dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.
         */
        Scanner scanner = new Scanner(System.in);
        int sayi = scanner.nextInt();

        if (sayi >= 0 && sayi <10){
            System.out.println("Girdiginiz sayi bir rakamdir.");
        } else if (sayi >= 10){
            System.out.println("Girdiginiz sayi pozitif bir sayidir.");
        } else System.out.println("Girdiginiz sayi negatif bir sayidir.");


    }
}
