package com.Chapter12Enumerations.programs;

import java.util.Random;

//An improved version of the "Decision Maker"
//Program from chapter 9. This version uses an
//enum, rather than interface variables , to
//represent the answers

//An Enumeration of the possible answers.
enum Answers
{
	NO , YES , MAYBE , LATER , SOON , NEVER
}

class Question
{
	Random rand = new Random();
	Answers ask()
	{
		int prob = (int) (100 * rand.nextDouble());
		System.out.println(prob);
		
		if(prob < 15)
			return Answers.MAYBE;
		
		
		else if(prob < 30)
			return Answers.NO;
		
		else if(prob < 60)
			return Answers.YES;
		
		else if(prob < 75)
			return Answers.LATER;
		
		else if(prob < 98)
			return Answers.SOON;
		
		else
			return Answers.NEVER;
		
		
	}
	
	
}

public class AskMe {
	static void answer(Answers result)
	{
		switch(result)
		{
		case NO: 
			System.out.println("No");
			break;
		
		case YES:
			System.out.println("Yes");
			break;
			
		case MAYBE:
			System.out.println("Maybe");
			break;
			
		case LATER:
			System.out.println("LATER");
			break;
			
		case SOON:
			System.out.println("SOON");
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
