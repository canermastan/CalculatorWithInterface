package canermastan;

public class Calculator implements ICalculator{
	@Override
	public double topla(double number1, double number2) {
		return number1 + number2;
	}

	@Override
	public double carp(double number1, double number2) {
		return number1 * number2;
	}

	@Override
	public double cikar(double number1, double number2) {
		return number1 - number2;
	}

	@Override
	public double bol(double number1, double number2) {
		return number1 / number2;
	}
	
}
