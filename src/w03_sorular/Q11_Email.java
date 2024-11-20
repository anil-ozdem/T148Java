package w03_sorular;

import java.util.Scanner;

public class Q11_Email {

    public static void main(String[] args) {

        /*
        Q11 -      Kullanicidan email girmesini isteyin
       @ isareti icermiyorsa "gecerli bir email girin" yazdirin
       @ isaretinden sonra sadece "gmail.com" yaziyorsa "email onaylandi" yazdirin
       @ isaretinden sonra "gmail.com" disinda birsey yaziyorsa "Lutfen gmail hesabinizi girin" yazdirin
       ORNEK:
       INPUT : techproed.com OUTPUT : "gecerli bir email girin "
       INPUT : techproed@gmail.com OUTPUT :  "email onaylandi "
       INPUT : techproed@hotmail.com OUTPUT : "Lutfen gmail hesabinizi girin"
         */
        Scanner scanner= new Scanner(System.in);
        System.out.println("Lutfen email adresinizi giriniz: ");
        String email = scanner.nextLine();

        if (!email.contains("@")){
            System.out.println("Lutfen gecerli bir email adresi girin.");
        } else if (email.substring(email.indexOf("@")+1).equals("gmail.com")){
            System.out.println("Gecerli email adresi girdiniz.");


        } else System.out.println("Gecersiz bir mail adresi girdiniz.");



    }
}
