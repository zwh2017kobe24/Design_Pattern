package Bulider;

public class EatMeals {
	public static void main(String args[]){
	MealDirector MD=new MealDirector();
	MD.SetMealMaker(new KFCMealmaker1());/*ѡ�����һ���ײ�*/
	MD.Construct();
	}
}