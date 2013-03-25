package palindrome;

public class Palindrome
{
    public static boolean isPalindrome(String frase)
	{
        Iterator itr = new Iterator(word);
		Stack stk = new Stack();
		Queue que = new Queue();
		while(itr.hasNext())
		{
			char letter = itr.nextChar();
			if(letter == " ")
			{
				
			}
			else
			{
				stk.push(letter);
				que.insert(letter);
			}
		}
		for(int index = 0; index < word.length; index++)
		{
			if(stk.pop() == que.remove())
			{
				
			}
			else
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args)
	{
		
	}
}
