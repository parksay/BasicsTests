import java.util.Scanner;
class ArrayAvg
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int[] arrinput;
		int i;
		arrinput = new int[10];

		//����ڷκ��� ���� 10�� �Է� �ޱ�
		for(i = 0; i < 10; i = i + 1)
		{
			arrinput[i] = sc. nextInt();
		}

		//��� ���ϱ� ���� �� �迭������ ���� ���ϱ�
		int sum = 0;
		for(i = 0; i < 10; i = i + 1)
		{
			sum = sum + arrinput[i];
		}
		double avg = (double)sum/10;


		//�Է� ���� �迭���� ��� ���
		for(i = 0; i < 10; i = i + 1)
		{
			System.out.println("�迭[" + i + "]: " + arrinput[i]);
		}


		System.out.println("\n���: " + avg + "\n");
		System.out.print("��հ� 10 �̻� ���̳��� �� : ");

		//��հ����� 10�̻� ũ�ų�, 10�̻� ���� �迭���� ���
		for(i = 0; i < 10; i = i + 1)
		{
			if(arrinput[i] >= avg + 10 || arrinput[i] <= avg + 10 )
			{
				System.out.print(arrinput[i] + "\t");
			}
		}	//�ڷ� ������ "\t"�� ���� ��µǴ� ������ �𸣰ڽ��ϴ� �Ф�

		System.out.println("\nHello BIG World!");
	}
}
