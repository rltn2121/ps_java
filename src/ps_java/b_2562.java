package ps_java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class b_2562 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int max = -1;
		int maxIdx = 0;
		for(int i = 0; i<9; i++) {
			int now = Integer.parseInt(br.readLine());
			if(now > max) {
				max = now;
				maxIdx = i;
			}
		}
		
		bw.write(max + "\n" + (maxIdx+1));
		br.close();
		bw.close();
	}
}
