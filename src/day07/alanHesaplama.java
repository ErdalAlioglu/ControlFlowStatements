package day07;

import java.util.Scanner;

public class alanHesaplama {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen karenin kenar uzunlugunu giriniz:");
        int kenar=input.nextInt();
        System.out.println("Menü");
        System.out.println("-------------");
        System.out.println("1.Alan hesapla");
        System.out.println("2.Çevre Hesapla");
        System.out.print("Seçiminiz:");
        int secim=input.nextInt();
        switch (secim){
            case  1:
            int alan=kenar*kenar;
            System.out.println("Alan="+alan);
            break;
            case 2:
                int cevre=4*kenar;
                System.out.println("Çevre="+cevre);
                break;
            default:
                System.out.println("Yanlış seçim yaptınız.");
        }



    }
}
