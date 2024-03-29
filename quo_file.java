import java.util.*;
public class quo_rem
{
	public static void main(String[] args) {
		int n;
		System.out.print("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		if(n % 7 == 0 && n % 13 == 0){
		    System.out.printf("Number %d is divisible by 7 and 13 \n",n);
		    System.out.printf("Quotient when divided by 7 : %d\n", n / 7);
		    System.out.printf("Remainder when divided by 7 : %d\n",n % 7);
		    System.out.printf("Quotient when divided by 13 : %d\n", n /13);
		    System.out.printf("Remainder when divided by  13 : %d\n",n %13);
		}
		else{
		    System.out.printf("Number %d is not divisible by 7 and 13\n",n);
		}
		
	}
}
