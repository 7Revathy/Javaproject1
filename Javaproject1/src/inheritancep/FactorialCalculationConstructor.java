package inheritancep;

public class FactorialCalculationConstructor {

	public static void main(String[] args) {
		factorialCalculation FC=new factorialCalculation();	
	}
}
class factorialCalculation{
	int result=1;
	int n;
		factorialCalculation(int n){	
			this.n=n;
			for (int i=2;i<=n;i++) {
				result=result*i;
				}
		}
factorialCalculation(){
	this(10);
	System.out.println("Factorial of " + n + " is " + this.result);
}
}
