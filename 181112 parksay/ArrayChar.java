class ArrayChar 
{
	public static void main(String[] args) 
	{

		int[] arrChar;
		arrChar = new int[10];
		int i;

		//�迭�� �� ���� 65~90 ���� ���� �������� �Է�
		for (i = 0; i < 10;	i = i + 1)
		{
			arrChar[i] = (int)(26*Math.random() + 65);
		}

		//�迭 ���
		System.out.print("���� ��: ");
		for (i = 0; i < 10;	i = i + 1)
		{
			System.out.print((char)arrChar[i] + "  ");
		}

		//65~70�̰ų� 81~90�� ���ڴ� 42�� ����
		for (i = 0; i < 10;	i = i + 1)
		{
			if(arrChar[i] > 64 && arrChar[i] < 71)
			{
				arrChar[i] = 42;
			}
			else if (arrChar[i] > 80 && arrChar[i] < 91)
			{
				arrChar[i] = 42;
			}
			
		}

		//�迭 �ٽ� ���
		System.out.print("\n���� ��: ");
		for (i = 0; i < 10;	i = i + 1)
		{
			System.out.print((char)arrChar[i] + "  ");
		}

		System.out.println("\nHello BIG World!");
	}
}
