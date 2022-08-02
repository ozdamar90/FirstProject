package day07;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi=input.nextInt();
        System.out.println("Sayınız="+sayi);
        if (sayi%2==0){
            System.out.println("Sayınız çift sayıdır.");
        }else {
            System.out.println("Sayınız tek sayıdır.");

        }
    }
}
