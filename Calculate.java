import java.util.Scanner;
import java.util.ArrayList;

public class Calculator {

    interface IntInputValidator {
        int get(Scanner sc);
    }

    static String menu = "Calculator.java! \n" +
                         "[0] - ADDITION \n" +
                         "[1] - SUBTRACTION \n" +
                         "[2] - MULTIPLICATION \n" +
                         "[3] - DIVISION \n\n" +
                         "Enter Your Choice: ";

    static int verifyInput(Scanner sc) {
        while (true) {
            try {
                String stringInput = sc.nextLine().replaceAll("\\D", "");
                int choice = Integer.parseInt(stringInput);
                if (choice < 0 || choice > 3) {
                    System.err.println("Invalid Input: Enter an integer between 0 - 3");
                    continue;
                }
                return choice;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input.");
            }
        }
    }

    static float Calculate(int choice, Scanner sc) {

        IntInputValidator getcount = (Scanner s) -> {
            while (true) {
                System.out.println("How many numbers do you want to calculate?");
                String stringcount = s.nextLine().replaceAll("\\D", "");
                try {
                    if (stringcount.isEmpty()) continue;
                    int num_count = Integer.parseInt(stringcount);
                    return num_count;
                } catch (NumberFormatException e) {
                    System.err.println("Invalid Input: Number Format Exception");
                }
            }
        };

        int count = getcount.get(sc);
        ArrayList<Float> numbers = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            System.out.print("Enter number #" + (i + 1) + ": ");
            try {
                float num = Float.parseFloat(sc.nextLine().replaceAll("[^\\d.-]", ""));
                numbers.add(num);
            } catch (NumberFormatException e) {
                System.err.println("Invalid number, try again.");
                i--; // retry this index
            }
        }

        float result = numbers.get(0);
        switch (choice) {
            case 0:
                for (int i = 1; i < numbers.size(); i++) result += numbers.get(i);
                break;
            case 1:
                for (int i = 1; i < numbers.size(); i++) result -= numbers.get(i);
                break;
            case 2:
                for (int i = 1; i < numbers.size(); i++) result *= numbers.get(i);
                break;
            case 3:
                for (int i = 1; i < numbers.size(); i++) {
                    if (numbers.get(i) == 0) {
                        System.err.println("Cannot divide by zero. Skipping.");
                        continue;
                    }
                    result /= numbers.get(i);
                }
                break;
        }

        System.out.println("Result: " + result);
        return result;
    }

    static void MenuLoop(Scanner sc) {
        while (true) {
            System.out.print(menu);
            int choice = verifyInput(sc);
            Calculate(choice, sc);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MenuLoop(sc);
    }
}
