package ps_java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class b_14502 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static String input;
	static int n;
	static int m;
	static int dx[] = {-1, 0, 1, 0};
	static int dy[] = {0, 1, 0, -1}; 
	static int arr[][];
	static int zeroCnt = 0;
	static int ans = 0;
	static LinkedList<Point> list = new LinkedList<>();
	public static void main(String[] args) throws Exception{
		input = br.readLine();
		st = new StringTokenizer(input, " ");
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[n][m];
		for(int i = 0; i<n; i++) {
			input = br.readLine();
			st = new StringTokenizer(input, " ");
			for(int j = 0; j<m; j++){
				arr[i][j] = Integer.parseInt(st.nextToken());
				if(arr[i][j]==0)
					zeroCnt++;
				
				else if(arr[i][j]==2)
					list.add(new Point(i,j));
				
			}
		}
		
		backTracking(0,0,0);
		bw.write(ans-3 + "\n");
		br.close();
		bw.close();
	}
	
	static void backTracking(int x, int y, int cnt) {
		if(cnt == 3) {
			bfs();
			return;
		}
		for(int i = x; i<n; i++) {
			for(int j = 0; j<m; j++)
				if(arr[i][j]==0) {
					arr[i][j]=1;
					backTracking(i,j,cnt+1);
					arr[i][j]=0;
				}
		}
	}
	static void bfs() {
		int safeZone = zeroCnt;
		Queue<Point> q = new LinkedList<>();
		int arr_copy[][] = new int[n][m];
		boolean visited[][] = new boolean[n][m];

		for(int i = 0; i<n; i++) {
			for(int j = 0; j<m; j++) {
				arr_copy[i][j] = arr[i][j];
				if(arr[i][j] == 2) {
					q.add(new Point(i,j));
					visited[i][j] = true;
				}
			}
		}
		
		
		while(!q.isEmpty()) {
			Point now = q.poll();
			for(int i = 0; i<4; i++) {
				int nx = now.x + dx[i];
				int ny = now.y + dy[i];
				if(nx<0||nx>=n||ny<0||ny>=m||visited[nx][ny]) continue;
				if(arr_copy[nx][ny]==0) {
					arr_copy[nx][ny] = 2;
					visited[nx][ny] = true;
					q.add(new Point(nx, ny));
					safeZone--;
				}
			}
		}
		ans = Math.max(ans, safeZone);
	}
	
	static class Point{
		int x;
		int y;
		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
}
