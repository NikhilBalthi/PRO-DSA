package BitManipulationLec1;

import java.util.Scanner;

public class Lec1EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        // Isolate the last bit using bitwise AND (&)
        if ((number & 1) == 0) {
            System.out.println(number + " is an EVEN number.");
        } else {
            System.out.println(number + " is an ODD number.");
        }

        sc.close();
    }
}
