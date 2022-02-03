package ps_java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class b_2178 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static String input;
	static int arr[][];
	static boolean visited[][];
	static Queue<Point> q = new LinkedList<>();
	static int dx[] = {-1, 0, 1, 0};
	static int dy[] = {0, 1, 0, -1};
	static int ans = 0;
	public static void main(String[] args) throws Exception{
		input = br.readLine();
		st = new StringTokenizer(input, " ");
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		arr = new int[n][m];
		visited = new boolean[n][m];
		for(int i = 0; i<n; i++) {
			input = br.readLine();
			st = new StringTokenizer(input);
			for(int j = 0; j<m; j++)
				arr[i][j] = input.charAt(j)-'0';
		}
		
		q.add(new Point(0,0));
		visited[0][0] = true;
		while(!q.isEmpty()) {
			ans++;
			int size = q.size();
			while(size-- > 0) {
				Point now = q.poll();
				if(now.i == n-1 && now.j == m-1) {
					bw.write(ans + "\n");
					bw.close();
					return;
				}
				for(int i = 0; i<4; i++) {
					int nx = now.i + dx[i];
					int ny = now.j + dy[i];
					if(nx<0 || nx>=n || ny<0 || ny>=m || visited[nx][ny]) continue;
					if(arr[nx][ny] == 1) {
						q.add(new Point(nx, ny));
						visited[nx][ny] = true;
					}
				}
			}
		}
		
		br.close();
	}
	static class Point {
		int i;
		int j;
		public Point(int i, int j) {
			this.i = i;
			this.j = j;
		}
	}
}
