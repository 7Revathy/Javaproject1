package inheritancep;

public class Onseason extends Season{
	@Override
	public double discount(double amount) {
		double discount;
		discount=amount*0.40;
		return discount;
	}
}
