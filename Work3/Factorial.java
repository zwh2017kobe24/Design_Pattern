package Work3;

public abstract interface Factorial {//��ͬ�Ľӿ�
	public abstract void Gettype();
	
}



class CompositeFactorial implements Factorial{//������

     int sum,i;
     Factorial fac;
    public CompositeFactorial( Factorial Fac,int i){
    	 this.fac=Fac;
    	 this.i =i;
    	 this.sum=fun(i);
     }
	public int fun(int i) {//�ݹ���׳˷���
		if(i==1)
		{
			return 1;
		}
		else return fun(i-1)*i;
	}

	
	public void Gettype() {
		System.out.println("This is composite");
		System.out.println("sum="+sum);
	}
	
}


class LeafFactorial implements Factorial{//Ҷ�ӽڵ���


	public void Gettype() {
		System.out.println("This is Leaf");
	}
	
}

class Client {
	Factorial Factorial;
	public Client(Factorial fac){
		this.Factorial=fac;
	}
	public void Print(){
		Factorial.Gettype();
	}
	
}
