package oopsclass;

public class ResultDivisibleByTen extends AdditionResultOfTwoNumbers {

	public static void main(String[] args) {
		ResultDivisibleByTen RDT= new ResultDivisibleByTen();	
		RDT.additionAndDivision();
		
	}
	@Override
	public int additionAndDivision()
	{
		int sum=super.additionAndDivision();
		if(sum%10==0)
		{
			System.out.println("divisible by 10");
		}
		else
		{
			System.out.println("user can not divisible by 10");
		}
		return 0;
		
	}

}
