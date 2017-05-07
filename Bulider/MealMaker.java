package Bulider;
/*创建食品制作者超类*/
public abstract class MealMaker {
	abstract String Make_food();
	abstract String Make_drink();
	abstract Meal GetMeal();
		
}

/*具体的食品制作类KFC*/
class KFCMealmaker1 extends MealMaker{

	String Make_food() {
		String food="Chicken Loaf";
		return food;
	}


	String Make_drink() {
		String drink="Milk";
		return drink;
	}

    Meal GetMeal(){
		Meal meal=new Meal();
		meal.food=Make_food();
		meal.drink=Make_food();
		meal.Combine();
		return meal;
	 }
	
}
/*扩展：具体的食品制作类KFCMealmaker2,3*/
class KFCMealmaker2 extends MealMaker{

	String Make_food() {
		String food="Hamburg";
		return food;
	}


	String Make_drink() {
		String drink="Cola";
		return drink;
	}

	Meal GetMeal() {
		Meal meal=new Meal();
		meal.food=Make_food();
		meal.drink=Make_food();
		meal.Combine();
		return meal;
	}
	
}

class KFCMealmaker3 extends MealMaker{

	String Make_food() {
		String food=" Beefsteak";
		return food;
	}


	String Make_drink() {
		String drink="Orange juice";
		return drink;
	}

	Meal GetMeal() {
		Meal meal=new Meal();
		meal.food=Make_food();
		meal.drink=Make_food();
		return meal;
	}
	
}
