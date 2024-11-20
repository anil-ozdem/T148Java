package miniMarketProject;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static miniMarketProject.P01_GirisEkrani.*;

public class P05_fisYazdir {

    public static void main(String[] args) {

    }
    public static void fisYazdir() {
        System.out.println("------------ Alisveris Fisi ------------");
        System.out.println("              Wise Market             ");
        System.out.println("               New York             ");
        System.out.println();
        System.out.println(sepet);
        System.out.println("Toplam Tutar: " + toplam + "₺");
        System.out.println("KDV %8: " + toplam * 0.08 + "₺");
        toplam += toplam * 0.08;
        System.out.println("Odenecek Tutar: " + toplam + "₺");
        System.out.print("Odenen Tutar: ");
        int odenen = scan.nextInt();
        if (odenen < toplam) {
            System.out.println("Odenen tutar yeterli degil." + (toplam - odenen) + " kadar daha odeme yapmalasiniz.");
            fisYazdir();
        } else {
            System.out.println("Para ustu: " + (odenen - toplam) + "₺");
        }
        System.out.println();
        System.out.println("Bizi tercih ettiginiz icin tesekkur ederiz ");
        LocalDateTime time = LocalDateTime.now();
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"); // format1 adında bir formatter
        String formattedTime = time.format(format1);
        System.out.println("Tarih: " + formattedTime);
        cikis();
    }
    public static void cikis() {
        System.out.print("  Cikis Yapiliyor...  ");
        scan.close();
        System.exit(0);
    }
}

