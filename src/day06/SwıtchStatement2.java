package day06;

public class SwıtchStatement2 {
        public static void main(String[] args) {

            int k1 = 10;
            int k2 = 10;
            switch (k1 + k2) {
                case 20:
                    System.out.println("kargo için uygun degildir");
                    break;
                case 15:
                    System.out.println("kargo için uygundur");
                default:
                    System.out.println("girilen degerlerle hesaplama yapılamaz");

            }
        }
}
