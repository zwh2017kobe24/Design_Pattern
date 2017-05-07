package Factory;
/*创建超类，Makemeal()方法提供创建对象的抽象方法，交给由子类实现*/
public abstract class Mealmaker {
	public abstract Meal Makemeal(String meal);

}
/*肯德基出品套餐工厂*/
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
/*扩展：麦当劳出品套餐工厂*/
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

