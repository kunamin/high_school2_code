import java.util.Scanner;
class array2409
	{
	public static void main(String args[])
		{
		double a=0;
		String[] name=new String[10];
		Scanner in1= new Scanner(System.in);
		System.out.println("10���� �̸��� �Է����ּ���");
		for(int i=0; i<10; i++)
		{name[i]=in1.next();}

		int[] num=new int[10];
		Scanner in2= new Scanner(System.in);
		System.out.println("10���� ���ڸ� �Է����ּ���");
		for(int i=0; i<10; i++)
		{num[i]=in2.nextInt();
		a=a+num[i];}

		for(int i=0; i<10; i++)
		{System.out.println(name[i]+"�� ������ "+num[i]);}
		System.out.println("���� : "+a);
		System.out.println("��� : "+a/10);
		}
	}