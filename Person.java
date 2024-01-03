public class Person {
    String Name;
    int Age;

    public Person(String Name, int Age)
    { this.Name=Name;
        this.Age=Age;


    }
    public static void main(String[] args)
    {Person a = new Person("RAnjith",24);
        System.out.println("Name : " + a.Name + "/n Age: " + a.Age);
        Employee b = new Employee("Ranjith",24,"a42",20000);
        System.out.print("Name : " + b.Name + "/nAge: " + b.Age + "EMp ID : " + b.employeeID + "Salary : " + b.Salary);






    }


}