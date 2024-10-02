package JavaAssignments;

final class Person
{
final String name;
final double age;
	
  public Person(String name, int age)
  {
		super();
		this.name = name;
		this.age = age;
 }

public String getName() {
	return name;
}

public double getAge() {
	return age;
}

public void display() {
	System.out.println("name:"+name);
	System.out.println("age"+age);
}

public static void main(String[] args) 
{
	
Person person=new Person("Supriya", 22);
person.display();
	
	
	  
}
	
  

}
