package lecture;
//상속 사용법
public class Student extends Person{//Person을 상속 받겠다
	public Student() {
		System.out.println("나는 Person을 상속받은 학생 클래스");
	}
	public void set() {
		this.age = 30; // this.를 쓰면 person에서 얻어올 수 있는 값들을 볼 수 있다 
		setWeight(80); //private를 set으로 변환하여 사용한거기 때문에 앞에 set과 메서드이기 때문에 괄호를 사용해 준다
		name = "전상범";
		height=180;
		
		
	}

}
