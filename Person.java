
public class Person {
	private String Name="";
	private int age = 18;	
// class with name and age and with the default age 18
public void PersonDetails() {
	System.out.println("The name of the person is  : " + Name); 
	System.out.println("The default age of the person is  : " + age ); 
}
// Method to display name and age 
	
public static void main(String[] args){	
	Person nameandage = new Person();
	nameandage.Name="Ranjith";
	nameandage.age=18;
//object is initialized with name and age
nameandage.PersonDetails();
	}

	
	
	

	
	
}
	
