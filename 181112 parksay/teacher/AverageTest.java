

import java.util.Scanner;

//���� 10���� �Է¹޾�, ��հ� 10 �̻� ���̳��� �������� ���. (�迭, �ݺ���)
public class AverageTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int array[] = new int[10];
		int tot;
		double avg, value;
		
		//�Է� 
		for (int i = 0; i < array.length; i++) {
			System.out.print("�迭[" + i + "] : ");
			array[i] = input.nextInt();
		}

		//��� ���ϱ�
		tot = 0;
		for (int i = 0; i < array.length; i++) {
			tot += array[i];
		}
		avg = (double) tot / array.length;
		
		//��հ� 10 �̻� ���̳��� �� ���ϱ�
		System.out.println("��� : " + avg);
		System.out.print("��հ� 10 �̻� ���̳��� �� : ");
		
		for (int i = 0; i < array.length; i++) {
			value = array[i] - avg;
			if (value <= -10 || value >= 10) {
				System.out.print(array[i] + " ");
			}
		}
	}

}
