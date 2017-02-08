
/**
 * Created by anastasiyatsybulko on 28.01.2017.
 */
public class Calculator {

    public long calculate(String[] args) {

        double firstNumber = Double.parseDouble(args[0]);
        double secondNumber = Double.parseDouble(args[2]);
        char operator = args[1].charAt(0);
        double result = Double.NaN;

        if (operator == '+') {
            result = firstNumber + secondNumber;
        }

        if (operator == '-') {
            result = firstNumber - secondNumber;
        }

        if (operator == '.') {
            result = firstNumber * secondNumber;
        }

        if (operator == '/') {
            result = firstNumber / secondNumber;
        }

        long longResult = Math.round(result);
        if (longResult > 99999999 || longResult < -99999999 ) {
            System.out.println("Значение слишком большое!!!");
            /*return Long.MIN_VALUE;*/
        } else System.out.println(longResult);

        return longResult;

    }

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        calculator.calculate(args);


    }


}

