package day07;

import java.util.Scanner;

public class sayiKarsilastirma {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen 1.sayıyı giriniz:");
        int sayi1=input.nextInt();
        System.out.print("Lütfen 2.sayıyı giriniz:");
        int sayi2=input.nextInt();
        if (sayi1>sayi2){
            System.out.println("1.sayı büyüktür.");
        }
        else if(sayi1==sayi2){
            System.out.println("sayılar eşittir.");
        }
        else{
            System.out.println("2.sayı büyüktür.");
        }
    }
}
