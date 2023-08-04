import java.util.Scanner;
 public class input {
    public static void main(String[] args) {
        // creating an object of Scanner class
        Scanner sc = new Scanner(System.in);
        int number1;
        float number3;
        number1 = sc.nextInt();
        number3 = (float)number1 *2.54f;
        //sum of 10 and 20 is 30
        System.out.printf("%.2f",number3);
    }
    
}