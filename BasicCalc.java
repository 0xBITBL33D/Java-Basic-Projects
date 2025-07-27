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
            System.err.println("Division by Zero is now allowed");
            return 0;
        }
        return answer;
    }



    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    }
}
