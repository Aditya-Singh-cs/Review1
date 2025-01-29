import java.util.*;
class SecondHighest{
	public static void main(String args[]){
	   Scanner input=new Scanner(System.in);
	   int[] array=new int[10];
	   int max=0,secondHighest=0;
	   System.out.println("Enter 10 numbers");
	   for(int i=0;i<10;i++){
	   array[i]=input.nextInt();
	   }
	   for(int i=0;i<10;i++){
	   if(array[i]>max){
	   max=array[i];
	   }
       	   }
	   for(int i=0;i<10;i++){
	   if(array[i]>secondHighest && array[i]!=max){
		secondHighest=array[i];
	   }
	   }
	   System.out.println("The second Highest Elemet is "+secondHighest);
	}
}
