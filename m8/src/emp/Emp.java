package emp;

public class Emp extends Temporary {
	float pf;


	

	public Emp(String Name, String Surname, String Address, double Basic_Salary,float pf) {
        super( Name, Surname,  Address, Basic_Salary, Basic_Salary);
        this.pf =pf;
            
			// TODO Auto-generated constructor stub
	}
  public  double claculateNetSalary() {
      return (getBasic_Salary()+(getBasic_Salary()* pf/100));
  }
      
      public String toString() {
	  return "Name=" + Name +"  "+  "Surname=" + Surname +" "+   "Address=" + Address + "]"+"  "  +" pf="+ pf;
	}

  
  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Emp e=new Emp("tinku","u","hyd",50000,(float)0.5);
 Emp m=new Emp("venu","G","hyd",50000,(float)0.25);
 Emp  k=new Emp("Srikanth","v","hyd",75000,(float)0.15);
 Emp  t=new Emp("sahith","G","hyd",85000,(float)0.2);
 System.out.println(e);
  System.out.println(e.claculateNetSalary());
  System.out.println(m.claculateNetSalary());
  System.out.println(k.claculateNetSalary());
  System.out.println(t.claculateNetSalary());
 	}
 }


