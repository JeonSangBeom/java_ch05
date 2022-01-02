package lecture;
//상속 사용법

public class ColorPoint extends Point { // Point(부모)에게 상속받다
	private String color;
	public void setColor(String color) {
		this.color = color;
} 
	public void showColorPoint() {
		System.out.print("color : "+color+" ,");
		this.showPoint();//부모에 상속 받아서 사용
	}
	public ColorPoint() { //여러번 하는 것이 아니라 생성 할떄 한번만 하는 것이 생성자 함수라고 한다
		set(0,0);
		color = "white";
//		showColorPoint();
	}
	public ColorPoint(int x, int y, String color) { //생성을 하고 바로 실행하는 함수를 필요로 할때 위와 다르게 이렇게 만들어 준다
//		this.set(x, y); // private이기 때문에 set으로 불러와야 사용이 가능하다
		super(x,y); // 부모 생성자를 호출
		this.color = color;
	}
}
 