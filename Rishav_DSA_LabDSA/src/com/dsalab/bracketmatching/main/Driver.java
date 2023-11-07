package com.dsalab.bracketmatching.main;

import com.dsalab.bracketmatching.service.BracketBalance;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String bracketExpression = "(([])){}"; //Balanced Brackets
		//String bracketExpression = "((())))"; //Balanced Brackets
		Boolean result;
		result = BracketBalance.checkBalancedBracket(bracketExpression);

		if (result) {
			System.out.println("The entered strings has balanced brackets");
		} else {
			System.out.println("The entered strings do not contain balanced brackets");
		}
	}

}
