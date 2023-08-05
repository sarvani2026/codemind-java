import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        float b;
        
       a = sc.nextInt();
        b=32+(a*1.8f);
        System.out.printf("%.2f",b);
       }
    
}