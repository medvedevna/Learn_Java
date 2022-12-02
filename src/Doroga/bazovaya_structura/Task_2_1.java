package Doroga.bazovaya_structura;

import java.util.Scanner;

public class Task_2_1 {
    public static void main(String[] args) {
        double a;
        double b;
        Scanner scanner=new Scanner(System.in);
        a=scanner.nextDouble();
        b=scanner.nextDouble();
        System.out.println(a*b*(a+b)/Math.pow(a,2));
    }
}
