import Controller.FuelPumpController;
import Controller.ReverseController;
import Controller.ThirteenOverAvaregeController;

import java.util.InputMismatchException;
import java.util.Scanner;

//Execution class
public class App {
    public static void main(String[] args) throws InterruptedException, InputMismatchException {

        //Control variables
        int i = 0;
        int control = 0;

        //Instantiates the scanner
        Scanner rdr = new Scanner(System.in);


        while (i<1) {

            //Console user interface
            System.out.println(" ________________________________________________________________________________________ ");
            System.out.println(" ");

            System.out.println(" Welcome to the program developed for the POATEK - INTERNSHIP test ");
            Thread.sleep(1000);
            System.out.println(" ");
            System.out.println(" The functionalities are: ");
            System.out.println(" 1 - Challenge 1: Lists ");
            System.out.println(" 2 - Challenge 2: Functions ");
            System.out.println(" 3 - Challenge 3: Classes ");

            System.out.println(" ________________________________________________________________________________________ ");
            System.out.println(" ");

            Thread.sleep(500);
            System.out.println(" Choose the option you want: ");

            //Validate the input
            try {
                control = rdr.nextInt();

            } catch (InputMismatchException e) {

                System.out.println(" Input must be a number of type integer, corresponding to one of the options above! ");
                System.out.println(" Please type again: ");
                rdr = new Scanner(System.in);

            }
            Thread.sleep(1000);


            //Cases paths
            switch (control) {

                //Fist challenge
                case 1 -> {

                    System.out.println(" ");
                    System.out.println(" ________________________________________________________________________________________");
                    System.out.println(" ");

                    //Instantiates the class
                    ThirteenOverAvaregeController exc = new ThirteenOverAvaregeController();

                    //Perform the chosen function
                    exc.howManyStudents();

                }

                //Second challenge
                case 2 -> {

                    System.out.println(" ");
                    System.out.println(" ________________________________________________________________________________________");
                    System.out.println(" ");

                    //Instantiates the class
                    ReverseController rvs = new ReverseController();

                    //Read the input
                    System.out.println(" Enter the number you want to invert: ");
                    int givenN;

                    //Validate the input
                    try {

                        givenN = rdr.nextInt();
                        //Perform the chosen function
                        rvs.reverse(givenN);

                    } catch (InputMismatchException e) {

                        System.out.println(" Input must be a number of type integer! ");
                        System.out.println(" Please type again: ");
                        rdr = new Scanner(System.in);

                    }
                }

                //Third challenge
                case 3 -> {

                    System.out.println(" ");
                    System.out.println(" ________________________________________________________________________________________");
                    System.out.println(" ");

                    FuelPumpController flpCtr = new FuelPumpController();

                    flpCtr.fuelPumpSystem();

                }

                //validation case
                default -> System.out.println(" You need to choose one of the menu options: 1, 2 or 3 ");
            }

            //Rerun interface
            System.out.println(" ________________________________________________________________________________________");
            System.out.println(" ");

            System.out.println(" If you want to choose another feature type: 0 ");
            System.out.println(" If you want to finish the program, type: 1 ");
            control = rdr.nextInt();

            System.out.println(" ");
            System.out.println(" ________________________________________________________________________________________");
            System.out.println(" ");

            //Input control
            if (control == 1) {
                i++;
            }
        }

        System.out.println(" Thanks for use this system. ");
    }
}
