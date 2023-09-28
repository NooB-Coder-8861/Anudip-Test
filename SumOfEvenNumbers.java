public class SumOfEvenNumbers {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 25; i < 52; i++) {
            if (i / 2 == 0) {
                sum = sum + i;
            }
        }

        System.out.println("Sum of all even numbers between 25 to 51 is : " + sum);
    }
}