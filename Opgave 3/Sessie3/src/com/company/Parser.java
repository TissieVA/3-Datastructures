package com.company;

import java.util.Stack;

public class Parser {
    private Stack<Character> StackBracket;

    public Parser ()
    {
        StackBracket = new Stack();

    }

    public boolean parse(String testString)
    {

        for(char c : testString.toCharArray())
        {
            if(c=='(' || c=='[' || c=='{')
                StackBracket.push(c);

            else if (c==')' || c==']' || c=='}') {

                switch(c)
                {
                    case ')':

                        if( StackBracket.peek()=='(')
                            StackBracket.pop();
                        break;

                    case ']':
                        if ( StackBracket.peek()=='[')
                            StackBracket.pop();
                        break;

                    case '}':
                        if (StackBracket.peek()=='{')
                            StackBracket.pop();
                        break;

                    default:
                        return false;

                }

            }

        }
        return StackBracket.empty();
    }

}
