package ps_java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class b_1546 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int sum = 0;
		int max = -1;
		
		String input = br.readLine();
		int n = Integer.parseInt(input);
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i<n; i++) {
			int now = Integer.parseInt(st.nextToken());
			sum+=now;
			max = Integer.max(max, now);
		}

		
		
		bw.write((double)(100*sum/max)/n + "\n");
		
		br.close();
		bw.close();
	}
}
