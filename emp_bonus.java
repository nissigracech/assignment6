import java.util.*;
public class emp_Bonus
{
	public static void main(String[] args) {
		int current_year, join_year,diff;
		Scanner sc = new Scanner(System.in);
		current_year = sc.nextInt();
		join_year = sc.nextInt();
		
		diff = current_year - join_year;
		
		if(diff > 5){
		    System.out.println("Bonus of Rs. 5000 is awarded");
		}
		else if (diff >=3 && diff <= 5){
		    System.out.println("Bonus of Rs. 3000 is awarded");
		}
		else if(diff < 3){
		    System.out.println("No Bonus is awarded");
		}
	}
}
