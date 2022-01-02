package lecture;
//override ���� 
class Shape{
	public void draw() {
		System.out.println("shape �׸���");
	}
}
class Line extends Shape{
	public void draw() {
		System.out.println("Line �׸���");
	}
}
class Rect extends Shape{
	public void draw() {
		System.out.println("Rect �׸���");
	}
}
class Circle extends Shape{
	
	@Override // �̸� �˷��ִ� �� Annotation �̶�� �Ѵ�(�Ƚᵵ ����� ����) /  +Spring�Ҷ� ���� ������ �ȴ�
	public void draw() {
		System.out.println("Circle �׸���");
	}
}

class AA{ //����� �ȹ����� ����� �Ұ����ϴ�
	public void draw() {
		System.out.println("AA �׸���");
	}
}
//����(run time)  ���ε�(���� ���) ����ɶ� ���� method override �����϶� ���� �Ǵ� ���� �ƴ϶� ����ɶ� �׶� ���� ex)p.draw()�� �۵��ҋ� �ڽ��� ã�� ��
public class MethodOverrideTest {
	
	public static void paint(Shape p) {
		p.draw(); //�̷��� �� ĳ������ �̿��ϸ� �Ʒ��� ���ʿ��� ��Ȳ���� ������ �� �ִ�(�� ĳ�������� ������ ũ�� �վ� ����ϱ�)
	}
	public static void paintShape(Shape s) {
		s.draw();
	}
	public static void paintLine(Line l) {
		l.draw();
	}
	public static void paintRect(Rect r) {
		r.draw();
	}
	public static void paintCircle(Circle c) {
		c.draw();
	}
	public static void main(String[] args) {
//		paintShape(new Shape());
//		paintLine(new Line());
//		paintRect(new Rect());
//		paintCircle(new Circle());
		//�θ��� draw�� �����ϰ� �ڽ��� draw�� ȣ�� �ǰ� �ִ� = �޼��� �������̵�
		//1.�̸��� ���ƾ� �Ѵ� 2. ����Ÿ�� ���ƾ� �Ѵ� 3. �Ű����� ���ƾ� �Ѵ�  = �θ�� �Ȱ��ƾ� �Ѵ�
		paint(new Shape());
		paint(new Line());
		paint(new Rect());
		paint(new Circle());
	}
}
