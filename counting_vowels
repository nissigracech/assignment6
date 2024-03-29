import java.util.*;
public class Counting_Vowels
{
	public static void main(String[] args) {
	    int arr[]=new int[5];
	    Arrays.fill(arr,0);
		Scanner input=new Scanner(System.in);
		String str=input.next();
		int count=0;
		str=str.toLowerCase();
		for(int i=0;i<str.length();i++){
		    char letter =str.charAt(i);
		    if(letter=='a'){
		        arr[0]++;
			    count++;
		    }else if(letter=='e'){
		        arr[1]++;
		        count++;
		    }else if(letter=='i'){
		        arr[2]++;
		        count++;
		    }else if(letter=='o'){
		        arr[3]++;
		        count++;
		    }else if(letter=='u'){
		        arr[4]++;
		        count++;
		    }
		}
		char arr1[]={'a','e','i','o','u'};
		for(int i=0;i<5;i++){
		    System.out.println("Vowel :"+arr1[i] +" Count of "+arr1[i]+" is : "+arr[i]);
		}
		System.out.println("Total no. of vowels : "+count);
	}
}
