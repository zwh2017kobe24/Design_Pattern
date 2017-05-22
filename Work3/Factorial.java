package Work3;

public abstract interface Factorial {//共同的接口
	public abstract void Gettype();
	
}



class CompositeFactorial implements Factorial{//容器类

     int sum,i;
     Factorial fac;
    public CompositeFactorial( Factorial Fac,int i){
    	 this.fac=Fac;
    	 this.i =i;
    	 this.sum=fun(i);
     }
	public int fun(int i) {//递归求阶乘方法
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


class LeafFactorial implements Factorial{//叶子节点类


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
