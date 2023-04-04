package calculate;

import java.util.Scanner;

public class Main extends Calculator {
    public static void main(String[] args) {
        char sign;
        Scanner scan = new Scanner(System.in); // declaring scanner class
        do {


            System.out.print("Enter First Number : ");
            int a = scan.nextInt();  // read first input
            System.out.print("Enter Second Number : ");
            int b = scan.nextInt();  // read second input
            System.out.print("Enter one of Symbol '+' '-' '*' '/' : ");
            char symbol = scan.next().charAt(0);  // read third input
            Main obj = new Main(); // creating an object of a child class to access the properties for both the class
            obj.calculateResult(a, b, symbol); // calling an instance method from parent class
            System.out.print("Would you like to do more Calculation ? \n Enter 'Y' or 'N'");
            sign = scan.next().charAt(0); // read the input of user choice
        }
        while (sign == 'y' || sign == 'Y'); // code will be executed if user give the input 'y' or 'Y'
        {
            scan.close();

        }

    }
}

