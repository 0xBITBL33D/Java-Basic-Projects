import java.util.Scanner;



public class BasicCalc {
    
    static int add(int num1, int num2) {
        return num1 + num2;
    }

    static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    static float divide(int num1, int num2) {
        if(num2 == 0) {
            System.err.println("Division by Zero is not allowed");
            return -1;
        }
        float answer = (float)num1 /(float) num2;
        return answer;
    }

    static void calcLoop(Scanner sc){
        
        while(true) {
            System.out.print("Hello, Welcome to the Basic Calc\n");

            int num1 = Integer.MAX_VALUE;
            int num2 = Integer.MAX_VALUE;

            try{
                System.out.print("Enter first number: ");
                if(sc.hasNextInt()) {
                    num1 = sc.nextInt();
                }

                System.out.print("Enter second number: ");
                if(sc.hasNextInt()) {
                    num2 = sc.nextInt();
                } 
            }
            catch(NumberFormatException e){
                System.err.println("Invalid Input!");
                continue;
            }

            System.out.printf("%d + %d = %d\n", num1, num2, add(num1, num2));
            System.out.printf("%d - %d = %d\n", num1, num2, subtract(num1, num2));
            System.out.printf("%d * %d = %d\n", num1, num2, multiply(num1, num2));
            System.out.printf("%d / %d = %.2f\n", num1, num2, divide(num1, num2));

            System.out.print("Continue [Y/N]? ");
            sc.nextLine();
            String choice = sc.nextLine();
            if(!choice.equalsIgnoreCase("Y"))
                break;
            else
                continue;
            
            

        }
    }
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    calcLoop(sc);

    }
}
