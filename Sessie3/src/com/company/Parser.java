package com.company;

import java.util.Stack;

public class Parser {
    private Stack<Character> stackHaakje;

    public Parser ()
    {
        stackHaakje = new Stack();
    }

    public boolean Parse(String testString)
    {

        for(char c : testString.toCharArray())
        {
            if(c=='(' || c=='[' || c=='{')
                stackHaakje.push(c);

            else if (c==')' || c==']' || c=='}') {

                switch(c)
                {
                    case ')':

                        if( stackHaakje.peek()==c)
                            stackHaakje.pop();
                        break;

                    case ']':
                        if ( stackHaakje.peek()==c)
                            stackHaakje.pop();
                        break;

                    case '}':
                        if (stackHaakje.peek()==c)
                            stackHaakje.peek();
                        break;

                    default:
                        return false;


                }


            }

        }
        return stackHaakje.empty();
    }

}
