import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        //Q: Take Inout of two numbers and print their Sum.
    }

        public static void add() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value of x: ");
            int x = input.nextInt();

        System.out.print("Enter value of y: ");
            int y = input.nextInt();

        System.out.println("The sum of " + x + " and " + y + " is " + (x + y));
    }

}