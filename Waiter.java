import java.util.LinkedList;
public class Waiter extends Employee {

	private LinkedList<Table> tables;
	private WaiterPage page;

	public Waiter(String name, String surname, String dob)
	{
		super(name, surname, dob);
	}
	
	public void setSection(LinkedList<Table> section)
	{
		tables = section;
	}
}
