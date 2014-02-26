
public class MenuItem {

	private String name;
	private String description;
	private double cost;
	
	public MenuItem(String name, String description, double price)
	{
		this.name = name;
		this.description = description;
		cost = price;
	}
	
	public void changePrice(double newPrice)
	{
		cost = newPrice;
	}
	
	public double getCost()
	{
		return cost;
	}
	
	public String getDescription()
	{
		return description;
	}
	
	public String getName()
	{
		return name;
	}
}
