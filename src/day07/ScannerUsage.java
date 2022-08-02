package day07;

import java.util.Scanner;

public class ScannerUsage {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("lütfen isminizi giriniz: ");
        String İsim=input.nextLine();
        System.out.println("Merhaba"+İsim);
    }
}
