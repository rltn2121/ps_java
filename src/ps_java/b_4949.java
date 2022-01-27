package ps_java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class b_4949 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			Stack<Integer> s = new Stack<>();
			String input = br.readLine();
			if(input.equals(".")) break;
			boolean flag = true;
			for(int i = 0; i<input.length(); i++) {
				char c = input.charAt(i);
				
				if(c=='(') {
					s.push(1);
				} else if(c==')') {
					if(s.empty() || s.peek() != 1) {
						flag = false;
						break;
					}
					s.pop();
				}else if(c=='[') {
					s.push(2);
				}else if(c==']') {
					if(s.empty() || s.peek() != 2) {
						flag = false;
						break;
					}
					s.pop();
				}
				
			}
			System.out.println((flag && s.empty()) ? "yes" : "no");
		}
	}
}
