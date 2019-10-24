package emp;
class Employee{
    String Name;
    String  Surname;
    String  Address;
    private Double Basic_Salary;

     public Employee(String Name,String Surname,String Address,Double Basic_Salary) {
          this.Name=Name;
          this.Address=Address;
          this.Basic_Salary=Basic_Salary;
          this.Surname=Surname;
     }
    public Double getBasic_Salary() {
        return Basic_Salary;
    }

    public void setBasic_Salary(Double Basic_Salary) {
        this.Basic_Salary = Basic_Salary;
    }
}