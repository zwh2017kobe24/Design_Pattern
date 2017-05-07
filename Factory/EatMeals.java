package Factory;
public class EatMeals {
public static void main(String args[]){
	KFCMeal kfc=new KFCMeal();/*选择工厂*/
	McDonald mdd=new McDonald();
	kfc.Makemeal("Meal1");/*选择套餐*/
	mdd.Makemeal("Meal3");
	}
}
