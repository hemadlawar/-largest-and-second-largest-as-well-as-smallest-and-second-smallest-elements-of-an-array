/*Q/ ask user to enter the size of array and declare array size take that
 * input from the user in that array and print largest(maximum)and second largest elements
 * as well smallest (minimum) and  second smallest elements from array
 * for E.g if you have an arrya =[2,4,6,8,10]
 * the smallest should 2 and second smallest should 4 
 * and largest should 10 and second largest shoud 8
 */



import java.util.Scanner;
public class Find_Second_largest_and_smallest_number{
public static void main(String[] args) {
		System.out.print("write the size of array is : ");
		Scanner sc=new Scanner(System.in);
		int arrSize=sc.nextInt();
		
		int array []=new int[arrSize]; // array size is equal this size which has inserted by user
		
		for(int i=0;i<=arrSize-1;i++) {
			array[i]=sc.nextInt();
			}
		
		int max=array[0];
		int min=array[0];
		int second_largest_number=array[0];
		int second_smallest_number=array[arrSize-1];
		for(int i=0;i<=arrSize-1;i++)	{
			if(array[i]>=max) { max=array[i];
		                       }
			if(array[i]<=min) {min=array[i];
			 }
			 }
		for(int i=0; i<=array.length-1;i++) {
			if(array[i]>=second_largest_number&&array[i]<max) {
				second_largest_number=array[i];
				
			}if(array[i]>min&&array[i]<second_smallest_number) {
				second_smallest_number=array[i];
			}
			}
		System.out.println("the maximum value is :"+max + " the second largest value is : " + second_largest_number);
	    System.out.println("the minimum value is :"+min + " the second smallest value is : " + second_smallest_number);
		} 




}