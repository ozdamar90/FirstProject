package day05;

public class IfStatement {
    public static void main(String[] args) {

        int yas=15;

        //Yetişkin olup olmadığı,
        if (yas>=18){

            System.out.println("Kişi yetişkindir.");
        }
        else{ System.out.println("Yetişkin değildir.");

        }
        //Yşı 70'den büyük, 18'den küçük olma durumu,


       /* if (yas<18){
            System.out.println("Sosyal yardım alabilir.");
        }else if (yas>=70) {
            System.out.println("Sosyal yardım alabilir.");
        }
            else{
                System.out.println("Sosyala yardım alamaz.");*/
        if (yas<18|yas>=70){
            System.out.println("Sosyal yardım alabilir.");}
        else{
            System.out.println("Sosyal yardım alamaz.");

        }//time-memory compexity


        int x=65;
        int y=0b01000001; //binary karşılığı,
        int z=0x41; //hexal karşılığı,
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}




