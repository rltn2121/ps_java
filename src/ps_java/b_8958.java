package ps_java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class b_8958 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0){
			String input = br.readLine();
			int score = 0;
			int sum = 0;
			
			for (int i = 0; i < input.length(); i++) {
				if(input.charAt(i)=='O') 
					sum += ++score;
				else
					score = 0;
			}
			
			
			bw.write(sum + "\n");
		}
		
		br.close();
		bw.close();
	}
}
