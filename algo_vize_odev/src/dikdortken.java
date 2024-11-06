// OZAL OMARLI 2212101203

import java.util.Scanner;

public class dikdortken {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen kısa kenarı giriniz: ");
        double kısa = scanner.nextDouble();
        System.out.println("Lütfen uzun kenarı giriniz: ");
        double uzun = scanner.nextDouble();

        double alan = uzun * kısa;
        System.out.println("Dikdörtgenin Alanı=" + alan);

        double cevre = 2 * (kısa + uzun);
        System.out.println("Dikdörtgenin Çevresi=" + cevre);

    }
}