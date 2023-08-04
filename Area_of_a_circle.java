import java.util.Scanner;
 public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        double pi=3.14,b;
        a = sc.nextInt();
        b=pi*a*a;

        System.out.printf("%.2f",b);
    }
    
}