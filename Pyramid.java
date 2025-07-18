import java.util.Scanner;

public class Pyramid{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter Your String: ");
    String pyramid_string = sc.nextLine();
    sc.close();

    for(int line = 0; line <= pyramid_string.length() - 1; line++) {

        for(int leadingSpaces = 0; leadingSpaces <= pyramid_string.length() - line; leadingSpaces++) {
            System.out.print(" ");
        }

        for(int IndexPrint = 0; IndexPrint <= line; IndexPrint++) {
            char printchar = pyramid_string.charAt(IndexPrint);
            System.out.print(printchar + " ");
        }
    System.out.print("\n");
    }
  }
}
