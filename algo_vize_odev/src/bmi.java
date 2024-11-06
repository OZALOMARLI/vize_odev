// OZAL OMARLI 2212101203

import java.util.Scanner;

public class bmi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen kilonuzu giriniz : ");
        double kilo = scanner.nextDouble();
        System.out.println("Lütfen boyunuzu giriniz : ");
        double boy = scanner.nextDouble();
        double bmi= kilo/(boy*boy);
        System.out.println("BMI'nız : "+bmi + "dır");
        if(bmi<18.5){
            System.out.println("Statusunuz: Zayıf");
        } else if (bmi>=18.5 && bmi<24.9) {
         System.out.println("Statusunuz: Normal");
        }
        else if (bmi>=24.9 && bmi<29.9) {
            System.out.println("Statusunuz: Kilolu");
        }
        else if ( bmi >=29.9 ) {
            System.out.println("Statusunuz : OBEZ");
        }
    }
    }
