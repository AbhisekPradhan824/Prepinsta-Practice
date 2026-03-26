package prepinsta;

public class Prime_Number_in_1_to_100_02 {
	
	public static void main(String[] args) {
		for(int i=1; i<=100; i++) {
			if(isPrime(i)) {
				System.out.print(i + " ");
			}
		}
		
	}

static boolean isPrime(int num) {
		
		if(num<2) {
			return false;
		}
		
		for(int i=2; i<num/2; i++) {
			if(num%i==0) {
				return false;
			}
		}
		
		return true;
	}
}
