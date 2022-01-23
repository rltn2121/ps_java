package ps_java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class b_4344 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0) {
			String input = br.readLine();
			StringTokenizer st = new StringTokenizer(input);
			
			
			int n = Integer.parseInt(st.nextToken());
			int sum = 0;
			double avg = 0.0;
			int arr[] = new int[1001];
			for(int i = 0; i<n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
				sum += arr[i];
			}
			avg = (double)sum / n;
			int cnt = 0;
			for(int i = 0; i<n; i++) {
				if(arr[i] > avg)
					cnt++;
			}
			String ans = String.format("%.3f", (double)cnt*100 / n);
			bw.write(ans + "%\n");
			
			
		}
		
		
		br.close();
		bw.close();
	}
}
