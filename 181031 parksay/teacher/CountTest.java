
import java.util.Scanner;

//������ 10�� �ݺ� �Է¹޾� �� �� 3�� ����� ������ ���Ѵ�.
public class CountTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		int cnt = 0;
		
		for (int i = 0; i < 10; i++) {
			System.out.print("���� �Է� : ");
			n = input.nextInt();
			if (n % 3 == 0) {
				cnt++;
			}
		}
		
		System.out.println("3�� ��� ���� : " + cnt);

	}

}
