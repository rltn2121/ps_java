package ps_java;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class b_1260 {
	static String input;
	static int n;
	static int m;
	static int v;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static ArrayList<Integer>[] list;
	static Queue<Integer> q;
	static boolean visited[];
	public static void main(String[] args) throws Exception{
		
		input = br.readLine();
		StringTokenizer st = new StringTokenizer(input, " ");
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		v = Integer.parseInt(st.nextToken());
		
		init();
		
		for(int i = 0; i<m; i++) {
			input = br.readLine();
			st = new StringTokenizer(input, " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			list[a].add(b);
			list[b].add(a);
		}
		
		for(int i = 1; i<=n; i++) 
			list[i].sort(Comparator.naturalOrder());
		
		
		dfs(v);
		
		visited = new boolean[n+1];
		bw.write("\n");
		bfs(v);
		bw.close();
	}
	
	public static void init() {
		list = new ArrayList[n+1];
		q = new LinkedList<>();
		for(int i = 0; i<n+1; i++) {
			list[i] = new ArrayList<>();
		}
		visited = new boolean[n+1];
	}
	
	public static void dfs(int n) throws IOException {
		if(visited[n]) return;
		
		visited[n] = true;
		bw.write(n + " ");
		
		for(int next : list[n]) {
			dfs(next);
		}
	}
	
	public static void bfs(int n) throws IOException {
		q.add(n);
		bw.write(n + " ");
		visited[n] = true;
		while(!q.isEmpty()) {
			int now = q.peek();
			q.remove();
			for(int i : list[now]) {
				if(visited[i]) continue;
				q.add(i);
				bw.write(i + " ");
				visited[i] = true;
			}
		}
	}
}
