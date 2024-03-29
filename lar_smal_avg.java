import java.util.*;
public class lar_small_avg
{
	public static void main(String[] args) {
		int n,largest,smallest,sum =0;
		System.out.print("Enter the no. of numbers : ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
	
	    int [] numbers = new int[n];
	    for (int i= 0;i < n; i++){
	        numbers[i] = sc.nextInt();
	    }
	    for(int i =0;i<n;i++){
	        sum += numbers[i];
	    }
	    int avg = sum / n;
	    
	    largest = numbers[0];
	    smallest = numbers[0];
	    
		for(int i =0; i< n; i++){
		    if(numbers[i] > largest){
		        largest = numbers[i];
		    }
		    
		    if(numbers[i] < smallest){
		        smallest = numbers[i];
		    }
		}
		
		System.out.printf("Largest number : %d\n",largest);
		System.out.printf("Smallest number : %d\n",smallest);
		System.out.printf("Average of numbers : %d",avg);
	}
}
