
import java.util.Scanner;

//ȯ�� ���ϱ� (���, ������)
public class ExchangeRate {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double won = 1000;		//1000��
		double dollar = 0.9;	//1000�� -> �޷�
		double yen = 102;		//1000�� -> ��ȭ
		double euro = 0.78;		//1000�� -> ����ȭ
		
		int choice;
		int incur;
		double outcur;
		
		System.out.print("�� ���� �ݾ� �Է� : ");
		incur = input.nextInt();
		
		if (incur < 0) {
			System.out.println("�߸� �Է��߽��ϴ�.");
			return;
		}
		
		System.out.print("ȯ���� ȭ�� (1:�޷�, 2:��ȭ, 3:����ȭ) : ");
		choice = input.nextInt();

		switch (choice) {
			case 1: 
				outcur = incur * dollar / won;
				System.out.println(incur + "���� " + outcur + "�޷��Դϴ�.");
				break;
			case 2: 
				outcur = incur * yen / won;
				System.out.println(incur + "���� " + outcur + "���Դϴ�.");
				break;
			case 3: 
				outcur = incur * euro / won;
				System.out.println(incur + "���� " + outcur + "�����Դϴ�.");
				break;
			default: 
				System.out.println("�߸� �Է��߽��ϴ�.");
		}

	}
}
