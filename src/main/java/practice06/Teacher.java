package practice06;

public class Teacher extends Person{
	private int klass;
	public Teacher(String name,int age){
		super(name,age);
	}
	public Teacher(String name,int age,int klass){
		super(name,age);
		this.klass = klass;
	}
	public int getKlass(){
		return klass;
	}
	public String introduce(){
		String result = "";
		if(klass == 0){
			result = super.introduce() + " I am a Teacher. I teach No Class.";
		}else{
			result = super.introduce() + " I am a Teacher. I teach Class " + klass + ".";
		}
		return result;
	}
}

