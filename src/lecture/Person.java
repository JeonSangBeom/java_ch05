package lecture;

public class Person {
	//����������(������)�� ����
	private int weight;//�ܺο� ���� �ȵȴ� ���� getter/setter(�޼���)�� ����� �־�� �Ѵ�
	int age; // �տ� �ƹ��͵� ���� ������� default�� �ȴ�
	protected int height;
	public String name;
	
	//lombox( getter setter �� ���ϰ� ����� �� �ְ� �ϴ� ���̺귯�� - ���߿� ��ġ�Ͽ� �ַ� ����Ѵ�)
	//������ �Լ�(���� �ʱ�ȭ�Ҷ� ����� �ش� - ���� Ÿ���� ����)
	public Person() {
		System.out.println("���� ���"); 
	}
//	public Person(String name, int weight) {
//		System.out.println("���� ���"); //�̷������� ������ �Լ��� �̸� ���ϸ� ����� ���Ҷ� �����Կ� �̸��� �̸� ���� �� �ִ�
//	}
	//alt+shift+s getorset������ �ڵ� ���� ����
	public int getWeight() {//get�� �ҷ� ���� �ű� ������ ���� �Ű������� ���� �ʴ´�
		return weight; //�Ű������� ���� ������ this�� �����ϰ� ���� ����
	}
	public void setWeight(int weight) { //���� �����Ҷ� void ��� set�� �̿��Ͽ� private���� �ҷ��� ����ϰ� �Ѵ�
		this.weight = weight; //private���� �ٷ� ���� �ҷ��� ���� ������ �̷��� set�޼��带 �̿��Ͽ� ���� �ҷ��� �� �ִ�
	}
	
	//getter(���� �ޱ⸸ ��)/setter(���� �ް� �ٲ� �� ������ ���)
	

}
