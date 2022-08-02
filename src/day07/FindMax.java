package day07;

import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Birinci Sayıyı Giriniz: ");
        int sayi1=input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz: ");
        int sayi2=input.nextInt();
        if (sayi1>sayi2){
            System.out.println("Birinci sayı büyüktür: ");

        }else if(sayi2>sayi1){

            System.out.println("İkinci Sayı Büyüktür: ");
        }else{
            System.out.println("İki Sayı Eşittir: ");
        }

    }
}
