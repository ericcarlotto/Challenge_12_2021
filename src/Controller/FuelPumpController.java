package Controller;

import Model.FuelPump;

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class FuelPumpController {

    //Initiates the Staff password
    private String staffPass = "staffPass2021";

    public void fuelPumpSystem() throws InterruptedException {

        //Control variables and the input control(Scanner)
        Scanner ldr = new Scanner(System.in);
        FuelPump flp = new FuelPump();
        int control = 0;
        String password = "";
        int i = 0;

        //Control interface of the fuel pump system
        while (i==0) {
            //Console user interface
            System.out.println(" ________________________________________________________________________________________ ");
            System.out.println(" ");

            System.out.println(" Welcome to the Gas Station System ");
            Thread.sleep(1000);
            System.out.println(" ");
            System.out.println(" The functionalities are: ");
            System.out.println(" 1 - Fill your vehicle with the amount of fuel ");
            System.out.println(" 2 - Fill your vehicle with money ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" STAFF AREA: ");
            System.out.println(" 3 - Set the fuel price ");
            System.out.println(" 4 - Refill the fuel pump ");

            System.out.println(" ________________________________________________________________________________________ ");
            System.out.println(" ");

            Thread.sleep(500);
            System.out.println(" Choose the option you want: ");

            //Validate the input
            try {
                control = ldr.nextInt();

            } catch (InputMismatchException e) {

                System.out.println(" Input must be a number of type integer, corresponding to one of the options above! ");
                System.out.println(" Please type again: ");
                ldr = new Scanner(System.in);

            }
            Thread.sleep(1000);

            //Cases paths
            switch (control) {

                //Case fillWithLiters()
                case 1 -> {
                    System.out.println(" Type how many liters do you want to fill: ");
                    float liters = ldr.nextFloat();
                    float payedPrice = flp.fillWithLiters(liters);
                    System.out.println(" ------------- ");
                    System.out.println(" ");
                    System.out.println(" The fuel was filled and the payed price was: R$" + payedPrice);
                    System.out.println(" ");
                    System.out.println(" ------------- ");
                }

                //Case fillWithPrice()
                case 2 -> {
                    System.out.println(" Enter how much money you want pay to fill your car fuel: ");
                    float price = ldr.nextFloat();
                    float litersPumped = flp.fillWithPrice(price);
                    System.out.println(" ------------- ");
                    System.out.println(" ");
                    System.out.println(" The fuel was filled with: " + litersPumped + " Liters");
                    System.out.println(" ");
                    System.out.println(" ------------- ");
                }

                //Staff cases
                //Case setPrice()
                case 3 -> {
                    System.out.println(" ------------- ");
                    System.out.println(" ");
                    System.out.println(" Enter the password: ");
                    password = ldr.next();
                    Thread.sleep(500);

                    if(Objects.equals(password, staffPass)) {

                        System.out.println(" ------------- ");
                        System.out.println(" ");
                        System.out.println(" Enter the price: ");
                        float price = ldr.nextFloat();
                        FuelPump.types type;

                        System.out.println(" ------------- ");
                        System.out.println(" ");
                        System.out.println(" The types are: ");
                        System.out.println(" 1 - STANDARD ");
                        System.out.println(" 2 - PREMIUM  ");
                        System.out.println(" 3 - DIESEL ");
                        System.out.println(" 4 - ALCOHOL ");
                        System.out.println(" ");
                        System.out.println(" ------------- ");
                        System.out.println(" ");
                        System.out.println(" Please, choose one of the options: ");
                        int option = ldr.nextInt();
                        int ctr = 0;

                        while (ctr==0) {
                            switch (option) {
                                case 1 -> {
                                    type = FuelPump.types.STANDARD;
                                    flp.setPrice(type, price);

                                    System.out.println(" ------------- ");
                                    System.out.println(" ");
                                    System.out.println(" The price was set to: R$" + price + ", to fuel type: " + type);
                                    System.out.println(" ");
                                    System.out.println(" ------------- ");

                                    ctr++;
                                }
                                case 2 -> {
                                    type = FuelPump.types.PREMIUM;
                                    flp.setPrice(type, price);

                                    System.out.println(" ------------- ");
                                    System.out.println(" ");
                                    System.out.println(" The price was set to: R$" + price + ", to fuel type: " + type);
                                    System.out.println(" ");
                                    System.out.println(" ------------- ");

                                    ctr++;
                                }
                                case 3 -> {
                                    type = FuelPump.types.DIESEL;
                                    flp.setPrice(type, price);

                                    System.out.println(" ------------- ");
                                    System.out.println(" ");
                                    System.out.println(" The price was set to: R$" + price + ", to fuel type: " + type);
                                    System.out.println(" ");
                                    System.out.println(" ------------- ");

                                    ctr++;
                                }
                                case 4 -> {
                                    type = FuelPump.types.ALCOHOL;
                                    flp.setPrice(type, price);

                                    System.out.println(" ------------- ");
                                    System.out.println(" ");
                                    System.out.println(" The price was set to: R$" + price + ", to fuel type: " + type);
                                    System.out.println(" ");
                                    System.out.println(" ------------- ");

                                    ctr++;
                                }
                                default -> {
                                    System.out.println(" You need to choose one of the menu options: 1, 2, 3 or 4");
                                }
                            }
                        }
                    }

                    if (!Objects.equals(password, staffPass)) {
                        System.out.println(" Authorized people only! ");
                    }
                }

                //Case refillFuelPump() <- thinked by me to refill the fuel pump
                case 4 -> {
                    System.out.println(" ------------- ");
                    System.out.println(" ");
                    System.out.println(" Enter the password: ");
                    password = ldr.next();
                    Thread.sleep(500);

                    if(Objects.equals(password, staffPass)) {
                        float liters;

                        System.out.println(" ------------- ");
                        System.out.println(" ");
                        System.out.println(" Enter the quantity in liters that you want to refill the fuel pump: ");
                        System.out.println(" ");
                        System.out.println(" ------------- ");
                        liters = ldr.nextFloat();

                        if (liters>0) {
                            flp.refillFuelPump(liters);
                            float fuel = flp.getFuelQuantity();
                            System.out.println(" The fuel pump was refilled with: " + liters + " Liters, and the amount of fuel in the fuel pump is: "+ fuel);
                        }

                        if (liters<=0) {
                            System.out.println(" The quantity of liters have to be a positive value and bigger than 0! ");
                        }
                    }

                    if (!Objects.equals(password, staffPass)) {
                        System.out.println(" Authorized people only! ");
                    }
                }

                default -> {
                    System.out.println(" You need to choose one of the menu options: 1, 2, 3 or 4");
                }
            }

            //Rerun interface of fuel pump system
            System.out.println(" ________________________________________________________________________________________");
            System.out.println(" ");

            System.out.println(" If you want to choose another feature from the fuel pump system type: 0 ");
            System.out.println(" If you want to finish the fuel pump system, type: 1 ");
            control = ldr.nextInt();

            System.out.println(" ");
            System.out.println(" ________________________________________________________________________________________");
            System.out.println(" ");

            //Input control
            if (control == 1) {
                i++;
            }
        }

    }

}
