package selenium;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {

	for (int j = 1; j <=100; j++) {
		
		int no=j;
		int count=0;
	for (int i =1; i <=no; i++) {
		if(no%i==0)
		{
			count++;
		}
	}
	if(count==2)
	{
		System.out.println(no+" its a prime no");
	}
	else
	{
		System.out.println(no+" its  not a prime no");	
	}
	}
	}

}
