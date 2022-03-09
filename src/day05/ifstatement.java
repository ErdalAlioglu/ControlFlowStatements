package day05;

public class ifstatement {
    public static void main(String[] args) {
        int yas=28;
        //yetişkin olup olmama
        if (yas>18){
            System.out.println("Kişi yetişkindir.");
        }
        else {
            System.out.println("Kişi yetişkin değildir.");
        }
        //yaşi 70 den  büyük 18'den küçük olma

        if (yas<18 | yas>70){
            System.out.println("Sosyal yardım alabilir.");
        }
        else {
            System.out.println("Sosyal yardım alamaz.");

        }

        //time-memory complexity

        int x=65;  //decimal
        int y=0b01000001;//01000001
        int z=0x41;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

    }
}
