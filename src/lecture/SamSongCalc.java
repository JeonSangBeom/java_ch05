package lecture;

//추상 클래스 설명(2)
public class SamSongCalc extends Calculator {//SamSongCalc 오류 발생시 커서를 가져다 대서 위에 나오는 것을 선택하면 알아서 오버라이드가 세팅되어 나타난다

	public int add(int a, int b) {
		return a + b;
	}
	@Override
	public int subtract(int a, int b) {
		int result = a > b ? a - b : b - a;
		return result;
	}
	@Override
	public double avg(int[] arr) {
		double sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		return sum/arr.length;
	}
	public static void main(String[] args) {
		SamSongCalc sc = new SamSongCalc();
		System.out.println(sc.add(10,20));
		System.out.println(sc.subtract(23,78));
		System.out.println(sc.avg(new int[] {98,95,87}));
	}
}
