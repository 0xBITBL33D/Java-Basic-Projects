import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while(true) {
            try{
            String X = sc.nextLine().trim();
                
            if(X.isEmpty() || !X.matches("-?\\d+")) 
                {
                System.err.println("Empty Input || Invalid Input!");
                continue;
                }
            
            //ACCEPTED INPUT
            else
                {
                int number = Integer.parseInt(X);

                if(number % 2 == 0) {
                    System.out.println("Fizz");
                }

                else if (number != Integer.MIN_VALUE && (number - 1) % 2 == 0){
                    System.out.println(number);
                    System.out.println("Buzz");
                }

                else{
                    System.out.println("Cheese");
                    sc.close();
                    break;
                }
                continue;
                }
                
            }

            catch(NumberFormatException e){
                System.err.println("Number is \"Invalid\"");
            }

        }
    }
}
