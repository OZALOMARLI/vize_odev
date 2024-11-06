//OZAL OMARLI 2212101203

import java.util.Scanner;

public class ortalama_kullanici {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Algoritma ve Programlamaya Giriş ders notunuzu giriniz: ");
        double algo = scanner.nextDouble();

        System.out.println("Veri Yapıları ders notunuzu giriniz: ");
        double veri = scanner.nextDouble();

        System.out.println("Fizik notunuzu giriniz: ");
        int fizik = scanner.nextInt();

        double ortalama = algo+veri+fizik;
        System.out.println("Ortalamanız: "+ortalama/3 );

        if(ortalama >= 50){
            System.out.println("Başarılı Öğrencisiniz");
        }
        else if(ortalama < 50){
            System.out.println("Başarısız Öğrencisiniz");
        }
    }
}