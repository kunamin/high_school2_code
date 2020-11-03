class subjectBit2409
{
	public static void main(String[] args) 
	{
		int n1=15678;
		int n2=4;
		int n3=16;
		int n4=(n1&n2)>>2;
		int n5=(n1&n3)>>4;
		
		System.out.println("15678의 세번째 비트는 "+n4);
		System.out.println("15678의 다섯번째 비트는 "+n5);
	}
}