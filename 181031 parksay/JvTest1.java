import java.util.Scanner;
class JvTest1
{
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	int jv, oc, jsp;
	double avg;
	System.out.print("Java ���� : ");
	jv = sc. nextInt();
	if (jv < 0 || jv > 100)
	{
		System.out.println("�߸� �Է��߽��ϴ�."); return;
	} 
	System.out.print("Oracle ���� : ");
	oc = sc. nextInt();
	if (oc < 0 || oc > 100)
	{
		System.out.println("�߸� �Է��߽��ϴ�."); return;
	} 
	System.out.print("JSP ���� : ");
	jsp = sc. nextInt();
	if (jsp < 0 || jsp > 100)
	{
		System.out.println("�߸� �Է��߽��ϴ�."); return;
	} 
	avg = (jv + oc + jsp)/(double)3 ;
	if ( avg <= 100 && avg >= 90 )
	{
		System.out.println("���� : " + (jv + oc + jsp) + " ��� : " + avg + " ��� : ��");
	}
	else if ( avg < 90 && avg >= 80 )
	{
		System.out.println("���� : " + (jv + oc + jsp) + " ��� : " + avg + " ��� : ��");
	}
	else if ( avg < 80 && avg >= 70 )
	{
		System.out.println("���� : " + (jv + oc + jsp) + " ��� : " + avg + " ��� : ��");
	}
	else if ( avg < 70 && avg >= 60 )
	{
		System.out.println("���� : " + (jv + oc + jsp) + " ��� : " + avg + " ��� : ��");
	}
	else
	{
		System.out.println("���� : " + (jv + oc + jsp) + " ��� : " + avg + " ��� : ��");
	}
	System.out.println("Hello World!");
	}
}
