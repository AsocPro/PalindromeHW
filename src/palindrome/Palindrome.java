/**
 * Name: Zachary Pratt Gibbs
 * Assignment: 
 */
package palindrome;

import java.util.Scanner;
import java.util.Stack;

public class Palindrome
{
    /**
     * Test to see if a string is a palindrome.
     * @param word The string to test if it is a palindrome
     * @return true if word is a palindrome or false if it isn't
     */
    public static boolean isPalindrome(String word)
    {
        word = word.toLowerCase().replaceAll("\\W", "");
        int length = word.length();
        char[] wordChar = word.toCharArray();
        Stack<Character> stk = new Stack<>();
        
        for(int index = 0; index < length; index++)
        {
            stk.push(wordChar[index]);
        }
        for(int index = 0; index < length; index++)
        {
            if(stk.pop() == wordChar[index])
            {
                //nada
            }
            else
            {
                return false;
            }
        }
        return true;
    }
    /**
     * Main method to get input from a user to test for a palindrome.
     */
    public static void main(String[] args)
    {
        Scanner scr = new Scanner(System.in);
        String another = "y";
        String word = "";
        while(another.equalsIgnoreCase("y"))
        {
            System.out.println("Please input a string to test if it is a palindrome");
            word = scr.nextLine();
            System.out.print("\"" + word + "\" is ");
            if(!isPalindrome(word))
            {
                System.out.print("not ");
            }
            System.out.println("a palindrome.");
            System.out.println("Would you like to play again? (y/n) [y]");
            another = scr.nextLine();
            if(another.equals(""))
            {
                another = "y";
            }
        }
    }
}
