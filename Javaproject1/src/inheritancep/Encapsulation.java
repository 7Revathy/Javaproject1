package inheritancep;

public class Encapsulation {

	public static void main(String[] args) {
	
		GetSeterMethod sc=new GetSeterMethod();
		sc.setAge(12);
		sc.setName("Revathy");
		System.out.println(sc.getAge());
		System.out.println(sc.getName());
	}

}
