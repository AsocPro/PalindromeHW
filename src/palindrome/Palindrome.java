/**
 * Name: Zachary Pratt Gibbs
 * Assignment: Palindrome
 * File: Palindrome.java
 * Date: March 25, 2013
 * 
 * Description: This program tests a string to see if it is a palindrome.
 * It turns the string into a array of characters and puts it into
 * a Stack and a Queue and then takes them off one by one comparing them to each
 * other. As the first on is the last off with the stack and the first off with
 * the queue if they are equal then the string is a palindrome.
 */
package palindrome;

import java.util.Scanner;
import java.util.Stack;
import java.util.concurrent.LinkedTransferQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        LinkedTransferQueue<Character> que = new LinkedTransferQueue<>();
        
        for(int index = 0; index < length; index++)
        {
            stk.push(wordChar[index]);
            que.add(wordChar[index]);
        }
        for(int index = 0; index < length; index++)
        {
            try {
                if(stk.pop() == que.take())
                {
                    //nada
                }
                else
                {
                    return false;
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(Palindrome.class.getName()).log(Level.SEVERE, null, ex);
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
