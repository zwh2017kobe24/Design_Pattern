package Factory;
public class EatMeals {
public static void main(String args[]){
	KFCMeal kfc=new KFCMeal();/*ѡ�񹤳�*/
	McDonald mdd=new McDonald();
	kfc.Makemeal("Meal1");/*ѡ���ײ�*/
	mdd.Makemeal("Meal3");
	}
}
