S

//char�� �迭�� ���ĺ� ���Ƿ� �����ϰ� A~F, Q~Z ������ ���ڴ� ��� *�� ����
public class AlphabetTest {

	public static void main(String[] args) {
		char array[] = {'A','I','D','G','U','B','J','S','T','H'};
		
		System.out.print("* ���� �� : ");
		System.out.println(array);
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] >= 'A' && array[i] <= 'F' || array[i] >= 'Q' && array[i] <= 'Z') {
				array[i] = '*';
			}
		}
		
		System.out.print("* ���� �� : ");
		System.out.println(array);
	}
}
