import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		// Eliminar elementos repetidos mediante el vector de ocurrencias
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int occ[] = new int[100000 + 1];
		for (int i = 0; i < 100000 + 1; i++) {
			occ[i] = 0;
		}
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
			occ[a[i]] += 1;
		}
		Vector<Integer> v = new Vector<Integer>();
		for (int i = 0; i < 100000 + 1; i++) {
			if (occ[i] > 0)
				v.add(i);
		}
		for (int i = 0; i < v.size(); i++)
			System.out.print(v.get(i) + " ");
		System.out.println();
	}
}