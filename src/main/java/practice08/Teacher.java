package practice08;

import practice08.Klass;
import practice08.Student;

public class Teacher extends Person{
	private Klass klass;
	public Teacher(int id,String name,int age){
		super(id,name,age);
	}
	public Teacher(int id,String name,int age,Klass klass){
		super(id,name,age);
		this.klass = klass;
	}
	public Klass getKlass(){
		return klass;
	}
	public String introduce(){
		String result = "";
		try{
			result = super.introduce() + " I am a Teacher. I teach Class " + klass.getNumber() + ".";
		}catch(NullPointerException e){
			result = super.introduce() + " I am a Teacher. I teach No Class.";
		}
		
		
		return result;
	}
	public String introduceWith(Student student){
		String result = "";
		if(student.getKlass().getNumber() == klass.getNumber()){
			result = super.introduce() + " I am a Teacher. " + "I teach " + student.getName() + ".";
		}else{
			result = super.introduce() + " I am a Teacher. " + "I don't teach " + student.getName() + ".";
		}
		return result;
	}


}
