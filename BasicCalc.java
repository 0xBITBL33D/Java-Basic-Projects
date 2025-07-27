/*
 *     // 1. Say Hello
        // 2. Ask for first number
        // 3. Ask for second number

        // 4. Call methods for add/subtract/multiply/divide
        // 5. Print the results

        scanner.close();
    }

    // 6. Make static methods:
    //    add(int a, int b)
    //    subtract(int a, int b)
    //    multiply(int a, int b)
    //    divide(int a, int b)
}
 */

import java.util.Scanner;



public class BasicCalc {
    
    static int add(int num1, int num2) {
        int answer = num1 + num2;
        return answer;
    }

    static int subtract(int num1, int num2) {
        int answer = num1 - num2;
        return answer;
    }

    static int multiply(int num1, int num2) {
        int answer = num1 * num2;
        return answer;
    }

    static float divide(int num1, int num2) {
        float answer = num1 / num2;
        if(num1 == 0 || num2 == 0) {
            System.err.println("Division by Zero is not allowed");
            return 0;
        }
        return answer;
    }

    static void calcLoop(Scanner sc){
        
        while(true) {
            System.out.print("Hello, Welcome to the Basic Calc");

            int num1 = Integer.MAX_VALUE;
            int num2 = Integer.MAX_VALUE;

            try{
                System.out.println("Enter first number: ");
                if(sc.hasNextInt()) {
                    num1 = sc.nextInt();
                }

                System.out.println("Enter second number: ");
                if(sc.hasNextInt()) {
                    num2 = sc.nextInt();
                } 
            }
            catch(NumberFormatException e){
                System.err.println("Invalid Input!");
                continue;
            }

            System.out.printf("%d + %d = %d", num1, num2, add(num1, num2));
            System.out.printf("%d - %d = %d", num1, num2, subtract(num1, num2));
            System.out.printf("%d * %d = %d", num1, num2, multiply(num1, num2));
            System.out.printf("%d / %d = %d", num1, num2, divide(num1, num2));
            
            

        }
    }
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    }
}
