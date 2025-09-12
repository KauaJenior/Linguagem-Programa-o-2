package Exe03;

public class Staff extends Person {
	private String school;
	private double pay;
	
	public String getSchool() 
	{
		return school;
	}
	
	public void setSchool(String school) 
	{
		this.school = school;
	}
	
	public double getPay()
	{
		return pay;
	}
	
	public void setPay(double pay)
	{
		this.pay = pay;
	}
	
	public Staff(String name, String adress, String school, double pay)
	{
		super(name, adress);
		this.school = school;
		this.pay = pay;
	}
	
	public String toString()
	{
		return String.format("Staff[Person[name = %s, adress = %s, school = %s, pay = %f]", name, adress, school, pay);
	}
}
