package Doroga.bazovaya_structura;

public class Task7_3 {
    public static void main(String[] args) {
     System.out.println(faktorial(1));
    }
    static int faktorial(int x) {
        if (x == 1) {
            return 1;
        }
        return x*faktorial(x-1);
    }
}
