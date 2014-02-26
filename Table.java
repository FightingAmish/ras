
public class Table {

	private int number;
	private String name;
	
	public Table(int num)
	{
		number = num;
		name = "Table " + number;
	}
	
	public String getName()
	{
		return name;
	}
}
