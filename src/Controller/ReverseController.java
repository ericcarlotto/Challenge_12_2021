package Controller;

public class ReverseController {

    public void reverse(int givenNumber) {

        //Variables instantiated to control the result.
        int ctrl = 0;

        //Logic
        while (givenNumber > 0) {

            ctrl *= 10;

            //Concatenate the result with the rest of the division by 10 from the given number
            ctrl += (givenNumber % 10);

            //Delete the last digit of the given number
            givenNumber /= 10;

        }

        //Shows the result
        System.out.println("Reverse of given number: " + ctrl);

    }
}
