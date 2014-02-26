import java.util.LinkedList;
public class Floor {

	private LinkedList<Table> section1 = new LinkedList<Table>();
	private LinkedList<Table> section2 = new LinkedList<Table>();
	private LinkedList<Table> section3 = new LinkedList<Table>();
	private LinkedList<Table> section4 = new LinkedList<Table>();
	
	public Floor()
	{
		for (int i = 1; i <= 10; i++){
			Table table = new Table(i);
			section1.add(table);
			section2.add(table);
			section3.add(table);
			section4.add(table);
		}
			
	}
	
	
	/*
	 * Returns a specified section of tables.
	 * Must be within 1-4 range.
	 */
	public LinkedList<Table> getSection(int sect)
	{
		switch(sect){
		case 1:	return section1;
		case 2:	return section2;
		case 3:	return section3;
		case 4:	return section4;
		}
		
		return null;
	}
}
