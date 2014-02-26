import java.util.LinkedList;

public class Busboy extends Employee {
	
	private LinkedList<Table> tables;
	private BusboyPage page;
	
	public Busboy(String name, String surname, String dob)
	{
		super(name, surname, dob);
	}
	
	
	public void setSection(LinkedList<Table> section)
	{
		tables = section;
	}
}
