package practice07;

public class Student extends Person{
	private Klass klass;

	public Student(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int age,Klass klass) {
		super(name, age);
		this.klass = klass;
		// TODO Auto-generated constructor stub
	}
	

	public Klass getKlass(){
		return klass;
	}
	public String introduce(){
		//return "My name is Tom. I am 21 years old. I am a Student. I am at Class 2.";
		return "My name is " + name + ". I am " + age +" years old. I am a Student. I am at Class " + klass  +".";
	}
	
}
