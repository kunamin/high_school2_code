import java.util.Scanner;
class player
	{
	private int 체력;
	private int 아이템;

	public player(int 체력, int 아이템)
		{
		this.체력=체력;
		this.아이템=아이템;
		}

	public void eat(int a)
		{
		체력 = 체력 +a;
		}
	
	public void fight()
		{
		아이템++;
		체력--;
		}

	public void show()
		{
		System.out.println("플레이어의 체력 : "+체력);
		System.out.println("플레이어의 아이템 수 : "+아이템);
		}

	}

public class game
	{

	public static void main(String args[])
		{
		System.out.println("player를 생성하겠습니다. 체력과 아이템을 입력해주세요!");
		Scanner in = new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		player p1= new player(a, b);
		System.out.println("player를 먹이겠습니다. 먹일 양을 입력해주세요!");
		int c=in.nextInt();
		p1.eat(c);
		System.out.println("player에게 전투를 시키겠습니까? 전투 횟수를 입력해주세요!(0은 전투안함.)");
		int d=in.nextInt();
		for(int i=0; i<d+1; i++)
			{
			p1.fight();
			}

		p1.show();
			
		}

	}