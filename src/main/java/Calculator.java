
public class Calculator {

    public static int calculate(ArithmeticArguments args) {
        int result = args.nextOperand();

        while (args.hasNextOperator()) {
            Integer operand = args.nextOperand();
            Operator operator = args.nextOperator();

            result = operator.operate(result, operand);
        }

        return result;
    }
}
