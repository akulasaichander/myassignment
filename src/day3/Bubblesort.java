package day3;

public class Bubblesort {
	
	
	public int[] sort(int a1[]) {
		
		for(int i=0;i<a1.length;i++) {
			for(int j=0;j<a1.length;j++) {
				if(a1[i]<a1[j]) 
				{
					int temp=a1[i];
					a1[i]=a1[j];
					a1[j]=temp;
			
				}
				else {
					//do nothing
				}
			}
		}
		return a1;
	}
}
