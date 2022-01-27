package ps_java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class b_9012 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t= Integer.parseInt(br.readLine());
		
		while(t-->0) {
			Stack<Integer> s = new Stack<>();
			String input = br.readLine();
			boolean possible = true;
			for(int i = 0; i<input.length(); i++) {
				char c = input.charAt(i);
				
				if(c=='(') {
					s.push(1);
				}else if(c==')'){
					if(s.empty()) {
						possible = false;
						break;
					}
					s.pop();
				}
			}
			
			System.out.println((possible && s.empty()) ? "YES" : "NO");
		}
	}
}
