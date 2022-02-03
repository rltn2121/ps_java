package ps_java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class b_15651 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static String input;
	static int n;
	static int m;
	static int arr[] = new int[10];
	public static void main(String[] args) throws Exception{
		input = br.readLine();
		st = new StringTokenizer(input, " ");
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		func(1, 0);
		br.close();
		bw.close();
	}
	static void func(int now, int cnt) throws IOException {
		if(cnt==m) {
			for(int i = 0; i<cnt; i++)
				bw.write(arr[i] + " ");
			bw.write("\n");
			return;
		}
		for(int i = 1; i<=n; i++) {
			arr[cnt] = i;
			func(i+1, cnt+1);
		}
	}
}
