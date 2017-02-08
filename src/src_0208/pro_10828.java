package src_0208;
import java.util.Scanner;

public class pro_10828 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean b = true;
		int len = 0;
		
		if (b == true) {
			len = scan.nextInt();
			b = false;
		}	
		
		String str = null;
		int num = 0;
		int top = -1;
		int [] arr;
		arr = new int [10000];
		
		for (int i=0; i<len; i++){
		
			str = scan.next();
			
			if (str.equals("push") == true) {
				num = scan.nextInt();
				top++;
				arr[top] = num;
			}
			else if (str.equals("pop") == true) {
				if (top == -1) {
					System.out.println(-1);
					continue;
				}
				System.out.println(arr[top]);
				arr[top] = 0;
				top--;
			}
			else if (str.equals("empty") == true) {
				System.out.println(empty(top));
			
			}
			else if (str.equals("size") == true) {
				System.out.println(top+1);
			}
			else if (str.equals("top") == true) {
				System.out.println(top(top, arr));
			}
			else {
				System.out.println("다시 입력하세요.");
			}
		}

	}

	public static int empty(int top) {
		if (top == -1) {
			return 1;
		}
		else {
			return 0;	
		}
	}

	public static int top (int top, int arr[]) {
		if (top == -1) {
			return -1;
		}
		else {
			return arr[top];
		}
	}

	
}

