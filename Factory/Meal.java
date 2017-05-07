package Factory;
/*创建套餐超类*/
public abstract class Meal {
	String food;
	String drink;
	void Combine(){
		System.out.println("this is "+food+" with "+drink);
	}
	
}

/*肯德基具体的套餐*/
class KFCMeal1 extends Meal
{ 
	KFCMeal1()
	{
		food="Chicken Loaf";
		drink="Milk";
		Combine();
	}
}

class KFCMeal2 extends Meal{
	KFCMeal2()
	{
		food="Hamburg";
		drink="Cola";
		Combine();
	}
	
}

class KFCMeal3 extends Meal{
	KFCMeal3()
	{
		food="Beefsteak";
		drink="Orange juice";
		Combine();
	}
	
}
/*麦当劳具体的套餐*/
class McDonaldMeal1 extends Meal
{ 
	McDonaldMeal1()
	{
		food="Fried chicken";
		drink="Red wine";
		Combine();
	}
}

class McDonaldMeal2 extends Meal{
	McDonaldMeal2()
	{
		food="Pasta";
		drink="Cola";
		Combine();
	}
	
}

class McDonaldMeal3 extends Meal{
	McDonaldMeal3()
	{
		food="Pizza";
		drink="Orange juice";
		Combine();
	}
	
}
