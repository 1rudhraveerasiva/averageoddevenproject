package averageoddeven;

import java.util.Scanner;
public class oddevenaverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int num=0;
		avgOddEvenSum(num);
	}
	
	public static int avgOddEvenSum(float num) {
		
		int n, i,odd=0,even=0; 
		double sum,avg;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		n = sc.nextInt(); 
		if(n < 0) { 
			System.out.println("Invalid array size"); 
			System.exit(0); 
			} 
		else 
		{
			int a[]=new int[n];
			for(i = 0; i< n; i++) 
			{
				a[i] = sc.nextInt(); 
				if(a[i] < 0)
				{

            System.out.println("Invalid input");
            System.exit(0);
}
}
          for(i=0;i<n;i++)
{
           if(a[i]%2==0)
           odd=odd+a[i];
else
           even=even+a[i];
}
           sum=odd+even;
           avg = sum/2;
          System.out.printf("%.2f",avg);


	}
		return odd;
		
	
}
}
