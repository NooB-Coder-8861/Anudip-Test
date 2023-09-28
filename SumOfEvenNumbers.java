/*
Sayantan Das
*/
public class SumOfEvenNumbers {
    public static void main(String[] args) {
        int sum = 0;                        //Took a veriable to store the sum of all even numbers.
        for (int i = 25; i < 52; i++) {    //We will go through every integer form 25 to 51
            if (i % 2 == 0) {               //Checks if the number is even or not
                sum = sum + i;               //add up the number
            }
        }

        System.out.println("Sum of all even numbers between 25 to 51 is : " + sum); //Display the value
    }
}
