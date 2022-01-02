package temp;
//상속 - 패키지 사용법
import lecture.Person;

public class Student02 extends Person {
	public void set() {
		name = "전상범";
		setWeight(80);
		height = 180; //protected - 상속을 받으면 쓸 수 있다
		//디폴트는 같은 패키지 내에서만 사용 가능
	}

}
