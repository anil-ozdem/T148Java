package day24_stringBuilder_accessModifier;

public class P03_sBuilderKarsilastirma {

    public static void main(String[] args) {

        String str1 = "Murat";
        String str2 = "Murat";

        System.out.println(str1 == str2); // true
        System.out.println(str1.equals(str2)); // true


        StringBuilder sb1 = new StringBuilder("Murat");
        StringBuilder sb2 = new StringBuilder("Murat");

        // Aynı metne (icerige) sahip str1, sb1, sb2'yi karsilastiralim
        System.out.println("----------------------------");

        System.out.println(sb1 == sb2);
        // Java Compile ederken de run ederkende sorun cikarmaz ama hep false der buna
        System.out.println(sb1.equals(sb2));

        // equals'in tek true verecegi hal budur
        System.out.println(sb1.equals(sb1));

        // String Builder'larin metinse esitligi compare() methodu ile karsilastirilir
        // karsilastirma sonucu 0 ise 2 SB birbirinin aynidir.
        // ikisinin compare() edilmesi sonucu 0 degil ise bu bize ikisinin esit olmadigini gösterir

        System.out.println(sb1.compareTo(sb2));

        StringBuilder sb3 = new StringBuilder("Java");
        StringBuilder sb4 = new StringBuilder("java");
        StringBuilder sb5 = new StringBuilder("Tava");
        StringBuilder sb6 = new StringBuilder("Tele");
        StringBuilder sb7 = new StringBuilder("temu");


        System.out.println(sb3.compareTo(sb4));


    }
}
