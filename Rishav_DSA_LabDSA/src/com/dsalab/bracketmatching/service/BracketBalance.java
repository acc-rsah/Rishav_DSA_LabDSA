package com.dsalab.bracketmatching.service;

import java.util.Stack;

public class BracketBalance {
	public static boolean checkBalancedBracket(String bracketExpression) {
		Stack<Character> bStack = new Stack<Character>();
		int len = bracketExpression.length();
		for (int i = 0; i < len; i++) {
			char bracketChar = bracketExpression.charAt(i);
			if (bracketChar == '(' || bracketChar == '[' || bracketChar == '{') {
				bStack.push(bracketChar);
				continue;
			}
			if (bStack.isEmpty()) {
				return false;
			}
			char bracket;
			switch (bracketChar) {
			case '}':
				bracket = bStack.pop();
				if (bracket == '(' || bracket == '[')
					return false;
				break;
			case ')':
				bracket = bStack.pop();
				if (bracket == '{' || bracket == '[')
					return false;
				break;
			case ']':
				bracket = bStack.pop();
				if (bracket == '(' || bracket == '{')
					return false;
				break;
			}
		}
		return (bStack.isEmpty());
	}
}
