package Week3;

public class nigga {

	public static boolean isPrime(int N) {

					
		for(int i = 2; i <= N-1 ; i++) {
				
			if ((N%i) == 0) {	
				return false;
			}		
		}
	
		return true;	
	}
	
	public static void main(String[]args) {
		int N= 9871;
		
		
		System.out.println("Is "+N+ " Prime? ");

		if(isPrime(N) == false) {
			System.out.println("no");									
		}

					
		else {
			System.out.println("ye");
			int count= PrintNumbers(N);
			System.out.println("count is..."+count);

		}
		
	}
	
	public static int PrintNumbers(int Prime) {
		int counter=0;
		for (int i = 2; i <=Prime-1 ; i++) {
			if(isPrime(i)==true) {
				System.out.println(i);
				counter=counter+1;
			}
			if(isPrime(i)==false) {
				
			}
			
		}
		return counter;

	}

}
