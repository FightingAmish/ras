
public class Employee extends Profile {

	protected boolean current;	//whether or not this profile is currently employed
	
	public Employee(String name, String surname, String dob)
	{
		super(name, surname, dob);
		current = true;
	}
	
	public boolean isEmployed()
	{
		return current;
	}
}
