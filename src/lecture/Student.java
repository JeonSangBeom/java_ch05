package lecture;
//��� ����
public class Student extends Person{//Person�� ��� �ްڴ�
	public Student() {
		System.out.println("���� Person�� ��ӹ��� �л� Ŭ����");
	}
	public void set() {
		this.age = 30; // this.�� ���� person���� ���� �� �ִ� ������ �� �� �ִ� 
		setWeight(80); //private�� set���� ��ȯ�Ͽ� ����Ѱű� ������ �տ� set�� �޼����̱� ������ ��ȣ�� ����� �ش�
		name = "�����";
		height=180;
		
		
	}

}
