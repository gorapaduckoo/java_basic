

public class Exercise6_5 {
	public static void main(String[] args) {
		Student s = new Student("홍길동",1,1,100,60,76);
		
		System.out.println(s.info());
	}
}

class Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
		
	int getTotal() {
		return kor+eng+math;
	}
	float getAverage() {
		return (float) ((int)(getTotal()/3.0*10+0.5)/10.0);
	}
	String info() {
		return this.name + "," + this.ban + "," + this.no + "," + this.kor + "," + this.eng + "," + this.math + "," + this.getTotal() + "," + this.getAverage();
	}
	
}