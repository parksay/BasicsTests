import java.util.Scanner;
class Change
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ���� �ݾ� �Է� : ");

		int money = sc. nextInt();	
		if (money < 1)
		{
			System.out.print("�߸� �Է��ϼ̽��ϴ�");
			return;
		}

		System.out.print("ȯ���� ȭ�� ����(1:�޷�, 2:��ȭ, 3:����ȭ): ");

		int choice;
		int change;
		choice = sc. nextInt();
		switch ( choice )
		{
		case 1 : System.out.print(money + "���� " + money/1000*0.9 + "�޷��Դϴ�"); break;
		case 2 : System.out.print(money + "���� " + money/1000*102 + "��ȭ�Դϴ�"); break;
		case 3 : System.out.print(money + "���� " + money/1000*0.78 + "����ȭ�Դϴ�"); break;
		default : System.out.println("�߸� �Է��ϼ̽��ϴ�"); return;
		}

		System.out.println("\nHello BIG World!");
	}
}
