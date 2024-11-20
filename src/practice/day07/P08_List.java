package practice.day07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P08_List {
    // Bir ogretmenden girmek istedigi kadar notu aliniz, ve
    // ortalamayi gecen ogrenci sayisini bulunuz

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Double> not = new ArrayList<>();
        System.out.println("Not girmek istiyor musunuz: ( E / H ): ");
        char devam= scanner.next().toUpperCase().charAt(0);

        while (devam=='E'){
            System.out.println("Notu Giriniz: "); // her not girdiginde List'e yeni eleman olarak notu ekleyecek
            not.add(scanner.nextDouble());
            System.out.println("Yeni not girecek misiniz: ( E / H ): ");
            devam= scanner.next().toUpperCase().charAt(0);


        }

        double toplam=0;
        for (int i = 0; i <not.size() ; i++) {

            toplam+=not.get(i);


        }
        double ortalama= toplam/not.size();

        System.out.println("Girilen notlarin ortalamasi: "+ ortalama);


        List<Double> ortGecen= new ArrayList<>();

        for (Double eleman:not){
            if (eleman>ortalama){
                ortGecen.add(eleman);
            }
        }

        System.out.println("Ortalamayi ustundeki ogrenci sayisi: "+ortGecen);
    }
}
