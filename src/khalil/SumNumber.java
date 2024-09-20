package khalil;

public class SumNumber {
    public static void main(String[] args) {
        // count sum number

        int sum = 0;
        int limit = 17;
        for (int i = 0; i < limit; i++) {
            sum = sum + i;
        }
        System.out.println("the sum of first " + limit + "number is : " + sum);
    }
}
