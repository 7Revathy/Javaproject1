package inheritancep;
import java.util.Scanner;
public class CustomerPurchase {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("\nIf customer purchase clothes on Offseason, you will get discount 15% and on Onseason 40% ");
			System.out.println("Select the option \n1= offseason\n2=onseason\n0=Exit");
			n=sc.nextInt();
		
		if(n==1) {
			Offseason ofs=new Offseason();
			double price=ofs.discount(4000);
			System.out.println("your discount amount is " +price);
			double a= 4000-price;
			System.out.println("your have to pay this " +a+ "amount " );
			
		}
		else if(n==2) {
			Onseason os=new Onseason();
			double price=os.discount(4000);
			System.out.println("your discount amount is " +price);
			double b= 4000-price;
			System.out.println("your have to pay this " +b+ "amount " );
		}
		else {
			System.out.println("Exit");
		}
	}while(n!=0);
	

}
}