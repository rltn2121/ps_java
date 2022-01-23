package ps_java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class b_3052 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int ans = 0;
		boolean[] arr = new boolean[42];
		
		for(int i = 0; i<10; i++) {
			int now = Integer.parseInt(br.readLine());
			if(arr[now%42]==false) {
				ans++;
				arr[now%42]=true;
			}
		}
		
		bw.write(ans+"\n");
		br.close();
		bw.close();
	}
}
