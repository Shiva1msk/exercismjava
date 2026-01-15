

class CalculatorConundrum  {

    public String calculate(int operand1, int operand2, String operation) {


        if (operation == null) {
            throw new IllegalArgumentException("Operation cannot be null");
        }

        
        if (operation.isEmpty()) {
            throw new IllegalArgumentException("Operation cannot be empty");
        }

        String s1 = String.valueOf(operand1);
        String s2 = String.valueOf(operand2);

        switch (operation) {

            case "+":
                int sum = operand1 + operand2;
                return s1 + " + " + s2 + " = " + sum;

            case "*":
                int product = operand1 * operand2;
                return s1 + " * " + s2 + " = " + product;

            case "/":
                try{
                int division = operand1 / operand2;
                return s1 + " / " + s2 + " = " + division;
                }catch(ArithmeticException e){
                    throw new IllegalOperationException("Division by zero is not allowed",e);
                }

            default:
                throw new IllegalOperationException(
                    "Operation '" + operation + "' does not exist"
                );
        }
    }
}
