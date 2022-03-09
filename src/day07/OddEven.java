package day07;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz :");
        int sayi= input.nextInt();
        if (sayi%2==0){
            System.out.println("sayi çifttir.");
        }
        else{
            System.out.println("sayi tektir.");
        }
    }
}
