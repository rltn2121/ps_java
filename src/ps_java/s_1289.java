package ps_java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class s_1289 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	static String input;
	public static void main(String[] args) throws Exception{
		input = br.readLine();
		st = new StringTokenizer(input, " ");
		
		
		int t = Integer.parseInt(st.nextToken());
		for(int tc = 1; tc<=t; tc++) {
			int ans = 0;
			input = br.readLine();
			
			
			char current = '0';
			for(int i = 0; i<input.length(); i++) {
				if(input.charAt(i) != current)
					ans++;
				current = input.charAt(i);
			}
			
			bw.write("#" + tc + " " + ans + "\n");
		}
		br.close();
		bw.close();
	}
}
