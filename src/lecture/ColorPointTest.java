package lecture;
// 상속 사용법
public class ColorPointTest {

	public static void main(String[] args) {
		Point point = new Point();
		point.set(10, 10); // private로 막혀 있기 떄문에 set을 붙여 줘야 한다 / 설정
		point.showPoint();//설정해둔 좌표출력  /출력
		//생성자 함수 -선언과 함께 바로 나오는 함수
		ColorPoint colorPoint = new ColorPoint(20,20,"blue");
//		ColorPoint colorPoint = new ColorPoint();// 부모 클래스에서 미리 함수 생성자 값을 입력하면 아래 이용한 메서드형식을 줄일 수 있다 
		//변수를 선언하고 변수 앞에 타입을 설정 = 그다음 컬러 포인트라는 클래스를 생성할때는 앞에 new를 붙인다 = 이것을 생성자 함수라 한다 
//		colorPoint.set(20, 20); 
//		colorPoint.setColor("blue");
		colorPoint.showColorPoint();
	}

}
