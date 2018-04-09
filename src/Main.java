
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi " + args[0]);
		System.out.println();
		for (int i =1; i<100; i++) {
			boolean bool = false;
			if (i % 3 == 0) {
				System.out.print("Fizz");
				bool = true;
			}
			if (i % 5 == 0) {
				System.out.print("Buzz");
				bool = true;
			}
			if (bool) {
				System.out.println();
				bool = false;
			} else {
				System.out.println(String.valueOf(i));
			}
			
		}
	}

}
