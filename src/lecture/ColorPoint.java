package lecture;
//��� ����

public class ColorPoint extends Point { // Point(�θ�)���� ��ӹ޴�
	private String color;
	public void setColor(String color) {
		this.color = color;
} 
	public void showColorPoint() {
		System.out.print("color : "+color+" ,");
		this.showPoint();//�θ� ��� �޾Ƽ� ���
	}
	public ColorPoint() { //������ �ϴ� ���� �ƴ϶� ���� �ҋ� �ѹ��� �ϴ� ���� ������ �Լ���� �Ѵ�
		set(0,0);
		color = "white";
//		showColorPoint();
	}
	public ColorPoint(int x, int y, String color) { //������ �ϰ� �ٷ� �����ϴ� �Լ��� �ʿ�� �Ҷ� ���� �ٸ��� �̷��� ����� �ش�
//		this.set(x, y); // private�̱� ������ set���� �ҷ��;� ����� �����ϴ�
		super(x,y); // �θ� �����ڸ� ȣ��
		this.color = color;
	}
}
 