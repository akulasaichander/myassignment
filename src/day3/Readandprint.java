package day3;


import java.util.*;
class Readandprint{
    public static void main(String[] args) {
       
		 int a[]=new int[5]; 
		 try (Scanner sc = new Scanner(System.in)) {
			for(int i=0;i<5;i++)
			 a[i]=sc.nextInt();
		} 
		
		System.out.println("using for loop ");
		for(int i=0;i<5;i++)
			System.out.println(a[i]+" ");
		
		System.out.println("using for each loop");
		for(int x:a) 
			{ System.out.println(x+" "); }
	
		Sumaverage sa=new Sumaverage();
		Biggest b=new Biggest();
		Bubblesort bs=new Bubblesort();
		int x[]=bs.sort(a);
		System.out.println("sum = "+sa.sum(a));
		System.out.println("average = "+sa.average(a));
		System.out.println("biggest = "+b.big(a));
		System.out.println("sorted array  ");
		
		for(int y:x) 
		{ System.out.print(y+" "); }
		
	}
}