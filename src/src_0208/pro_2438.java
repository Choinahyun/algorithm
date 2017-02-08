package src_0208;
import java.util.Scanner;

public class pro_2438 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int x = 1;

		int num = scan.nextInt();
			
		for (int i =0; i<num; i++){

			for (int j=0; j<x; j++){
				System.out.print("*");
			}
			x++;
			System.out.println();
			}
	}
	
}
