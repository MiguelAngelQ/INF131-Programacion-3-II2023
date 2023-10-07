import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		// int t = in.nextInt();
		while (in.hasNext()) {
			Set<Integer> s = new HashSet<Integer>();
			int n = in.nextInt();
			int v[] = new int[n];
			for (int i = 0; i < n; i++) {
				v[i] = in.nextInt();
			}
			Stack<Integer> pila = new Stack<>();
			for(int i = n - 1; i >= 0; i--) {
				if(!s.contains(v[i])) {
					s.add(v[i]);
					pila.push(v[i]);
				}
			}
			System.out.println(pila.size());
			while(!pila.empty()) {
				System.out.print(pila.peek()+" ");
				pila.pop();
			}
			System.out.println();
		}
	}
}