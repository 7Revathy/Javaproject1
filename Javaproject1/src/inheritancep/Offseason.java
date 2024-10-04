package inheritancep;

public class Offseason extends Season{
	@Override
	public double discount(double amount) {
		double discount;
		discount=amount*0.15;
		return discount;
	}
}
