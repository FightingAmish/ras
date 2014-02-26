import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

public class Database {

	private HashMap<String, Profile> profiles;		//Pin is used a a key that links to a profile
	private HashSet<String> pins;					//The set of all pins currently used
	
	private Random rand = new Random();				//Random generator used for pins
	
	public Database()
	{
		profiles = new HashMap<String, Profile>();
		pins = new HashSet<String>();
		
		initialize();
	}
	
	/*
	 * Initializes the database with several
	 * entries.
	 */
	public void initialize()
	{
		Admin admin = new Admin("John", "Cutsavage", "3/24/1993");
		profiles.put("0000", admin);
		pins.add("0000");
		Admin admin1 = new Admin("Jon", "Colabella", "5/1/1993");
		profiles.put("0001", admin1);
		pins.add("0001");
		Admin admin2 = new Admin("Nate", "Zimmerman", "1/17/1993");
		profiles.put("0002", admin2);
		pins.add("0002");
		
		Manager manager = new Manager("Head", "Manager", "1/1/1900");
		profiles.put("0003", manager);
		pins.add("0003");
		
		Employee employee = new Employee("John", "Robinson", "1/1/1900"); //Jon coded this segment
		profiles.put("1234", employee);
		pins.add("1234");
	}
	
	public void addAdmin(Admin admin)
	{
		profiles.put(generatePin(), admin);
	}
	
	public void addManager(Manager manager)
	{
		profiles.put(generatePin(), manager);
	}
	
	public void addEmployee(Employee employee)
	{
		profiles.put(generatePin(), employee);
	}
	
	/*
	 * Generates a new random pin number. Used for new
	 * employees or to change a pin. Checks from the current
	 * list of pins being used so no two pins will be the same.
	 * 
	 * @return a string of numbers used as a pin
	 */
	private String generatePin()
	{
		String pin = "";
		
		int digit1 = rand.nextInt(10);
		int digit2 = rand.nextInt(10);
		int digit3 = rand.nextInt(10);
		int digit4 = rand.nextInt(10);
		
		pin = "" + digit1 + digit2 + digit3 + digit4;
		
		if(pins.contains(pin)){
			return generatePin();
		}
		
		pins.add(pin);
		
		return pin;
	}
	
	public Profile getProfile(String pin)
	{
		return profiles.get(pin);
	}
	
	public HashMap<String, Profile> getProfiles()
	{
		return profiles;
	}
}

