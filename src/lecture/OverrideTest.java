package lecture;
//override 설명
class Weapon{
	protected int fire() {
		return 1;
	}
}

class cannon extends Weapon{
	@Override // 덮어씌운다는 개념이다
	protected int fire() {
		return 10;
	}
	
}

public class OverrideTest {

	public static void main(String[] args) {
		Weapon weapon = new Weapon();
		System.out.println("기본 무기의 데미지는 "+weapon.fire()+"입니다.");
		Weapon cannon = new cannon();
		System.out.println("기본 무기의 데미지는 "+cannon.fire()+"입니다.");
	}

}
