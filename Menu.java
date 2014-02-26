import java.util.HashMap;
public class Menu {

	private HashMap<String, MenuItem> items = new HashMap<String, MenuItem>();
	
	public MenuItem getItem(String name)
	{
		if(items.containsKey(name)){
			return items.get(name);
		}
		return null;
	}
	
	public void addItem(String name, MenuItem item)
	{
		items.put(name, item);
	}
}
