package ps_java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class b_10870 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] arr = new int[21];
		int n = Integer.parseInt(br.readLine());
		arr[0] = 0;
		arr[1] = 1;

		for(int i = 2; i<=n; i++)
			arr[i] = arr[i-1] + arr[i-2];
		
		bw.write(arr[n] + "\n");
		
		br.close();
		bw.close();
	}
}
