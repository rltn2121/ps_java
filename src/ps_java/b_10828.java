package ps_java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class b_10828 {
	public static void main(String[] args) throws Exception{
		Stack<Integer> s = new Stack<>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0) {
			String input = br.readLine(); 
			StringTokenizer st = new StringTokenizer(input);
			String cmd = st.nextToken();
			if(cmd.equals("push")) {
				int n = Integer.parseInt(st.nextToken());
				s.push(n);
			} else if(cmd.equals("pop")) 
				System.out.println(s.empty()?-1:s.pop());
			 else if(cmd.equals("size")) 
				System.out.println(s.size());
			 else if(cmd.equals("empty")) 
				System.out.println(s.empty() ? 1 : 0);
			 else if(cmd.equals("top")) 
				System.out.println(s.empty()?-1:s.peek());
		}
		
		br.close();
	}
}
