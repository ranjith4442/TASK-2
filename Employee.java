public class Employee extends Person{
    String employeeID;
    int Salary;

    public Employee(String Name, int Age,String employeeID,int Salary)
    {
        super(Name, Age);
        this.employeeID=employeeID;
        this.Salary=Salary;
    }
}

