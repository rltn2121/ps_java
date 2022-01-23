package ps_java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class b_11729 {
	static int n;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		
		n = Integer.parseInt(br.readLine());
		br.close();
		
		int cnt = 1;
		for(int i = 0; i<n; i++)
			cnt*=2;
		
		bw.write(cnt - 1 + "\n");
		move(n, 1, 3, 2);
		bw.close();
	}
	
	static void move(int n, int from, int to, int temp) throws Exception{
		if(n==1) {
			bw.write(from + " " + to + "\n");
			return;
		}
		
		move(n-1, from, temp, to);
		bw.write(from + " " + to + "\n");
		move(n-1, temp, to, from);
	}
}
