package AssignDay7;

 abstract class Beverages {
		
	
	public void addMilk() {
		System.out.println("Milk Added");
	}
	
	public abstract void addIngredient();
}
public class Coffee extends Beverages{
	
	public void addIngredient() {
		System.out.println("Ingredients for Coffee are added");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coffee c = new Coffee();
		c.addIngredient();
		c.addMilk();
		System.out.println("Coffee is ready");

	}

}
