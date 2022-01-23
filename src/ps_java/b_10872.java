package ps_java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class b_10872 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int ans[] = new int[13];
		ans[0] = 1;
		int input = Integer.parseInt(br.readLine());
		
		for(int i = 1; i<=input; i++)
			ans[i] = ans[i-1]*i;
		bw.write(ans[input] + "\n");
		
		br.close();
		bw.close();
	}
}
