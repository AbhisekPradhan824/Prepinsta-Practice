package prepinsta;

public class Prime_Number_in_1_to_100_04 {
	
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
		
		for(int i=3; i<Math.sqrt(num); i+=2) {
			if(num%i==0) {
				return false;
			}
		}
		
		return true;
	}
}
