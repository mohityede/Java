// write a program calculate percentage of the given student in CBSC board exam. his marks form 5 subject must be takesas input of keyword 
//(marks out of 100)
//calculatetar

import java.util.Scanner;



public class Main {

      public static void main(String[] args) {

		/*Scanner S = new Scanner(System.in);

		System.out.println("Enter your marks in English out of 100 : ");

		float a = S.nextFloat();

		System.out.println("Enter your marks in Science out of 100 : ");

		float b = S.nextFloat();

		System.out.println("Enter your marks in History out of 100 : ");

		float c = S.nextFloat();

		System.out.println("Enter your marks in Computer out of 100 : ");

		float d = S.nextFloat();

		System.out.println("Enter your marks in Hindi out of 100 : ");

		float e = S.nextFloat();

		float sum = a + b + c + d + e;

		float avg = sum / 5;

		System.out.println("The percentage is : " + avg); */

	
	//	int a = 5;
	//	float b = 6.524f;
	//	System.out.printf("The value of a is  %d  and The value of b is %f   " , a , b);

	/*String name = "Sakshi";
	name = name.toLowerCase();
	System.out.println(name.toLowerCase());*/

	/*int age = 8;
	if(age>18){
	System.out.println("this is can drive");
	}
	else{
		System.out.println("this is can not drive");  */

	Scanner S = new Scanner(System.in);

		System.out.println("Enter your marks in English out of 100 : ");

		float sub1 = S.nextFloat();

		System.out.println("Enter your marks in Science out of 100 : ");

		float sub2 = S.nextFloat();

		System.out.println("Enter your marks in maths out of 100 : ");

		float sub3 = S.nextFloat();

		float avg = (sub1+sub2+sub3)/3;

		if(avg>=40 && sub1>33 && sub2>33 && sub3>33){
			System.out.println("pass");
		}
		else{
			System.out.println("fail");
		}
	}
	
  
  
     }




