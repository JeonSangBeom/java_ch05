package casting;
//up down casting ���� / �������� ����ҋ� ���� ����Ѵ�
class Person{
	String name;
	String id;
	
	public Person(String name) {
		this.name = name;
	}
}
class Student extends Person{
	 String grade;
	 String department;
	 
	 public Student(String name) { //�����ڸ� ����� �־� �� Ŭ���� ������� ���� ������ �߻����� �ʴ´�(�⺻ ������ ȣ��(����Ʈ))
		 super(name);//�⺻������ super()�� ȣ�������� �� ���� ���� ������ �̷��� �����ϴ� �Ű������� ���� �ξ�� �Ѵ�
	 }
}

public class UpcastionTest {

	public static void main(String[] args) {
		Person person; // person�� �̸� ������ ����  
		Student student = new Student("�强ȣ");
		person = student; // upcasting�� ���ְ� ���� ��ȭ �����ϴ�
		person.name="�嵿��";
		System.out.println(person.name); //upcasting�� ���� �ö󰡰� ���ش� �׷��� ������ ������ Ư�� grade, department�� �� �� ���� �ȴ�
		 //�л��� ����̱� ������ ����ȯ���� �ٷ� ��ĳ������ �����ϴ�
		
		Person person02 = new Student("�̼���");
		Student student02;
		student02 = (Student)person02; // downcasting = �ݵ�� Ÿ�� ��ȯ�� �ʿ��ϴ�(����� ������ �л��̶�� ���� �ƴϱ� ������ �� ��ȯ�� ���־�� �Ѵ�)
		
		
	}

}
