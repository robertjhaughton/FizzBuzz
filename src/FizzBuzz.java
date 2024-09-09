/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {
        
        int j = 1;
        while (j < 100) {
            j = doFizzBuzz(j);
        }
    }

    private static int doFizzBuzz(int j) {
        // Find out which numbers divide i.
        boolean divisibleBy3 = j % 3 == 0;
        boolean divisibleBy5 = j % 5 == 0;

        // Print our appropriate result.
        if (divisibleBy3 && divisibleBy5) {

            System.out.println("Fizz Buzz");

        } else if (divisibleBy3) {

            System.out.println("Fizz");

        } else if (divisibleBy5) {

            System.out.println("Buzz");

        } else {

            System.out.println(j);

        }
        j++;
        return j;
    }
}
