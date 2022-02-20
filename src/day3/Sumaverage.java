package day3;

public class Sumaverage {
	
 public int sum(int a[]) {
	 int sum=0;
	 for(int x:a)
		 sum+=x;
	 
	 return sum;
 }
 public int average(int a[]) {
	 int sum=0;
	 for(int x:a)
		 sum+=x;
	 
	 return sum/a.length;
 }
	
}
