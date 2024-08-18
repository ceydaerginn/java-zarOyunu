import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        oyunaBasla();
    }

    private static void oyunaBasla() {
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("1- Oyuna Başla\n" + "2- Çıkış\n" + "Seçim Yapınız");
            int islem = sc.nextInt();
            switch (islem){
                case 1:
                    oyunOyna();
                    break;
                case 2:
                    System.out.println("Oyun Sonlanıyor....");
                    return;
                default:
                    System.out.println("Yanliş Değer!!");

            }
        }
    }

    private static void oyunOyna() {
        Random r = new Random();

        int userZar1 = r.nextInt(1,7);
        System.out.println("Kullanıcı 1. Zarı: " + userZar1);

        int userZar2 = r.nextInt(1,7);
        System.out.println("Kullanıcı 2. Zarı: " + userZar2);

        int pcZar1 = r.nextInt(1,7);
        System.out.println("PC 1. Zarı: " + pcZar1);

        int pcZar2 = r.nextInt(1,7);
        System.out.println("PC 2. Zarı: " + pcZar2);

        if ((userZar1+userZar2) > (pcZar1+pcZar2)){
            System.out.println("Kullanıcı Kazandı!");
        }
        else if ((userZar1+userZar2) < (pcZar1+pcZar2)){
            System.out.println("PC Kazandı!");
        }
        else {
            System.out.println("Berabere!");
        }
    }
}