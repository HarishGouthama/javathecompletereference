package com.Chapter9Packagesandinterfaces.programs;

import java.util.Random;

class Question implements SharedConstants{
	Random rand = new Random();
	int ask() {
		int prob = (int) (100 * rand.nextDouble());
		System.out.println(prob);
		if(prob < 30)
			return NO;
		else if (prob < 60)
			return YES;
		else if(prob < 75)
			return LATER;
		else if(prob < 98)
			return SOON;
		
		else
			return NEVER;
	}

}

class AskMe implements SharedConstants{
	static void answer(int result) {
		switch(result) {
		case NO:
			System.out.println("NO");
			break;
		case YES:
			System.out.println("YES");
			break;
		case MAYBE:
			System.out.println("MAYBE");
			break;
		case LATER:
			System.out.println("Later");
			break;
		case SOON:
			System.out.println("Soon");
			break;
		case NEVER:
			System.out.println("NEVER");
			break;
		}
	}
	
	public static void main(String[] args) {
		Question q = new Question();
		answer(q.ask());
		answer(q.ask());
		answer(q.ask());
		answer(q.ask());		
	}
}
