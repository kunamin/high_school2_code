import java.util.Scanner;
class player
	{
	private int ü��;
	private int ������;

	public player(int ü��, int ������)
		{
		this.ü��=ü��;
		this.������=������;
		}

	public void eat(int a)
		{
		ü�� = ü�� +a;
		}
	
	public void fight()
		{
		������++;
		ü��--;
		}

	public void show()
		{
		System.out.println("�÷��̾��� ü�� : "+ü��);
		System.out.println("�÷��̾��� ������ �� : "+������);
		}

	}

public class game2409
	{

	public static void main(String args[])
		{
		for(int i=0; i<1000; i++)
		{
		System.out.println("player�� �����ϰڽ��ϴ�. ü�°� �������� �Է����ּ���!");
		Scanner in = new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		player p1= new player(a, b);
		System.out.println("player�� ���̰ڽ��ϴ�. ���� ���� �Է����ּ���!");
		int c=in.nextInt();
		p1.eat(c);
		System.out.println("player���� ������ ��Ű�ڽ��ϱ�? ���� Ƚ���� �Է����ּ���!(0�� ��������.)");
		int d=in.nextInt();
		for(int i=0; i<d; i++)
			{
			p1.fight();
			}

		p1.show();
		}
			
		}

	}