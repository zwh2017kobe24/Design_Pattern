package Bulider;

import javax.swing.JOptionPane;

public class MealDirector {
	protected MealMaker maker;
	public void SetMealMaker( MealMaker maker){
		this.maker=maker;	
	}
	 
	void Construct(){
		System.out.println(maker.Make_drink()+" is making");
		System.out.println(maker.Make_food()+" is making");
		maker.GetMeal();
	}

}
