import java.util.*;
public class lib_fine
{
	public static void main(String[] args) {
		int books_late,days;
		Scanner sc = new Scanner(System.in);
		books_late = sc.nextInt();
		days = sc.nextInt();
	
		if(days <= 7){
		    System.out.printf("FINE : %d paise",books_late * 50);
		}
		
		else if(days >= 8 && days <= 14){
		    System.out.printf("FINE : %d rupees",books_late * 1);
		}
		
		else if(days > 14 && days <=21 ){
		    System.out.printf("FINE : %d rupees",books_late * 5);
		}
		
		else if(days > 21){
		    System.out.printf("Your membership is cancelled");
		}
	}
}
