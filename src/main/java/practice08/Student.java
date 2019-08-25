package practice08;

import practice08.Klass;
import practice08.Person;

public class Student extends Person{
	private Klass klass;

	public Student(int id,String name, int age) {
		super(id,name, age);
		// TODO Auto-generated constructor stub
	}
	public Student(int id,String name, int age,Klass klass) {
		super(id,name, age);
		this.klass = klass;
		// TODO Auto-generated constructor stub
	}
	

	public Klass getKlass(){
		return klass;
	}
	public String introduce(){
		String result = "";
		try{
			if( klass.getLeader().id == id){
				result = super.introduce() + " I am a Student. I am Leader of Class " + klass.getNumber()  +".";
			}else{
				result = super.introduce() + " I am a Student. I am at Class " + klass.getNumber()  +".";
			}
		}catch(NullPointerException e){
			result = super.introduce() + " I am a Student. I am at Class " + klass.getNumber()  +".";
		}
		
		return result;
	}
	
}
