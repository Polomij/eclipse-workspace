
public class Hello 
{

	public static void main(String[] args) 
	{
		int sum=0;
		
		for(int i=1; i<=10; i++)
		{
			sum= sum+i;
			System.out.print(sum);
			System.out.print(" ");
			System.out.println(i);
		}
		System.out.print("Ostateczny wynik:");
		System.out.println(sum);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
	}
}