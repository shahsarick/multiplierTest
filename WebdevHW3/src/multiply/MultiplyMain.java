package multiply;
import java.util.Scanner; 
public class MultiplyMain {
	static int c = 0;
	static int a= 0; 
	static int b=0;

	public static class MultiplyMethod{
		public int getMult(){
			Scanner input = new Scanner(System.in); 
			System.out.println("Enter in the first integer to multiply: "); 
			a = input.nextInt(); 	
			System.out.println("Enter in the second integer to multiply: ");
			b = input.nextInt(); 	
			c = a*b;
			return c;
				
		}
	public static void main(String args[]) {
			MultiplyMethod m = new MultiplyMethod();
			m.getMult();
			System.out.println("The product is " + c);
			System.out.println("hello");
		}
	}
}
