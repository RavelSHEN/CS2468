/*
 * ParenArray.java
 */

import java.io.*;
import java.util.Scanner;

public class ParenArray {
    

    //check if c1 and c2 are matching symbols
    public boolean isMatching(char c1, char c2) {
        if (c1=='(' && c2==')')
            return true;
        if (c1=='[' && c2==']')
            return true;
        return false;
    }
    
    public boolean isParenMatch(String X) {
        ArrayStack S = new ArrayStack(); 
        for (int i=0; i< X.length(); i++) {
            char symbol = X.charAt(i);
            if (symbol == '(' || symbol =='[')  { //if symbol is an opening symbol
                S.push( new Character(symbol) );
                System.out.println("Push "+symbol);
            }
            else if ( symbol == ')' || symbol == ']' ) {   // if symbol is an closing symbol
                if (S.isEmpty()) 
                    return false;
                
                char popSymbol = ((Character)S.pop()).charValue();
                System.out.println("POP " + popSymbol);
                if ( ! isMatching( popSymbol, symbol) )
                    return false;
            }
        }
        if (S.isEmpty())
            return true;
        else
            return false;
    }
    
    // Tester Method
    public static void main (String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please input a sequence:");
        String line = scanner.nextLine();
        scanner.close();
        
        ParenArray paren= new ParenArray();
        if ( paren.isParenMatch(line) )
            System.out.println("The parentheses in the input sequence MATCH!");
        else
            System.out.println("The parentheses in the input sequence DO NOT MATCH!");
    }
}
