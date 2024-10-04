package inheritancep;
class ReverseNumber{
	int n,r=0,m;

ReverseNumber(int n) {
	this.n=n;
	        while (n!= 0) {
	            m=n%10;
	            r=r*10+m;
	            n=n/10;
	        }	        
	    }

ReverseNumber() {
	this(677);
	System.out.println("Finding reverse…”: " + this.r);
    }  
}

public class ReverseNumberConstructors {

	public static void main(String[] args) {
	
		ReverseNumber RN=new ReverseNumber();	
		
	}

} 
