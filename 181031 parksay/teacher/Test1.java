import java.util.Scanner;

//����1
public class Test1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int java, oracle, jsp, tot;
		double avg;
		String grade;
		
		System.out.print("Java ���� : ");
		java = input.nextInt();
		System.out.print("Oracle ���� : ");
		oracle = input.nextInt();
		System.out.print("JSP ���� : ");
		jsp = input.nextInt();
		
		if (java < 0 || java > 100 || oracle < 0 || oracle > 100 || jsp < 0 || jsp > 100) {
			System.out.println("�߸� �Է��߽��ϴ�.");
		}
		else {
			tot = java + oracle + jsp;
			avg = tot / 3.0;
		

			if (avg >= 90)
				grade = "��";
			else if (avg >= 80)
				grade = "��";
			else if (avg >= 70)
				grade = "��";
			else if (avg >= 60)
				grade = "��";
			else
				grade = "��";		

			System.out.println("���� : " + tot + " ��� : " + avg + " ��� : " + grade);
		}
	}

}
