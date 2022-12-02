package Doroga.bazovaya_structura;

import java.util.Scanner;

public class Task_2_2 {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        System.out.print(Math.pow(a,3)>Math.pow(b,2));
    }
}
