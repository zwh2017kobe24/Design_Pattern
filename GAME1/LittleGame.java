package GAME1;/*
策略模式验证，将算法簇封装起来，并且可以互相替换，使算法的变化独立于使用算法的客户
*比如说具体的接口类是一个算法簇
*/

/*创建一个抽象类*/
	 abstract class character{
	    Weapon weapon;
		abstract void fight();
		void setweapon(Weapon w){//将行为托管给接口，通过改变接口类的类型，达到改变行为
			this.weapon=w;
			w.Useweapon();
		}
	}
	/*创建一个接口来托管对象的行为*/
 abstract interface Weapon{
		abstract void Useweapon();
	}
/*具体的行为类继承接口的Useweapon()方法*/
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
/*抽象类的子类*/
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
