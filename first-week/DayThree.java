public class DayThree {
    public static void main(String[] args) {
        SumOfDigits obj = new SumOfDigits();
        int res = obj.sumOfDigits(101010);
        System.out.println("This is the result after suming the digit of the given number: " + res);

    }
}

class SumOfDigits {
    static {
        System.out.println("This is my intial though about suming a digit");
    }

    int sumOfDigits(int n) {
        int result = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            result += lastDigit;
            float divideByTem = n / 10;
            int resultAfterRemovingLastDigit = (int) divideByTem;
            n = resultAfterRemovingLastDigit;
        }
        return result;
    }

}

