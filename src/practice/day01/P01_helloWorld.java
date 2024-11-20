package practice.day01;

public class P01_helloWorld {

    public static void main(String[] args) {

/*
  Aşağıdaki metni tek bir sout içerine yazacağınız kod ile
  aşağıdaki göründğü gibi konsolo yazdırınız.

  Hello World
      "Merhaba Dünya"

*/

        System.out.println("Hello World\n\t\"Merhaba Dünya\"");

        /*
        \n alt satıra geçme noktasını belirler
        \t bir TAB boşluk bırakır
        \ \ işaretinden sonra gelen işareti metin olarak algılar
        \ " yazarsak " metinsel olur
        \ ' yazarsak ' metinsel olur
         */


        System.out.println("Merhaba"); //println kısmında ki ln line kısatlmasıdır. kod çalışınca alt satıra geçer
        System.out.print("Nasılsın"); // ln olmadan sadece print dersek kod çalışır ve alt satıra geçmez bir sonra ki kod yanından devam eder
        System.out.println("Murat");

        double a = 23.25;
        System.out.println("a = " + a);

        System.err.println("Team 148 Hoşgeldiniz");


    }
}
