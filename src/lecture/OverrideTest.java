package lecture;
//override ����
class Weapon{
	protected int fire() {
		return 1;
	}
}

class cannon extends Weapon{
	@Override // �����ٴ� �����̴�
	protected int fire() {
		return 10;
	}
	
}

public class OverrideTest {

	public static void main(String[] args) {
		Weapon weapon = new Weapon();
		System.out.println("�⺻ ������ �������� "+weapon.fire()+"�Դϴ�.");
		Weapon cannon = new cannon();
		System.out.println("�⺻ ������ �������� "+cannon.fire()+"�Դϴ�.");
	}

}
