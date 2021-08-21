package techrel;

public class Demoprime {

	private int n;
	public Demoprime(int n)
	{
		super();
		this.n=n;
	}
	public boolean isPrime()
	{
		if(n<=1)
		{
			return false;
		}
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}


}
