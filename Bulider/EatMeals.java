package Bulider;

public class EatMeals {
	public static void main(String args[]){
	MealDirector MD=new MealDirector();
	MD.SetMealMaker(new KFCMealmaker1());/*Ñ¡Ôñ³ÔÄÄÒ»¸öÌ×²Í*/
	MD.Construct();
	}
}