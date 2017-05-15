package Work2;

public class Testequals {
	public static void main(String args[]){
		String a="nihao";
		String b=new String("nihao");
		String c=a;
		boolean s1=(a.equals(b));
		boolean s2=(a.equals(c));
		boolean s3=(a==b);
		boolean s4=(a==c);
		System.out.println("s1="+s1+" "+"s2="+s2+" "+"s3="+s3+" "+"s4="+s4);
		
	}

}
