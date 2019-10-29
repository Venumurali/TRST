package emp;

public class Temporary extends Employee {
	int days;
	

	public Temporary(String Name, String Surname, String Address, double Basic_Salary,double d) {
		super( Name, Surname,  Address, Basic_Salary);
		days= (int) d;
		// TODO Auto-generated constructor stub
	}
  
public  double claculateNetSalary() {
	  return (days * getBasic_Salary() /30);
  }
  public String toString() {
		return "TempEmp [days=" + days + ", Name=" + Name + ", Surname=" + Surname + ", Address=" + Address + "]"+"days"+days;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Temporary e=new Temporary("tinku","u","hyd",50000,35);
  System.out.println(e.claculateNetSalary());
	}
 }


