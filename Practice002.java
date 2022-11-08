/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practice002;

/**
 *
 * @author dapit
 */
import java.util.Scanner;

public class Practice002 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Welcome to the Program!!");

        int input01;

        int answer03;
        do {
            int answer02;
            do {
                System.out.print("Enter First Name: "); //takes first name
                String firstName = s.nextLine();
                s.nextLine();
                
                System.out.print("Enter Last Name: "); //takes last name
                String lastName = s.nextLine();
                
                System.out.print("Enter Contact Number: "); //takes number

                while (!s.hasNextInt()) { //repeat until int
                    s.next(); //discard the initial input
                    System.out.println("......................................");
                    System.out.println("Pls Try Again");
                    System.out.print("Enter Contact Number: ");

                }
                int answer01 = s.nextInt(); //this is when the input is number
                input01 = answer01; //store

                System.out.print("Enter Email Address: "); //takes last name
                String emailInput = s.next();

                System.out.println("..........................................");

                System.out.println("Press [1] to save, [2] to To Clear All");
                System.out.print("Enter: ");
                answer02 = s.nextInt();

                System.out.println("..........................................");

                if (answer02 == 1) { // if user wants to save
                                                            
                    System.out.println("FirstName: " + firstName); //prints the UserInput
                    System.out.println("LastName: " + lastName);
                    System.out.println("Contact: " + input01);
                    System.out.println("Email: : " + emailInput);

                }

            } while (answer02 == 2); //if user wants to repeat

            System.out.println("..............................................");
            System.out.println("Press [1] to add new data, [2] To Exit");
            System.out.print("Enter: ");
            answer03 = s.nextInt();

            if (answer03 == 2) { //if user wants to exit
                System.out.println("Program Exit...");
                break; 
                
            }
        } while (answer03 == 1);

    }

}
