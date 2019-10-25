package INTERFACE;
public class TA implements MSITmentor,MSITStudent{
    double gpa;
    double Salary;

    public TA(double gpa,double Salary) {
        super();
        this.gpa=gpa;
        this.Salary=Salary;
    }
public void getSalary(){
    System.out.println(Salary);
}
public void getGPA(){
    System.out.println(gpa);
}
@Override
public String toString() {
    return "TA BIO[Salary=" + Salary + ", gpa=" + gpa + "]";
}

public static void main(String[] args){
    TA t=new TA(9.5,15000);
    t.getGPA();
    t.getSalary();
    System.out.println(t);
} 
}
interface MSITmentor{
    void getSalary();
}
interface MSITStudent{
    void getGPA();
}
