/**
 * Created by jessie on 15-8-14.
 */

/**
 * enter 3 integers x,y,z
 * array them from min to max
 */

import java.util.Scanner;

public class NumberComparer {

    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please enter the value of 'x':");
        Integer x = scanner.nextInt();
        System.out.print("Please enter the value of 'y':");
        Integer y = scanner.nextInt();
        System.out.print("Please enter the value of 'z':");
        Integer z = scanner.nextInt();
        
        int n;
        if (x>y){
          swap(x,y);
        }
        if (y>z){
          swap(z,y);
        }
        if (x>y){
         swap(x,y);
        }
        
        System.out.println("arry x,y,z from min to max is:"+" "+x+" "+y+" "+z);
    }
    
    private static void swap(Integer x, Integer  y)
    {
        if (x==y) 
        {
            return;
        }
        
        Integer tmp;
        tmp=x;
        x=y;
        y=tmp;
    }
    
}
