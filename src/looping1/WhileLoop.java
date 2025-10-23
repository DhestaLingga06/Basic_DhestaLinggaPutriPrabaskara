package looping1;

public class WhileLoop {

    public int getEvenNumbersAndSum(int max) {
        int sum = 0;
        int i = 1;

        while (i <= max) {
            if (i % 2 == 0) {
                sum += i;
            }
            i++;
        }

        return sum;
    }
}