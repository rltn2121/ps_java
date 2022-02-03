package ps_java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class b_15650 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static String input;
	static int n;
	static int m;
	static boolean visited[] = new boolean[10];
	static int arr[] = new int[10];
	public static void main(String[] args) throws Exception{
		input = br.readLine();
		st = new StringTokenizer(input, " ");
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		func(1,0);
		br.close();
		bw.close();
	}
	
	static void func(int now, int cnt) throws IOException {
		if(cnt==m) {
			for(int i = 0; i<m; i++)
				bw.write(arr[i] + " ");
			bw.write("\n");
			return;
		}
		
		for(int i = now; i<=n; i++) {
			if(visited[i]) continue;
			arr[cnt] = i;
			visited[i] = true;
			func(i+1, cnt+1);
			visited[i] = false;
		}
	}
}
