package com.celestial;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Keyboard Handler
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String lineRead;
        Scanner sc = new Scanner(System.in);
        String [] lines = new String[3];
        int growBy = 3;
        
        
        try
        {
            for( int x =0; (x<lines.length && prompt() && (lineRead = sc.next()) != null );x++)
            {
            	lines[x] = lineRead;
                System.out.println(lineRead);
                if(x== lines.length-1){
                    lines = Arrays.copyOf(lines,lines.length+growBy);
                }
                if(lineRead.equalsIgnoreCase("quit")){
                    break;
                }

                for (String line :lines){
                    System.out.println(line);
                }
            }
        }catch( NoSuchElementException e )
        {}
        for(String line : lines){
            System.out.println(line);
        }
    }
    
    static private boolean prompt()
    {
        System.out.print("Enter a message:");
        return true;
    }
}
