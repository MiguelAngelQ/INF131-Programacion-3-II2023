import java.util.Scanner;
import java.util.Stack;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			int n = in.nextInt();
			int mx = 0; // O(1)
			in.nextLine();// enter
			Stack<String> pila = new Stack<String>();
			while (n-- > 0) {
				String s = in.nextLine();
				if (s.length() >= 3) {// es probable que sea un for
					if (s.substring(0, 3).equals("for")) {
						pila.push(s);
						mx = Math.max(mx, pila.size());
					}
				} else if (s.equals("}")) {
					pila.pop();
				}
			}
			if (mx == 0) {
				System.out.println("O(1)");
			} else {
				System.out.println("O(n^" + mx + ")");
			}
		}
	}
}