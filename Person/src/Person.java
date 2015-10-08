
public class Person 
{
	String m_name = null;
	int m_age = -1;
	String m_phoneNumber = null;
	String m_address = null;
			
	Person(String name, int age, String phoneNumber, String address)
	{
		SetName(name);
		SetAge(age);
		SetphoneNumber(phoneNumber);
		SetAddress(address);
	}
	
	String GetName()
	{
		return m_name;
	}
	
	int GetAge()
	{
		return m_age;
	}
	
	String GetphoneNumber()
	{
		return m_phoneNumber;
	}
	
	String GetAddress()
	{
		return m_address;
	}
	
	private void SetName(String name)
	{
		m_name = name;
		
	}
	
	private void SetAge(int age)
	{
		m_age = age;
	}
	
	private void SetphoneNumber(String phoneNumber)
	{
		m_phoneNumber = phoneNumber;
	}
	
	private void SetAddress(String address)
	{
		m_address = address;
	}
	
	void GrowsOlder()
	{
		int currentAge = GetAge();
		SetAge(currentAge +1);
	}
	}
