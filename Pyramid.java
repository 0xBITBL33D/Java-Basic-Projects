import java.util.Scanner;

class Pyramid{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while(true)
    {
      String pyramidString = sc.nextLine().trim();
      
      if(pyramidString.isEmpty()) {
        System.err.println("Your input is empty");
        continue;
      }

      for(int NewLine = 0; NewLine < pyramidString.length(); NewLine++){

        for(int leadSpace = 0; leadSpace <= (pyramidString.length() - 1) - NewLine; leadSpace++) {
          System.out.print(" ");
        }

        for(int printChar = 0; printChar < NewLine; printChar++) {
          System.out.print(pyramidString.charAt(printChar));
          System.out.print(" ");
        }

        System.out.println("");
      }
    }
  }
}
