package Factory;
/*�������࣬Makemeal()�����ṩ��������ĳ��󷽷�������������ʵ��*/
public abstract class Mealmaker {
	public abstract Meal Makemeal(String meal);

}
/*�ϵ»���Ʒ�ײ͹���*/
class KFCMeal extends Mealmaker{

	public Meal Makemeal(String meal) {
		if(meal.equals("Meal1"))
		{
			return new KFCMeal1();
		}
		else if(meal.equals("Meal2"))
		{
			return new KFCMeal2();
		}
		else if(meal.equals("Meal3"))
		{
			return new KFCMeal3();
		}
		else return null;
		
	}
	
}
/*��չ�����ͳ�Ʒ�ײ͹���*/
class McDonald extends Mealmaker{

	public Meal Makemeal(String meal) {
		if(meal.equals("Meal1"))
		{
			return new McDonaldMeal1();
		}
		else if(meal.equals("Meal2"))
		{
			return new McDonaldMeal2();
		}
		else if(meal.equals("Meal3"))
		{
			return new McDonaldMeal3();
		}
		else return null;
		
	}
	
}

