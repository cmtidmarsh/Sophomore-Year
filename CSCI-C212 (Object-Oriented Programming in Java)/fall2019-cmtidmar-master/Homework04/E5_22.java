package homework_04;

import java.util.Scanner;

public class E5_22 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
       
        System.out.print("Enter a number: ");
        double num1 = user.nextDouble();
        
        System.out.print("Enter another number: ");
        double num2 = user.nextDouble();

        if (Math.abs(num1 - num2) < 0.01) {
            System.out.println("They are the same number");
        }
        else {
            System.out.println("They are different numbers");
        }
    }

}
