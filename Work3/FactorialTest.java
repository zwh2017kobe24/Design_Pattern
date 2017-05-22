package Work3;

public class FactorialTest {

	public static void main(String[] args) {
		Factorial fac = new CompositeFactorial(null,1);
		LeafFactorial LF=new LeafFactorial();
		CompositeFactorial CF=new CompositeFactorial(fac ,10);
		Client client=new Client(CF);
		Client client1=new Client(LF);
		client.Print();
		client1.Print();

	}

}
