package practice08;

public class Person {
	protected int id;
	protected String name;
	protected int age;
	public Person(int id,String name,int age){
		this.name = name;
		this.age = age;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age = age;
	}
	public String introduce(){
		return "My name is " + name + ". I am " + 21 + " years old.";
	} 
	public boolean isEqualTo(Person person){
		boolean result  = false;
		if (id == person.id){
			return true;
		}
		
		return result;
	}

}
