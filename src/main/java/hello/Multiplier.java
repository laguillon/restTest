package hello;

public class Multiplier {

	public int a;
	public int b;
	public int answer;
	
	public Multiplier(int a, int b)
	{
		this.a = a;
		this.b = b;
		this.answer = a * b;
	}
	
	public int GetA()
	{
		return a;
	}
	
	public int GetB()
	{
		return b;
	}
	
	public int GetAnswer()
	{
		return answer;
	}
}
