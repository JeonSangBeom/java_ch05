package lecture;
// ��� ����
public class ColorPointTest {

	public static void main(String[] args) {
		Point point = new Point();
		point.set(10, 10); // private�� ���� �ֱ� ������ set�� �ٿ� ��� �Ѵ� / ����
		point.showPoint();//�����ص� ��ǥ���  /���
		//������ �Լ� -����� �Բ� �ٷ� ������ �Լ�
		ColorPoint colorPoint = new ColorPoint(20,20,"blue");
//		ColorPoint colorPoint = new ColorPoint();// �θ� Ŭ�������� �̸� �Լ� ������ ���� �Է��ϸ� �Ʒ� �̿��� �޼��������� ���� �� �ִ� 
		//������ �����ϰ� ���� �տ� Ÿ���� ���� = �״��� �÷� ����Ʈ��� Ŭ������ �����Ҷ��� �տ� new�� ���δ� = �̰��� ������ �Լ��� �Ѵ� 
//		colorPoint.set(20, 20); 
//		colorPoint.setColor("blue");
		colorPoint.showColorPoint();
	}

}
