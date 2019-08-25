package practice08;

public class Klass {
	private Student leader;
	private int number;
	public Klass(int number){
		this.number = number;
	}
	public int getNumber(){
		return number;
	}
	public String getDisplayName(){
		return "Class " + number;
	}
	public void assignLeader(Student student){
		leader = student;
	}
	public Student getLeader(){
		return leader;
	}

}
