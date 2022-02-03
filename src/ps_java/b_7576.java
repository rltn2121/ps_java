package ps_java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class b_7576 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static String input;
	static Queue<Point> q = new LinkedList<>();
	static int n;
	static int m;
	static int arr[][];
	static int dx[] = {-1, 0, 1, 0};
	static int dy[] = {0, 1, 0, -1};
	static int ans = 0;
	static int zero_cnt = 0;
	static boolean visited[][];
	public static void main(String[] args) throws Exception{
		init();
		
		bfs();
		
		br.close();
		bw.close();
	}
	
	static class Point{
		int x;
		int y;
		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	
	static void init() throws IOException {
		input = br.readLine();
		st = new StringTokenizer(input, " ");
		
		m = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		
		arr = new int[n][m];
		visited = new boolean[n][m];
		for(int i = 0; i<n; i++) {
			input = br.readLine();
			st = new StringTokenizer(input, " ");
				
			for(int j = 0;j <m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken()); 
				if(arr[i][j] == 1) {
					q.add(new Point(i, j));
					visited[i][j] = true;
				} else if(arr[i][j] == 0)
					zero_cnt++;
			}
		}
	}
	
	static void bfs() throws IOException {
		while(!q.isEmpty()) {
			int size = q.size();
			if(zero_cnt == 0) {
				bw.write(ans + "\n");
				return;
			}
			while(size-- > 0) {
				Point now = q.poll();
				
				
				for(int i = 0; i<4; i++) {
					int nx = now.x + dx[i];
					int ny = now.y + dy[i];
					if(nx<0||nx>=n||ny<0||ny>=m||visited[nx][ny]) continue;
					
					if(arr[nx][ny] == 0) {
						arr[nx][ny] = 1;
						q.add(new Point(nx, ny));
						visited[nx][ny] = true;
						zero_cnt--;
					}
				}
			}
			ans++;
			
		}
		
		bw.write(-1 + "\n");
	}
}
