package day3;

public class Biggest {
	public int big(int a[]) {
		int max=a[0];
		
		for(int x:a)
		{
			if(x>max)
				max=x;
		}
		
		return max;
	}
}
