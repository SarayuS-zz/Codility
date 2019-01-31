/*
 * Given a sentence S containing N characters, return the maximum number of words in the 
 * sentence. 
 * 
 * For example, Given S = "Forget  CVs..Save time . x x", the function should return 2.
 * 
 */

package com.SentenceLength;

public class Main {
	public void solution(String S) {
		int temp_length, length = 0;
		String delim = "[.?!]";
		String spl[] = S.split(delim);
		for(String s: spl) {
			s = s.replaceAll("\\s+"," ");
			temp_length = s.trim().split(" ").length;
			if(temp_length > length) {
				length = temp_length;
			}
		}
		System.out.println(length);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S = "We test coders. Give us a try?";
		Main m = new Main();
		m.solution(S);
	}

}
