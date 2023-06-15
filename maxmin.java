//Enter two numbers and do the following arithmetic Operations find max and min

//a+b*c ii) c+a/b
//iii) a%b+c iV) a*b+c
import java.util.Scanner;

public class maxmin {
    public static void main(String[] args) {

                Scanner input = new Scanner(System.in);

                System.out.print("Enter the first number (a): ");
                int a = input.nextInt();

                System.out.print("Enter the second number (b): ");
                int b = input.nextInt();

                System.out.print("Enter the third number (c): ");
                int c = input.nextInt();

                int result1 = a + b * c;
                int result2 = c + a / b;
                int result3 = a % b + c;
                int result4 = a * b + c;

                int max = Math.max(Math.max(result1, result2), Math.max(result3, result4));
                int min = Math.min(Math.min(result1, result2), Math.min(result3, result4));

                System.out.println("Maximum value: " + max);
                System.out.println("Minimum value: " + min);
            }
        }


