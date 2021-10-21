package Week3;
import java.util.Random ;
import java.util.Scanner;

public class HeadTail {
	public static void main(String[] args) {
	
	String Coin ="";
	
	Random random = new Random();		
	int headortail = random.nextInt(2)+1;
	
	if(headortail == 1) {
			Coin = "H" ;	
	}

	if(headortail == 2) {
		    Coin = "T" ;	
}

	
	if(Coin.equals("T")) {
		System.out.println("Tail");
	}
	
	if(Coin.equals("H")) {
		System.out.println("Head");
	}
	
	
	
	
	
	
	
	}

}
