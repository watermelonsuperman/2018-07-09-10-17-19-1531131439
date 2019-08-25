package practice07;

public class Teacher extends Person{

	private Klass klass;
	public Teacher(String name,int age){
		super(name,age);
	}
	public Teacher(String name,int age,Klass klass){
		super(name,age);
		this.klass = klass;
	}
	public Klass getKlass(){
		return klass;
	}
	public String introduce(){
		String result = "";
		if(klass.getNumber() == 0){
			result = super.introduce() + " I am a Teacher. I teach No Class.";
		}else{
			result = super.introduce() + " I am a Teacher. I teach Class " + klass.getNumber() + ".";
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
