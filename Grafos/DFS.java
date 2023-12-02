import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static ArrayList<Integer> grafo[] = new ArrayList[1000];
	public static boolean vis[] = new boolean[1000];
	public static int n;// nro de nodos
	private static Scanner in;

	public static void dfs(int nodo) {
		//System.out.println(nodo);
		vis[nodo] = true;// lo visito
		for (int i = 0; i < grafo[nodo].size(); i++) {
			int v = grafo[nodo].get(i);
			if (!vis[v])// vis[v] == false
				dfs(v);
		}
	}

	public static void main(String[] args) {
		in = new Scanner(System.in);
		n = in.nextInt();
		int m = in.nextInt();// el numero de arcos/aristas

		for (int i = 1; i <= n; i++) {
			vis[i] = false;
			grafo[i] = new ArrayList<Integer>();
		}

		while (m-- > 0) {
			int a = in.nextInt();
			int b = in.nextInt();
			grafo[a].add(b);// grafo dirigido solo esta linea
			// grafo[b].add(a);
		}
		
		int consultas = in.nextInt();
		while(consultas -->0) {
			for (int i = 1; i <= n; i++) 
				vis[i] = false;
			//puedo llegar de "a" a "b"?
			int a = in.nextInt();
			int b = in.nextInt();
			dfs(a);
			if(vis[b])
				System.out.println("Si puedes");
			else
				System.out.println("No puedes");
		}
	}

}
