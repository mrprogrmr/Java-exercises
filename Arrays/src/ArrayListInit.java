import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type, int count) {

	public GroceryItem(String name) {
		this(name, "DAIRY", 1);
	}

	@Override
	public String toString() {
		return String.format("%d %s in %s", count, name.toUpperCase(), type);
	}
}

public class ArrayListInit {
	public static void main(String[] args) {

		GroceryItem [] groceryArray = new GroceryItem[3];
		groceryArray[0] = new GroceryItem("milk");
		groceryArray[1] = new GroceryItem("apples", "PRODUCE", 6);
		groceryArray[2] = new GroceryItem("oranges", "PRODUCE", 5);
		System.out.println(Arrays.toString(groceryArray));

//		ArrayList objectList = new ArrayList();
//		objectList.add(new GroceryItem("Butter"));
//		objectList.add("Yoghurt");

		ArrayList<GroceryItem> groceryList = new ArrayList<>();
		groceryList.add(new GroceryItem("Butter"));
		groceryList.add(new GroceryItem("milk"));
		groceryList.add(new GroceryItem("oranges", "Produce", 5));
		groceryList.set(0, new GroceryItem("apples", "Produce", 6));
		System.out.println(groceryList);

	}
}