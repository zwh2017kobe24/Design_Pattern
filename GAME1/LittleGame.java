package GAME1;/*
����ģʽ��֤�����㷨�ط�װ���������ҿ��Ի����滻��ʹ�㷨�ı仯������ʹ���㷨�Ŀͻ�
*����˵����Ľӿ�����һ���㷨��
*/

/*����һ��������*/
	 abstract class character{
	    Weapon weapon;
		abstract void fight();
		void setweapon(Weapon w){//����Ϊ�йܸ��ӿڣ�ͨ���ı�ӿ�������ͣ��ﵽ�ı���Ϊ
			this.weapon=w;
			w.Useweapon();
		}
	}
	/*����һ���ӿ����йܶ������Ϊ*/
 abstract interface Weapon{
		abstract void Useweapon();
	}
/*�������Ϊ��̳нӿڵ�Useweapon()����*/
 class Sword implements Weapon{
		public void Useweapon(){
			System.out.println("Use Sword to fight");
		}
	}

 class Ax implements Weapon{
	public void Useweapon(){
		System.out.println("Use Ax to fight");
	}
}

 class Wand implements Weapon{
	public void Useweapon(){
		System.out.println("Use Wand to fight");
	}
}
/*�����������*/
 class King extends character{
	void fight() {
		System.out.println("I'm a king");
	}
	
}
 class Soldier extends character{
	void fight() {
		System.out.println("I'm a Soldier");
	}
	
}

 class Queen extends character{
	void fight() {
		System.out.println("I'm a Queen");
	}
	
}
public class LittleGame {
	public static void main(String args[]){
		King king1=new King();
		Queen queen1=new Queen();
		Soldier soldier1=new Soldier();
		king1.fight();
		king1.setweapon(new Sword());
		queen1.fight();
		queen1.setweapon(new Wand());
		soldier1.fight();
		soldier1.setweapon(new Ax());
		
	}

}
