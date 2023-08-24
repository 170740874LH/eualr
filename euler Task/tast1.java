
public class tast1 {
    public static void main(String[] args) {
        int number1 = 1;
        int number2 = 2;
        int nextNumber = 0;
        int sum = 2;
        for (int i = 0; nextNumber < 4000001; i++) {
            nextNumber = number1 + number2;
            number1 = number2;
            number2 = nextNumber;
            if (nextNumber%2 == 0) {
                sum += nextNumber;
            }
        }
        System.out.println(sum);

    } 
}    