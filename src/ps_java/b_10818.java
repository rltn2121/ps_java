package ps_java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class b_10818 {

	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int n= Integer.parseInt(br.readLine());
		
		String input = br.readLine();
		StringTokenizer st = new StringTokenizer(input, " ");
		for(int i = 0; i<n; i++) {
			int now = Integer.parseInt(st.nextToken());
			max = Integer.max(max, now);
			min = Integer.min(min, now);
			
		}
		bw.write(min + " " + max + "\n");
		br.close();
		bw.close();
	}

}
