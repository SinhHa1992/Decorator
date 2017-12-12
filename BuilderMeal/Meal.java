package BuilderMeal;

import java.util.ArrayList;
import java.util.List;

public class Meal {
	private List<Item> mItem = new ArrayList<Item>();
	
	public void addItem(Item item){
		mItem.add(item);
	}
	
	/**
	 * Calculator total money
	 * */
	public void getCost(){
		float cost = 0.0f;
		
		for (Item item: mItem){
			cost += item.getPrice();
		}
		System.out.println("Total cost: " + cost);
	}
	
	/**
	 * Show all items
	 * */
	public void showItem(){
		for (Item item : mItem) {
	         System.out.print("Item : " + item.getName());
	         System.out.print(", Packing : " + item.getPacking().pack());
	         System.out.println(", Price : " + item.getPrice());
	      }	
	}
	
}
