
public class CalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Calculator calculation = new Calculator();
        calculation.setOperandOne(10.5);
        calculation.setOperation('+');
        calculation.setOperandTwo(5.2);
        calculation.performOperation();
        calculation.getResult();
	}

}
