import java.util.Scanner;
import java.util.Stack;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine(); // enter
		while (t-- > 0) {
			String s = sc.nextLine();
			if (s.equals(""))
				System.out.println("Yes");
			else {
				Stack<Character> a = new Stack<Character>();
				for (int i = 0; i < s.length(); i++) {
					if (a.empty())
						a.push(s.charAt(i));
					else {
						if (a.peek() == '(' && s.charAt(i) == ')')
							a.pop();
						else if (a.peek() == '[' && s.charAt(i) == ']')
							a.pop();
						else
							a.push(s.charAt(i));
					}
				}
				if (a.empty())
					System.out.println("Yes");
				else
					System.out.println("No");
			}
		}
	}
}