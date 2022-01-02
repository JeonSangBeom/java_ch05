 package lecture;
//상속 사용법(다중 상속은 안된다 / 한 부모에게서만 내려온다)

public class Point {
	//field properties 변수 상태
	private int x;//외부에서 노출이 안된다
	private int y;
	
	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}	
	public void showPoint() { //보여주기 위해(x,y좌표만 찍어주고 있다)
		System.out.println("{"+x+","+y+"}"); 
	}
	
	public Point() {
		
	}
	public Point(int x, int y) {// 위에 set함수와 같고 set을 써도 되고 Point를 써도 되고 상관이 없다
		this.x = x;
		this.y = y;
	}
}
